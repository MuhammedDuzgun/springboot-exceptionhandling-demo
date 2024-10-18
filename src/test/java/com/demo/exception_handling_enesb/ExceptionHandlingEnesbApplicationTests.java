package com.demo.exception_handling_enesb;

import com.demo.exception_handling_enesb.dto.EmployeeDto;
import com.demo.exception_handling_enesb.service.IEmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExceptionHandlingEnesbApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@Test
	void contextLoads() {
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach calisti ...");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("afterEach calisti ...");
	}

	@Test
	public void testFindEmployeeById() {
		EmployeeDto employee = employeeService.getEmployeeById(1L);
		String department = employee.getDepartment().toString();
		assert (! department.equals("ankara"));
	}

}
