package com.myapps.empmanagement.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.myapps.empmanagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
