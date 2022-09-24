package com.marlabs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.model.Policy;
@Repository
public interface PolicyRepo extends CrudRepository<Policy, Integer> {

}
