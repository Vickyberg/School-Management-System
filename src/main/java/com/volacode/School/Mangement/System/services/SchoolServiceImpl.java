package com.volacode.School.Mangement.System.services;


import com.volacode.School.Mangement.System.data.dtos.request.CreateSchoolRequest;
import com.volacode.School.Mangement.System.data.dtos.response.CreateSchoolResponse;
import com.volacode.School.Mangement.System.data.models.Address;
import com.volacode.School.Mangement.System.data.models.School;
import com.volacode.School.Mangement.System.data.repositories.SchoolRepository;
import com.volacode.School.Mangement.System.exceptions.SchoolManagementSystemException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class SchoolServiceImpl implements  SchoolService {

    private final SchoolRepository schoolRepository;
    private final  ModelMapper modelMapper = new ModelMapper();
    @Override
    public CreateSchoolResponse createSchool(CreateSchoolRequest request)throws SchoolManagementSystemException {

        Optional<School> foundSchool =schoolRepository.findById(request.getId());
        if(foundSchool.isPresent())throw new SchoolManagementSystemException(
            String.format("School with %s Already Exist",request.getId()));

        School school =modelMapper.map(request,School.class);
        setSchoolAddress(request,school);
        School savedSchool = schoolRepository.save(school);
        log.info("school to be saved in db :: {}",savedSchool);
        return createSchoolResponseBuilder(savedSchool);
    }

    private CreateSchoolResponse createSchoolResponseBuilder(School savedSchool) {
    return CreateSchoolResponse.builder()
            .message("success")
            .id(savedSchool.getId())
            .code(201)
            .build();
    }

    private void setSchoolAddress(CreateSchoolRequest request, School school) {
        Address schoolAddress = new Address();
        schoolAddress.setState(request.getState());
        schoolAddress.setCity(request.getCity());
        school.getAddresses().add(schoolAddress);

    }
}
