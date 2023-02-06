package com.volacode.School.Mangement.System.services;


import com.volacode.School.Mangement.System.data.dtos.request.CreateSchoolRequest;
import com.volacode.School.Mangement.System.data.dtos.response.CreateSchoolResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SchoolServiceImpl implements  SchoolService {
    @Override
    public CreateSchoolResponse createSchool(CreateSchoolRequest request) {
        return null;
    }
}
