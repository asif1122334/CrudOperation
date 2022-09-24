package com.marlabs.service;

import java.util.List;
import java.util.Optional;

import com.marlabs.model.Policy;

public interface PolicyService {

	public Iterable<Policy> getAllPolicy();
	public Policy savePolicy(Policy policy);
	public Optional<Policy> getPolicyById(Integer id);
	public void deleyePolicyById(Integer id);
}
