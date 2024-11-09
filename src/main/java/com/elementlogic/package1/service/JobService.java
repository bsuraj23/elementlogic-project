package com.elementlogic.package1.service;


import com.elementlogic.package1.model.JobPost;
import com.elementlogic.package1.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	


	
	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		//return repo.getAllJobs();


        return List.of();
    }
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.addJobPost(jobPost);
	
	}

	
}
