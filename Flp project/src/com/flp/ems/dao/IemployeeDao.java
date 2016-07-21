package com.flp.ems.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	Employee ModifyEmployee(Map empModifiedDetails,String val,String val1,int empId,int val2) throws ClassNotFoundException, SQLException;
	//void RemoveEmployee(String value);
	boolean RemoveEmployee(int empids);
	Employee SearchEmployee(String val,String val1,int val2) throws ClassNotFoundException, SQLException;
	void getAllEmployee() throws ClassNotFoundException, SQLException;
	//Employee AddEmployee(Employee e);
	void AddEmployee(Employee e) throws ClassNotFoundException, SQLException;
	boolean RemoveEmployee(int id, Employee e) throws ClassNotFoundException, SQLException;
}
