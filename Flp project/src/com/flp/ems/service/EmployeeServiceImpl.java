package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService {

	Employee e = new Employee();
	EmployeeDaoImplForList edmp=new EmployeeDaoImplForList();

	static String name;
	static UserInteraction uii = new UserInteraction();
	// static HashMap<String, String> gethash=UserInteraction.getHashmap();

	/*
	 * private static void validate1() { // TODO Auto-generated method stub
	 * Validate.isvalidname(name); }
	 */

	@Override
	public void AddEmployee(HashMap mapStudent) {

		/*
		 * if(mapStudent.get("Name")==" ") { System.out.println(
		 * "invalid null name");
		 * 
		 * }
		 */
		boolean f1, f2, f3;

		//f3 = Validate.isvalidEmail((String) mapStudent.get("Emailid"));
		f1 = Validate.isvalidname((String) mapStudent.get("Name"));
		f2 = Validate.isvalidPhone((String) mapStudent.get("Phone"));
		if (f1 && f2) {
			System.out.println("valid details(Name,Phone)");
		} else {
			System.out.println("invalid name");
			// System.exit(0);
		}
		// Validate.isvalidname((String)mapStudent.get("Name"));

		e.setName((String) mapStudent.get("Name"));
		e.setPhone_No((String) mapStudent.get("Phone"));

		/*e.setEmail_Id((String) mapStudent.get("Emailid"));*/
		System.out.println(e.toString());
		edmp.AddEmployee(e);

	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveEmployee() {

		// TODO Auto-generated method stub

	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub

	}

}
