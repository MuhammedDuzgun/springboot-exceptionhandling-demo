package com.demo.exception_handling_enesb.service;

import com.demo.exception_handling_enesb.dto.EmployeeDto;
import com.demo.exception_handling_enesb.entity.Employee;

public interface IEmployeeService {
    EmployeeDto getEmployeeById(Long id);
}
