package com.volacode.School.Mangement.System.data.dtos.request;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Validated
@Entity
public class CreateSchoolRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String id;

    @NotNull(message = "name cannot be null")
    @NotEmpty(message = "name cannot be empty")
    private String name;
    @NotNull(message = "state cannot be null")
    @NotEmpty(message = "state cannot be empty")
    private String state;
    @NotEmpty(message = "city cannot be empty")
    @NotNull(message = "city cannot be null")
    private String city;



}
