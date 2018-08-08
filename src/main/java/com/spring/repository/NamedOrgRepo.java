package com.spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Organization;
import com.spring.queries.QueryBuilder;
@Repository(value="ABCD")
public class NamedOrgRepo implements IOrgRepo{
	@Autowired
	NamedParameterJdbcTemplate template;

	@Override
	public List<Organization> getAll() {
		// TODO Auto-generated method stub
		return template.query(QueryBuilder.NJO_GET_ALL, new OrgRowMapper());
	}

	@Override
	public Organization getOrgById(int id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ORG_ID",id);
		return template.queryForObject(QueryBuilder.NJO_GET_ORG_BY_ID, src,new OrgRowMapper());
	}

	@Override
	public int createOrg(Organization or) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ORG_ID",or.getOrg_id());// this is your key: org_id it must be in query
		src.addValue("K_ORG_NAME",or.getOrg_name());
		src.addValue("K_ORG_CODE", or.getOrg_code());
		return template.update(QueryBuilder.NJO_INSERT, src);
	}

	@Override
	public int updateName(Organization or) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ORG_ID",or.getOrg_id());
		src.addValue("K_ORG_NAME", or.getOrg_name());
		return template.update(QueryBuilder.NJO_UPDATE_ORG_BY_ID, src);
	}

	@Override
	public int deleteOrgById(int id) {
		// TODO Auto-generated method stub
		MapSqlParameterSource src=new MapSqlParameterSource();
		src.addValue("K_ORG_ID", id);
		return template.update(QueryBuilder.NJO_DELETE_ORG_BY_ID, src);
	}

	@Override
	public int deleteOrgAll() {
		// TODO Auto-generated method stub
		return template.update(QueryBuilder.NJR_DELETE_ALL, new HashMap<>());
	}

}
