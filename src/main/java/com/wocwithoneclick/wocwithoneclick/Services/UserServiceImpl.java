package com.wocwithoneclick.wocwithoneclick.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;

import com.wocwithoneclick.wocwithoneclick.Models.*;
import com.wocwithoneclick.wocwithoneclick.Repositories.UserRepository;


@Service
public class UserServiceImpl{
	
	@Autowired
	private UserRepository userRepository;


	HashSet<User> userList = new HashSet<User>(); 
	
	public User saveUser(User user) {
		return userRepository.save(user);
	   }


	   public User getUser(long userId) {
	       return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Not Found"));
	   }


	   public List<User> getUser() {
	       return userRepository.findAll();
	   }


	   public User updateUser(long userId, User user) {
	       User existingUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Not Found"));
	       existingUser.setFirstname(user.getFirstname());
	       existingUser.setLastname(user.getLastname());
	       existingUser.setEmail(user.getEmail());
	       existingUser.setAddress(user.getAddress());
	       existingUser.setPassword(user.getPassword());
	       existingUser.setBase64Image(user.getBase64Image());
	       userRepository.save(existingUser);
	       return existingUser;
	   }


	   public User deleteUser(long userId) {
	       User existingUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Not Found"));
	       userRepository.deleteById(userId);
	       return existingUser;
	   }


	   public User getUserByEmailPassword(String email, String password) {
	       return userRepository.findByEmailPassword(email, password);
	    }	
    
}
