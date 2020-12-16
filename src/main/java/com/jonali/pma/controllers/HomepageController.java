package com.jonali.pma.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonali.pma.dao.EmployeeRepository;
import com.jonali.pma.dao.ProjectRepository;
import com.jonali.pma.entities.Employee;
import com.jonali.pma.entities.Project;

@Controller
public class HomepageController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository proEmployee;
	
	@RequestMapping("/")
	public String displayHomepage(Model model) {
		
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectsList", projects);
		
		List<Employee> employees = proEmployee.findAll();
		model.addAttribute("employeesList", employees);
		
		
		return "homepage.html";
	}

}
