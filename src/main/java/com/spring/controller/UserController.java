package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.repository.IUserRepo;
@RestController
@RequestMapping("/user")
public class UserController{
	@Autowired
	@Qualifier(value="NJT")
	IUserRepo rep;

	@GetMapping("/data")
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return rep.getAll();
	}

	@PostMapping("/")
	public int createUser(@RequestBody User us) {
		// TODO Auto-generated method stub
		return rep.createUser(us);
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id")int id) {
		// TODO Auto-generated method stub
		return rep.getUserById(id);
	}

	@PutMapping("/{id}")
	public int updateEmailId(@PathVariable("id") int id,@RequestBody User us) {
		// TODO Auto-generated method stub
		us.setUser_id(id);
		return rep.updateEmailId(us) ;
	}

	@DeleteMapping("/{id}")
	public int deleteUserById(@PathVariable("id")int id,@RequestBody User us) {
		// TODO Auto-generated method stub
		us.setUser_id(id);
		return rep.deleteUserById(id);
	}

	@DeleteMapping
	public int deleteAll() {
		// TODO Auto-generated method stub
		return rep.deleteAll();
	}

}
