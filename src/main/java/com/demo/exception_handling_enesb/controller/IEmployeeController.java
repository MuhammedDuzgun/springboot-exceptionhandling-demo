package com.demo.exception_handling_enesb.controller;

import com.demo.exception_handling_enesb.dto.EmployeeDto;

public interface IEmployeeController {
    public EmployeeDto getEmployeeById(Long id);
}
