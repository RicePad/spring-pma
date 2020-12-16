package com.jonali.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jonali.pma.dao.ProjectRepository;
import com.jonali.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@RequestMapping("/new")
	public String displayProcessFormData(Model model) {
		
		Project aProject = new Project();
		
		model.addAttribute("project", aProject);
		
		return "projects/new-project.html";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String createProject(Project project, Model model) {
		//handle saving to the database
		proRepo.save(project);
		
		//use a redirect to prevent duplicate submissions.
		return "redirect:/projects/new";
	}
	

}
