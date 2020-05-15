package com.lithan.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lithan.apps.exception.SchoolNotFoundException;
import com.lithan.apps.model.School;
import com.lithan.apps.repository.SchoolRepository;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {
	
	@Autowired
	private SchoolRepository repo;
	
	@GetMapping
	public Iterable findAll() {
		return repo.findAll();
	}
	

	
	@GetMapping("/{id}")
	public School findOne(@PathVariable Long id) throws SchoolNotFoundException{
		return (School) repo.findById(id).orElseThrow(SchoolNotFoundException::new);
		
	}
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    Iterable schools = this.findAll();
	    model.addAttribute("listSchools", schools);
	     
	    return "school";
	}
}
