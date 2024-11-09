package com.elementlogic.package1.controller;


import com.elementlogic.package1.model.JobPost;
import com.elementlogic.package1.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	
	@GetMapping("jobPosts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
		
	}

}
