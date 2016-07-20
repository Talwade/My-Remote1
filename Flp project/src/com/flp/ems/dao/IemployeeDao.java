package com.flp.ems.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	Employee ModifyEmployee(Map empModifiedDetails,String val,String val1,int empId,int val2);
	//void RemoveEmployee(String value);
	boolean RemoveEmployee(int empids,Employee e);
	Employee SearchEmployee(String val,String val1,int val2);
	void getAllEmployee();
	//Employee AddEmployee(Employee e);
	void AddEmployee(Employee e);
}
