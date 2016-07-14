package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	
	
	
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void getAllEmployee();
	void AddEmployee(Employee e);
}
