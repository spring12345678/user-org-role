package com.spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Role;
import com.spring.queries.QueryBuilder;
@Repository("KLM")
public class NamedRoleRepo implements IRoleRepo{
	@Autowired
	NamedParameterJdbcTemplate template;
	

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return template.query(QueryBuilder.NJR_GET_ALL,new RoleRowMapper());
	}

	@Override
	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ROLE_ID",id);
		return template.queryForObject(QueryBuilder.NJR_GET_ROLE_BY_ID, src, new RoleRowMapper());
	}

	@Override
	public int createRole(Role re) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ROLE_ID", re.getRole_id());
		src.addValue("K_RNAME", re.getName());
		src.addValue("K_RCODE", re.getCode());
		return template.update(QueryBuilder.NJR_INSERT,src);
	}

	@Override
	public int updateRoleByCode(Role re) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ROLE_ID", re.getRole_id());
		src.addValue("K_RCODE", re.getCode());
		return template.update(QueryBuilder.NJR_UPDATE_ROLE_BY_ID, src);
	}

	@Override
	public int deleteRoleById(int id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ROLE_ID",id);
		return template.update(QueryBuilder.NJR_DELETE_ROLE_BY_ID, src);
	}

	@Override
	public int deleteRoleAll() {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.NJ_DELETE_ALL, new HashMap<>());
	}

}
