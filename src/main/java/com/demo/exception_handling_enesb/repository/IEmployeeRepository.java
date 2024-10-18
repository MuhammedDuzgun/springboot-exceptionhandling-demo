package com.demo.exception_handling_enesb.repository;

import com.demo.exception_handling_enesb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
