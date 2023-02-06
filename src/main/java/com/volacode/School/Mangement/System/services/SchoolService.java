package com.volacode.School.Mangement.System.services;

import com.volacode.School.Mangement.System.data.dtos.request.CreateSchoolRequest;
import com.volacode.School.Mangement.System.data.dtos.response.CreateSchoolResponse;

public interface SchoolService {

    CreateSchoolResponse createSchool(CreateSchoolRequest request);
}
