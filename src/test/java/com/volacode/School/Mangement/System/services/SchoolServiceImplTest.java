package com.volacode.School.Mangement.System.services;

import com.volacode.School.Mangement.System.data.dtos.request.CreateSchoolRequest;
import com.volacode.School.Mangement.System.data.dtos.response.CreateSchoolResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class SchoolServiceImplTest {

    @Autowired
    private SchoolService schoolService;
    CreateSchoolRequest createSchoolRequest;
    CreateSchoolResponse createSchoolResponse;

    @BeforeEach
    void setUp() {
            createSchoolRequest =CreateSchoolRequest
                    .builder()
                    .id(createSchoolRequest.getId())
                    .name("Olamide School")
                    .state("Olamide State")
                    .city("Olamide city")
                    .build();
    }


    @AfterEach
    void tearDown() {

    }

    @Test
    void testThatWeCanCreateSchool() {

        createSchoolResponse = schoolService.createSchool(createSchoolRequest);
        assertThat(createSchoolResponse).isNotNull();
        assertThat(createSchoolResponse.getMessage()).isNotNull();
        assertThat(createSchoolResponse.getId()).isNotNull();
        assertThat(createSchoolResponse.getCode()).isEqualTo(201);


    }
}