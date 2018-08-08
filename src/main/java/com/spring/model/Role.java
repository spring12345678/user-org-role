package com.spring.model;

public class Role {
	private int role_id;

	private String rname;

	private int rcode;

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return rname;
	}

	public void setName(String rname) {
		this.rname = rname;
	}

	public int getCode() {
		return rcode;
	}

	public void setCode(int rcode) {
		this.rcode = rcode;
	}
	@Override
	public String toString() {
		return ("  " + role_id + " 	" + rname + "		" + rcode);
	}

	

}
