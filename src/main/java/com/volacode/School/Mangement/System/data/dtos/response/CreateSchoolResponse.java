package com.volacode.School.Mangement.System.data.dtos.response;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class CreateSchoolResponse {
    @Id
    private Long id;
    private String message;
    private int code;
}
