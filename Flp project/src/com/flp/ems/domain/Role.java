package com.flp.ems.domain;

public class Role {
private String roleid;
private String role_name;
public String getRoleid() {
	return roleid;
}
public void setRoleid(String roleid) {
	this.roleid = roleid;
}
public String getRole_name() {
	return role_name;
}
public void setRole_name(String role_name) {
	this.role_name = role_name;
}
@Override
public String toString() {
	return "Role [role_name=" + role_name + "]";
} 



}
