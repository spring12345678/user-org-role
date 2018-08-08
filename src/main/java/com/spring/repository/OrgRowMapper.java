package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Organization;

public class OrgRowMapper implements RowMapper<Organization> {
	@Override
	public Organization mapRow(ResultSet rs, int rn) throws SQLException {
		Organization org = new Organization();
		org.setOrg_id(rs.getInt("ORG_ID"));
		org.setOrg_name(rs.getString("ORG_NAME"));
		org.setOrg_code(rs.getInt("ORG_CODE"));
		return org;
	}

}
