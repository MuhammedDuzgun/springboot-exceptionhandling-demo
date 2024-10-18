package com.demo.exception_handling_enesb.service.impl;

import com.demo.exception_handling_enesb.dto.DepartmentDto;
import com.demo.exception_handling_enesb.dto.EmployeeDto;
import com.demo.exception_handling_enesb.entity.Department;
import com.demo.exception_handling_enesb.entity.Employee;
import com.demo.exception_handling_enesb.exception.BaseException;
import com.demo.exception_handling_enesb.exception.ErrorMessage;
import com.demo.exception_handling_enesb.exception.MessageType;
import com.demo.exception_handling_enesb.repository.IEmployeeRepository;
import com.demo.exception_handling_enesb.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        DepartmentDto departmentDto = new DepartmentDto();
        EmployeeDto employeeDto = new EmployeeDto();

         Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
        }

        Employee employee = optionalEmployee.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, employeeDto);
        BeanUtils.copyProperties(department, departmentDto);

        employeeDto.setDepartment(departmentDto);

        return employeeDto;
    }
}
