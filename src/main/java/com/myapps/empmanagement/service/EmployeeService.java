package com.myapps.empmanagement.service;



import java.util.List;
import org.springframework.stereotype.Service;
import com.myapps.empmanagement.model.*;

@Service
public interface EmployeeService {
	List<Employee> getAllEmployees();

	void saveemp(Employee employee);
	
	
	

}
