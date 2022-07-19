package com.great.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.great.employeemanager.entity.Employee;
import com.great.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeCreateServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void registerAnEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
}