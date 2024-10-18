package com.demo.exception_handling_enesb.controller.impl;

import com.demo.exception_handling_enesb.controller.IEmployeeController;
import com.demo.exception_handling_enesb.dto.EmployeeDto;
import com.demo.exception_handling_enesb.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Override
    @GetMapping("/{id}")
    public EmployeeDto getEmployeeById(@PathVariable(name = "id") Long id) {
        return employeeService.getEmployeeById(id);
    }


}
