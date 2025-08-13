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

import com.project.Telecom.Dto.UserDto;
import com.project.Telecom.Entity.User;
import com.project.Telecom.Exceptions.UserNotFoundException;
import com.project.Telecom.Service.UserService;


@RestController
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	ModelMapper modelMapper;
	
	@PostMapping("/add")
	public void add(UserDto userdto) {
		User user=modelMapper.map(userdto, User.class);
		userService.add(user);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") Long id,@RequestBody UserDto userDto)  throws Exception{
		userService.updateuser(id,modelMapper.map(userDto, User.class));
		return "updated";
	}
	
	@GetMapping("/getall")
	public List<UserDto> getAllUsers() {
		List<User> userList= userService.getAllUsers();
		return userList.stream().map(User->modelMapper.map(User,UserDto.class)).collect(Collectors.toList());

	}
	
	@DeleteMapping("/User/{id}")
	public String deleteProduct(@PathVariable("id") Long id) throws UserNotFoundException {
		userService.deleteUser(id);
		return "deleted";
	}
}
