package com.wocwithoneclick.wocwithoneclick.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wocwithoneclick.wocwithoneclick.Models.User;
import com.wocwithoneclick.wocwithoneclick.Services.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@PostMapping("/adduser") 
    public ResponseEntity<User> addUser(@RequestBody User user) { 
		return new ResponseEntity<>(userServiceImpl.saveUser(user),HttpStatus.OK); 
    } 
  
    @GetMapping("/findall") 
    public List<User> getAllUser() { 
        return userServiceImpl.getUser();
    } 
  
    @GetMapping("/findbyid/{userId}") 
    public  ResponseEntity<User> getUserById(@PathVariable long userId) { 
        return  new ResponseEntity<>(userServiceImpl.getUser(userId), HttpStatus.OK); 
    } 
    
    @GetMapping("/finduser/{email}/{password}")
    public ResponseEntity<User> getUserByEmailPassword(@PathVariable("email") String email, @PathVariable("password") String password){
    	return new ResponseEntity<>(userServiceImpl.getUserByEmailPassword(email, password), HttpStatus.OK);
    }
  
    @PutMapping("/user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable long userId, @RequestBody User user) {
        User updatedUser = userServiceImpl.updateUser(userId, user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteuser/{id}")
    public  ResponseEntity<User> deleteUser(@PathVariable long id) {
    	return  new ResponseEntity<>(userServiceImpl.deleteUser(id), HttpStatus.OK);
    }
}
