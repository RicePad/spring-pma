package com.jonali.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jonali.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@RequestMapping("/new")
	public String displayProcessFormData(Model model) {
		
		Project aProject = new Project();
		
		model.addAttribute("project", aProject);
		
		return "new-project.html";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String createProject(Model model) {
		//handle saving to the database
		
		
		return "";
	}
	

}
