package com.volacode.School.Mangement.System.data.dtos.request;


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
public class CreateSchoolRequest {

    @NotNull(message = "name cannot be empty")
    @NotEmpty(message = "name cannot be empty")
    private String name;
    @NotNull(message = "address cannot be empty")
    @NotEmpty(message = "address cannot be empty")
    private String address;


}
