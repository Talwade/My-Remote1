
package com.flp.ems.dao;


	

	import java.util.ArrayList;
	import java.util.List;

	import com.flp.ems.domain.Employee;

	public class EmployeeDaoImplForList implements IemployeeDao  {
		List<Object> employees = new ArrayList<Object>();
		//Employee e1=new Employee();

		

		@Override
		public void ModifyEmployee() {
			// TODO Auto-generated method stub
			//employees.add(e1);
		}

		@Override
		public void RemoveEmployee() {
			// TODO Auto-generated method stub
			//employees.remove(e1);
		}

		@Override
		public void SearchEmployee() {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void AddEmployee(Employee e) {
			// TODO Auto-generated method stub
			employees.add(e);
			System.out.println("List->"+employees);
			
		}

		@Override
		public void getAllEmployee() {
			// TODO Auto-generated method stub
			
		}

		/*@Override
		public void AddEmployee() {
			// TODO Auto-generated method stub
			
		}*/
		

		

		

	}
