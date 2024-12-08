package com.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.User;

@RestController
public class UserController {
	
	
	// Get String for User REST API
	@GetMapping("/user")
	public String getUser() {
		return "Asif Khan is a Senior Software Engineer";
	}
     
	// Get Single User REST API
	@GetMapping("/single/user")
	public List<User> getSingleUser() {
		List<User> user = new ArrayList<>();
		User dummyUser = new User(1,"Asif", "Khan", "asif786@gmail.com","123456"); 
		user.add(dummyUser);
		return user;
	}
	
	// Get All User REST API
	@GetMapping("/allusers")
	public List<User> getAllUsers() {
		List<User> user = new ArrayList<>();
		User dummyUser = new User(1,"Asif", "Khan", "asif786@gmail.com","123456"); 
		User dummyUser1 = new User(2,"Arif", "Khan", "arif786@gmail.com","123456");
		User dummyUser2 = new User(3,"Nazim", "Khan", "nazim786@gmail.com","123456");
		User dummyUser3 = new User(4,"Nazim", "Khan", "nasir786@gmail.com","123456");
		user.add(dummyUser);
		user.add(dummyUser1);
		user.add(dummyUser2);
		user.add(dummyUser3);
		return user;
	}
	
	// Get UserBy id REST API
		@GetMapping("/user/{userId}")
		public User getUserById(@PathVariable("userId") Integer id ) {
			User dummyUser = new User(5,"Asif", "Khan", "asif786@gmail.com","123456");
			User dummyUser1 = new User(6,"Arif", "Khan", "arif786@gmail.com","123456");
			dummyUser.setId(id);
			dummyUser1.setId(id);
			return dummyUser1;
		}
		
   // Create User REST API
		@PostMapping("/createUser")
		public User createUser(@RequestBody User user) {
			User dummyUser2 = new User();
			dummyUser2.setId(user.getId());
			dummyUser2.setFirstName(user.getFirstName());
			dummyUser2.setLastName(user.getLastName());
			dummyUser2.setEmail(user.getEmail());
			dummyUser2.setPassword(user.getPassword());
			return dummyUser2;
		}
		
		// Update User REST API
		 @PutMapping("/updateUser")
		 public User updateUser(@RequestBody User user) {
			 User dummyUser3 = new User(5,"Asif", "Khan", "asif786@gmail.com","123456");
			 
			 if(user.getId()!=null) {
				 dummyUser3.setId(user.getId());
			 }
			 
			 if(user.getFirstName()!=null) {
				 dummyUser3.setFirstName(user.getFirstName());
			 }
			 
			 if(user.getLastName()!=null) {
				 dummyUser3.setLastName(user.getLastName());
			 }
			 
			 if(user.getEmail()!=null) {
				 dummyUser3.setEmail(user.getEmail());
			 }
			 
			 if(user.getPassword()!=null) {
				 dummyUser3.setPassword(user.getPassword());
			 }
			 return dummyUser3;
		 }
		 
		 // Delete User REST API
		 @DeleteMapping("/deleteUser/{userId}")
		 public String deleteUser(@PathVariable("userId") Integer id) {
			 return "User Delete Successfully With id : "+id ;
		 }
}
