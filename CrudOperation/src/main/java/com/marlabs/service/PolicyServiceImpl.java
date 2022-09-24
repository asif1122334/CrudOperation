package com.marlabs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.model.Policy;
import com.marlabs.repository.PolicyRepo;
@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepo policyRepo;
	
	@Override
	public Iterable<Policy> getAllPolicy() {
		 
		return policyRepo.findAll();
	}

	@Override
	public Policy savePolicy(Policy policy) {
	 
		return policyRepo.save(policy);
	}

	@Override
	public Optional<Policy> getPolicyById(Integer id) {
		return policyRepo.findById(id);
		 
 	}

	@Override
	public void deleyePolicyById(Integer id) {
		 
		policyRepo.deleteById(id);
	}

}
