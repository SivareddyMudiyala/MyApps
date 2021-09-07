package com.myapps.empmanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.empmanagement.Repository.EmployeeRepository;
import com.myapps.empmanagement.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	//@Autowired
	//private EmployeeModel employeemodel;
	@Autowired
	private EmployeeRepository employeeRepository;
	//private Employee employee;

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	@Override
	public void saveemp(Employee employee) {
		this.employeeRepository.save(employee);
		
	}
	

}
