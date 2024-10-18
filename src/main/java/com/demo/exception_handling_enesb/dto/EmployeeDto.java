package com.demo.exception_handling_enesb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String name;
    private DepartmentDto department;
}
