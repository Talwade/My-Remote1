package com.flp.ems.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class UserInteraction {

	// Validate valid = new Validate();

	private static int Empployeeid, Kin_id;
	private static String myemp;
	private static String mykin;
	private static Pattern pat=  Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
	public static HashMap<String, String> mapStudent = new HashMap<String,String>();
	
	

	String Email_id;
	private static  String Name;
	private static String Phone_no;
	private static boolean namevalid;
	private String Address;
	private static int Project_id, Role_id;
	private static String number;

	private static String Dateofjoining;
	private String Dateofbirth;
	private static int Dept_id;
	private static int countofemp;
	private static String dept, proj, role;
	private static int Data;
	private  boolean flag=false;
	private static boolean loopAgain=true;
	Scanner scan = new Scanner(System.in);

	 public  void AddEmployee() {

		

		// loop while user not entering no
		do {

			Random r = new Random();
			Empployeeid = r.nextInt(9999 - 1000) + 1000;
			myemp = String.valueOf(Empployeeid);
			System.out.print("Enter Name of employee:");
			Name = scan.nextLine();
			 System.out.println("Enter kin id");
			 Kin_id=scan.nextInt();
			 mykin=String.valueOf(Kin_id);
			System.out.println("Enter email id of employee");
			Email_id = scan.next();
			System.out.println("Enter phone number");
			Phone_no = scan.next();
			System.out.println("Enter employee dob dd/mm/yyyy");
			Dateofbirth = scan.next();
			System.out.println("Enter the doj dd/mm/yyyy");
			Dateofjoining = scan.next();

			System.out.println("Select  department  \n1.Financial department \n2.Non-financial 3.Exit ");

			int choice = 0;
			char opt, opt1 = 0;
			System.out.println("enter your choice");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("In Financial dept");
				dept="Financial Department";
				System.out.println("Enter your project from FS \na.Banking Sector \nb. Capital Markets");
				System.out.println("enter option");
				opt = scan.next().charAt(0);

				switch (opt) {
				case 'a':

					proj = "Banking Sector";
					System.out.println("Employee project is\n" + proj);
					System.out.println("Enter your role");
					role = scan.next();

					break;

				case 'b':
					System.out.println("");
					proj = "Capital Market";
					System.out.println("Employee project" + proj);
					System.out.println("Enter your role");
					role = scan.next();
					System.out.println("" + role);
					break;

				}

				break;
			case 2:

				System.out.println("Nonfinancial dept \na.SAP \nb. ORACLE \nc. Exit");
				dept="Nonfinancial Department";
				System.out.println("enter option ");
				opt1 = scan.next().charAt(0);
				switch (opt1) {
				case 'a':

					System.out.println("SAP dept selected");

					break;
				case 'b':
					System.out.println("ORACLE");
					break;

				case 'c':
					break;

				}

				break;
				
				
			}
			

			System.out.print("Enter more info (y/n)?");
			String answer = scan.next();

			// condition to satisfy in order to loop again
			if (answer.contains("y") || answer.contains("Y")) {

//printhashmap();
				continue;
			}
				else if(answer.contains("n") || answer.equals("N")) {
					
					validdate(Dateofjoining);
		
				
				}		
			
			break;
		} while (loopAgain);

		/*
		 * System.out.println("\n**********************************");
		 * System.out.println("EMS"); System.out.println( "   KINID  " +
		 * "     EMAILID " + "	NAME " + "   DEPARTMENT  " + "		PROJECT  "+
		 * "        ROLE "); for (int id : mapStudent.keySet()) {
		 * System.out.println("   " + kinid + "     " + mapStudent.get(kinid) +
		 * "   " +mailid +mapStudent.get(mailid) +"   " +name+
		 * mapStudent.get(name) +"  "+dept+mapStudent.get(dept)+"  "
		 * +proj+mapStudent.get(proj)+ "   "+role+mapStudent.get(role)); }
		 * System.out.println("\n**********************************");
		 */

	}

	private boolean validdate(String doj) {
		
		 Matcher mtch = pat.matcher(doj);
	        if(mtch.matches()){
	        	System.out.println("valid date");
	        	showmap();
	            return true;
	        }
	        System.out.println("invalid date enter again");
	       loopAgain=true;
	        
	        return false;
	        
	
		
		
	}

	private void showmap() {

		mapStudent.put("Employeeid", myemp);
		mapStudent.put("Kinid",mykin);
		mapStudent.put(" Emailid", Email_id);
		mapStudent.put("Name", Name);
		mapStudent.put("Phone", Phone_no);
		mapStudent.put("DOJ", Dateofjoining);
		mapStudent.put("DOB", Dateofbirth);
		mapStudent.put("Dept", dept);
		mapStudent.put("Project", proj);
		mapStudent.put("Role", role);
System.out.println(" "+mapStudent+" ");
EmployeeServiceImpl emp=new EmployeeServiceImpl();
emp.AddEmployee(mapStudent);
	}
	/*
	 * public static HashMap<String, String> getHashmap() { return mapStudent; }
	 * 
	 * public void setHashmap(HashMap<String, String> hashmap) { this.mapStudent
	 * = hashmap; }
	 */
	/*public void printhashmap() {

		// Kin id, email id, name, role, department, project

		System.out.println("\n**********************************");
		System.out.println("EMS");
		System.out.println("   KINID  " + "     EMAILID " + "	NAME " + "   DEPARTMENT  " + "		PROJECT  ");
		for (String id : mapStudent.keySet()) {
			System.out.println("   " + Empployeeid + "     " + mapStudent.get(Empployeeid) + "   " + Email_id + mapStudent.get(Email_id)
					+ "   " + Name + mapStudent.get(Name) + "  " + Dept_id + mapStudent.get(Dept_id) + "  " + proj+mapStudent.get(proj)
					 + "   " + role + mapStudent.get(role));
			
			System.out.println(" ");
		}
		System.out.println("\n**********************************");

	}*/

	// public boolean validate() {

	/*
	 * if(Validate.isvalidname(Name)==false )//&&
	 * Validate.isvalidPhone(Phone_no) && Validate.isvalidDate(Dateofbirth) &&
	 * Validate.isvalidEmail(Email_id)) { System.out.println(""+Name);
	 * flag=true; System.out.println(""+Phone_no);
	 * System.out.println(""+Dateofbirth); System.out.println(""+Email_id);
	 * 
	 * } else { System.out.println("in else"); flag=false; }
	 */

	// return flag;

	// }
	// validate email

	/*
	 * public boolean isValidEmailAddress(String email) { String ePattern =
	 * "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
	 * java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
	 * java.util.regex.Matcher m = p.matcher(email); return m.matches();
	 * 
	 * }
	 */

	void ModifyEmployee() {

	}

	void RemoveEmployee() {

	}

	void SearchEmployee() {

	}

	void getAll() {

		//printhashmap();

	}
}
