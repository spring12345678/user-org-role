package com.spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.User;
import com.spring.queries.QueryBuilder;

@Repository(value = "NJT")
public class NamedUserRepo implements IUserRepo {
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		// RowMapper<User> rm=new UserRowMapper();
		return template.query(QueryBuilder.NJ_GET_ALL, new UserRowMapper());
	}

	@Override
	public int createUser(User us) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src = new MapSqlParameterSource();
		src.addValue("K_USER_ID", us.getUser_id());
		src.addValue("K_EMAIL", us.getEmail());
		src.addValue("K_PASSWORD", us.getPassword());
		return template.update(QueryBuilder.NJ_INSERT, src);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src = new MapSqlParameterSource();
		src.addValue("K_USER_ID", id);
		return template.queryForObject(QueryBuilder.NJ_GET_USER_BY_ID, src, new UserRowMapper());
	}

	@Override
	public int updateEmailId(User us) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src = new MapSqlParameterSource();
		src.addValue("K_USER_ID", us.getUser_id());
		src.addValue("K_EMAIL", us.getEmail());
		return template.update(QueryBuilder.NJ_UPDATE_USER_BY_ID, src);
	}

	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src = new MapSqlParameterSource();
		src.addValue("K_USER_ID", id);
		return template.update(QueryBuilder.NJ_DELETE_USER_BY_ID, src);

	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.NJ_DELETE_ALL,new HashMap<>());
	}

}
