package com.marlabs.controller;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.model.Policy;
import com.marlabs.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	@Autowired
	private PolicyService policyService;

	@GetMapping("/allPolicy")
	public @ResponseBody Iterable<Policy> getAllPolicy( ){
		return  policyService.getAllPolicy();
		 
	}
	
	@PostMapping("/save")
	public Policy createPolicy(@RequestBody Policy policy){
		return policyService.savePolicy(policy);
 
	}
	
}
