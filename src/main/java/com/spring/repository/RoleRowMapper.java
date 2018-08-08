package com.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Role;
import com.spring.model.User;

public class RoleRowMapper implements RowMapper<Role> {
	@Override
	public Role mapRow(ResultSet rs, int rn) throws SQLException {
		Role re = new Role();
		re.setRole_id(rs.getInt("ROLE_ID"));
		re.setName(rs.getString("RNAME"));
		re.setCode(rs.getInt("RCODE"));
		return re;
	}

}
