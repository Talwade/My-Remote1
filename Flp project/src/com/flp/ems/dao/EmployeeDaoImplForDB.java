/*package com.flp.ems.dao;

import java.util.Map;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForDB implements IemployeeDao{

	@Override
	public void ModifyEmployee(Map empModifiedDetails, String val, String val1, int empId, int val2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean RemoveEmployee(int empids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee SearchEmployee(String val, String val1, int val2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
*/package com.flp.ems.dao;

import java.util.Map;
import java.sql.*;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.mysql.jdbc.Connection;

public class EmployeeDaoImplForDB implements IemployeeDao {
	private String Employee_Id;
	private String Name;
	private String Kin_Id;
	private String Email_Id;
	private String Phone_No;
	private String DOB;
	private String DOJ;
	private String Address;
	private String names;
	Employee e = new Employee();

	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	private String s;
	

	

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		 Class.forName(driver); Connection dbConnection;
		 dbConnection=(Connection)DriverManager.getConnection(url);
		 Statement stmt = dbConnection.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from Employee");
		    while (rs.next()) {
		    	 s = rs.getString(""); 
		      
		         System.out.println(s);
		       
		    }
	}

	@Override
	public boolean RemoveEmployee(int id, Employee e){
		// TODO Auto-generated method stub
		
		 Class.forName(driver); Connection dbConnection;
		 dbConnection=(Connection)DriverManager.getConnection(url);
		 String query = "delete from Employee where name=?";
		PreparedStatement preparedStmt = dbConnection.prepareStatement(query);
		preparedStmt.setInt(1, e.setKin_Id(id));
		preparedStmt.execute();
		 
		 

		return false;
	}

	
	

	public EmployeeDaoImplForDB() {
		this.e=e;
		this.names=Name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee SearchEmployee(String val, String val1, int val2) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Employee ModifyEmployee(Map empModifiedDetails, String val, String val1, int empId, int val2){ //throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName(driver);
		Connection dbConnection;
		dbConnection = (Connection) DriverManager.getConnection(url);
		String query = "update Employee set where name=?";
		PreparedStatement preparedStmt = dbConnection.prepareStatement(query);
		preparedStmt.setString(1, e.getName());
		preparedStmt.execute();
		
		return null;
	}

	@Override
	public void AddEmployee(Employee e)
			 {

		// TODO Auto-generated method stub

		Class.forName(driver);
		Connection dbConnection;
		dbConnection = (Connection) DriverManager.getConnection(url);
		String query = "insert into Employee (name)" + " values (?)";
		PreparedStatement preparedStmt = dbConnection.prepareStatement(query);
		preparedStmt.setString(1, e.getName());
		preparedStmt.execute();

	}

	@Override
	public boolean RemoveEmployee(int empids) {
		// TODO Auto-generated method stub
		return false;
	}

}
