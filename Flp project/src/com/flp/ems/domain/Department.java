package com.flp.ems.domain;

public class Department {
private String departmentname;
private String departmentid;

public String getDepartmentname() {
	return departmentname;
}
public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}
public String getDepartmentid() {
	return departmentid;
}
public void setDepartmentid(String departmentid) {
	this.departmentid = departmentid;
}

	
@Override
public String toString() {
	return "Department [Dept_Name=" + departmentname +"]";
}
}
