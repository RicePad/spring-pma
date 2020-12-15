package com.jonali.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jonali.pma.dao.EmployeeRepository;
import com.jonali.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@RequestMapping("/new")
	public String displayEmployeeFormData(Model model) {
		
		Employee anEmployee = new Employee();
		
		model.addAttribute("employee", anEmployee );
		
		
		return "new-employee.html";
	}
	
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String createEmployee(Employee employee, Model model) {
		//save employee data into database
		employeeRepo.save(employee);
		
		return "redirect:/employees/new";
	}
	
}
