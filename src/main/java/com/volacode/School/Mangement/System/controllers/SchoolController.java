package com.volacode.School.Mangement.System.controllers;


import com.volacode.School.Mangement.System.data.dtos.request.CreateSchoolRequest;
import com.volacode.School.Mangement.System.services.SchoolService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping("/createSchool")
    private ResponseEntity<?> createSchool(@RequestBody CreateSchoolRequest request){
return ResponseEntity.status(HttpStatus.CREATED).body(schoolService.createSchool(request));
    }
}
