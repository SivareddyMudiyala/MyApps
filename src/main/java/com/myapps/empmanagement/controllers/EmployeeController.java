package com.myapps.empmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.myapps.empmanagement.model.Employee;
import com.myapps.empmanagement.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	
	 @GetMapping("/")
	  
	  public String viewHomePage(Model model) {
	  
	  model.addAttribute("listEmployees", employeeService.getAllEmployees());
	  //System.out.println("from Interface");
	  
	  return"index"; }
	 
	
	  @GetMapping("/showform")
	  
	  public String insertEmployees(Model model) {
	  
	  Employee employee=new Employee();
	  
	  model.addAttribute("employee",employee); return "new-page";
	  
	  }
	 
	  @PostMapping("/saveemployee")
	  public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		 
		  employeeService.saveemp(employee);
		  return "redirect:/";
	  }
	  
	  
	  
	 

}
