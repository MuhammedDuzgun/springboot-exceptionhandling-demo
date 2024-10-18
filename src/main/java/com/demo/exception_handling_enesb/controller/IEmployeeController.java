package com.demo.exception_handling_enesb.controller;

import com.demo.exception_handling_enesb.dto.EmployeeDto;
import com.demo.exception_handling_enesb.entity.RootEntity;

public interface IEmployeeController {
    public RootEntity<EmployeeDto> getEmployeeById(Long id);
}
