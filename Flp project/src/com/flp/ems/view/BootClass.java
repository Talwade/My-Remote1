package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	private static int opt;
	static Scanner s=new Scanner(System.in);
	
public static void main(String[] args) {
	
	UserInteraction ui=new UserInteraction();
	System.out.println("Enter option \n 0.Add \n1.Modify \n2.Search  \n3Remove \n4.Exit");
	opt=s.nextInt();
	switch(opt)
	{
	case 0:
		System.out.println("");
 
		ui.AddEmployee();
		
		
	break;	
		
	case 1:
		System.out.println("");
		
	ui.ModifyEmployee();
	break;
	
	case 2:
		ui.SearchEmployee();
		break;
		

	case 3:
		ui.RemoveEmployee();
		break;
		
	case 4:
		System.exit(0);
		break;
		
	}
	
}
}
