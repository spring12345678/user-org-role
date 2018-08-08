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
import com.spring.model.Organization;
import com.spring.repository.IOrgRepo;
@RestController
@RequestMapping("/organize")
public class OrgController{
	@Autowired
	@Qualifier("ABCD")
	IOrgRepo org;

	@GetMapping("/data")
	public List<Organization> getAll() {
		// TODO Auto-generated method stub
		return org.getAll();
	}

	@GetMapping("/{id}")
	public Organization getOrgById(@PathVariable("id")int id) {
		// TODO Auto-generated method stub
		return org.getOrgById(id);
	}

	@PostMapping("/")
	public int createOrg(@RequestBody Organization or) {
		// TODO Auto-generated method stub
		return org.createOrg(or);
	}

	@PutMapping("/{id}")
	public int updateName(@PathVariable("id") int id,@RequestBody Organization or) {
		// TODO Auto-generated method stub
		or.setOrg_id(id);
		return org.updateName(or);
	}

	@DeleteMapping("/{id}")
	public int deleteOrgById(@PathVariable("id") int id,@RequestBody Organization or) {
		// TODO Auto-generated method stub
		or.setOrg_id(id);
		return org.deleteOrgById(id);
		

	}

	@DeleteMapping
	public int deleteOrgAll() {
		// TODO Auto-generated method stub
		return org.deleteOrgAll();
	}

}
