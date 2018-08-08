package com.spring.repository;

import java.util.List;

import com.spring.model.Organization;

public interface IOrgRepo {
	public List<Organization> getAll();

	public Organization getOrgById(int id);

	public int createOrg(Organization org);

	public int updateName(Organization org);

	public int deleteOrgById(int id);

	public int deleteOrgAll();

}
