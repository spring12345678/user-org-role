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

import com.spring.model.Role;
import com.spring.repository.IRoleRepo;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	@Qualifier("KLM")
	IRoleRepo namedRoleRepo;

	@GetMapping("/data")
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return namedRoleRepo.getAll();
	}

	@GetMapping("/{id}")
	public Role getRoleById(@PathVariable int id) {
		// TODO Auto-generated method stub
	
		return namedRoleRepo.getRoleById(id);
	}

	@PostMapping("/")
	public int createRole(@RequestBody Role res) {
		// TODO Auto-generated method stub
		return namedRoleRepo.createRole(res);
	}

	@PutMapping("/{id}")
	public int updateRoleByCode(@PathVariable("id") int id,@RequestBody Role req) {
		// TODO Auto-generated method stub
		req.setRole_id(id);
		return namedRoleRepo.updateRoleByCode(req);
		
	}

	@DeleteMapping("/{id}")
	public int deleteRoleById(@PathVariable("id")int id,@RequestBody Role rol) {
		// TODO Auto-generated method stub
		rol.setRole_id(id);
		return namedRoleRepo.deleteRoleById(id);
	}

	@DeleteMapping
	public int deleteRoleAll() {
		// TODO Auto-generated method stub
		return namedRoleRepo.deleteRoleAll();
	}

}
