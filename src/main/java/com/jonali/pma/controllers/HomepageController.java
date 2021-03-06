package com.jonali.pma.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonali.pma.dao.EmployeeRepository;
import com.jonali.pma.dao.ProjectRepository;
import com.jonali.pma.entities.Employee;
import com.jonali.pma.entities.Project;

@Controller
public class HomepageController {
	
	@Value("${version}")
	private String ver;
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository proEmployee;
	
	@RequestMapping("/")
	public String displayHomepage(Model model) {
		
		model.addAttribute("versionNumber", ver);
		
		List<Project> projects = proRepo.findAll();
		model.addAttribute("projectsList", projects);
		
		List<Employee> employees = proEmployee.findAll();
		model.addAttribute("employeesList", employees);
		
		
		return "main/homepage.html";
	}

}
