package com.project.Telecom.Controller;



import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Telecom.Dto.PlanDto;
import com.project.Telecom.Entity.Plan;
import com.project.Telecom.Exceptions.UserNotFoundException;
import com.project.Telecom.Service.PlanService;


@RestController
public class PlanController {
	@Autowired
	PlanService planService;
	@Autowired
	ModelMapper modelMapper;
	
	@PostMapping("/api/plans")
	public void add(PlanDto plandto) {
		Plan plan=modelMapper.map(plandto,Plan.class);
		planService.add(plan);
	}
	
	@PutMapping("/api/plans/{id}")
	public String update(@PathVariable("id") Long id,@RequestBody PlanDto planDto)  throws Exception{
		planService.updateplan(id,modelMapper.map(planDto, Plan.class));
		return "updated";
	}
	
	@GetMapping("/api/plans")
	public List<PlanDto> getAllPlan() {
		List<Plan> planList= planService.getAllPlans();
		return planList.stream().map(Plan->modelMapper.map(Plan,PlanDto.class)).collect(Collectors.toList());

	}
	
	@DeleteMapping("api/plans/{id}")
	public String deleteProduct(@PathVariable("id") Long id) throws UserNotFoundException {
		planService.deletePlan(id);
		return "deleted";
	}
}
