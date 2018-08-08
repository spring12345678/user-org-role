package com.spring.repository;

import java.util.List;

import com.spring.model.User;

public interface IUserRepo {
	public List<User> getAll();

	public int createUser(User us);

	public User getUserById(int id);

	public int updateEmailId(User us);

	public int deleteUserById(int id);

	public int deleteAll();

}
