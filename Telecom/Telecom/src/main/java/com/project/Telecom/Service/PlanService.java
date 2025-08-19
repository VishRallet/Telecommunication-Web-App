package com.project.Telecom.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Telecom.Entity.Plan;
import com.project.Telecom.Exceptions.ResourceNotFoundException;
import com.project.Telecom.Exceptions.UserNotFoundException;
import com.project.Telecom.Repository.PlanRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlanService {
	@Autowired
	PlanRepository planRepository;
	
	public void add(Plan plan) {
		planRepository.save(plan);
	}
	
	public void  updateplan(Long id,Plan plan) throws ResourceNotFoundException {
		Plan plan1 =planRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException()); 
		plan1.setName(plan.getName());
		plan1.setPrice(plan.getPrice());
		plan1.setType(plan.getType());
		plan1.setValidity(plan.getValidity());
		plan1.setDescription(plan.getDescription());
	}

	public List<Plan> getAllPlans() {
		return (List<Plan>)planRepository.findAll();
	}
	
	public void  deletePlan(Long id) throws UserNotFoundException{
		Plan plan1=planRepository.findById(id).orElseThrow(() -> new  UserNotFoundException()); 
		if(plan1!=null)
			planRepository.deleteById(id);  
	}

}
