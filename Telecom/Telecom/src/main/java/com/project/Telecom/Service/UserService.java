package com.project.Telecom.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Telecom.Entity.User;
import com.project.Telecom.Exceptions.ResourceNotFoundException;
import com.project.Telecom.Exceptions.UserNotFoundException;
import com.project.Telecom.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public void add(User user) {
		userRepository.save(user);
	}
	
	public void  updateuser(Long id,User user) throws ResourceNotFoundException {
		User user1 =userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException()); 
		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		user1.setPhone(user.getPhone());
	}

	public List<User> getAllUsers() {
		return (List<User>)userRepository.findAll();
	}
	
	public void  deleteUser(Long id) throws UserNotFoundException{
		User user1=userRepository.findById(id).orElseThrow(() -> new  UserNotFoundException()); 
		if(user1!=null)
			userRepository.deleteById(id);  
	}

}
