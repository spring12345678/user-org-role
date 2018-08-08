package com.spring.model;

public class Organization {
	private int org_id;

	private String org_name;

	private int org_code;

	public int getOrg_id() {
		return org_id;
	}

	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public int getOrg_code() {
		return org_code;
	}

	public void setOrg_code(int org_code) {
		this.org_code = org_code;
	}
	@Override
	public String toString() {
		return ("  " + org_id + " " + org_name + "	" + org_code);
	}

	
}
