package com.spring.repository;

import java.util.List;

import com.spring.model.Role;

public interface IRoleRepo {
	public List<Role> getAll();

	public Role getRoleById(int id);

	public int createRole(Role re);

	public int updateRoleByCode(Role re);

	public int deleteRoleById(int id);

	public int deleteRoleAll();

}
