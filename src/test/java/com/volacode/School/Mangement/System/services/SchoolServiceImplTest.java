package com.volacode.School.Mangement.System.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SchoolServiceImplTest {

    @Autowired
    private SchoolService schoolService;

    @BeforeEach
    void setUp() {
        schoolService = new SchoolServiceImpl();
    }

    @Test
    void createSchool() {
    }
}