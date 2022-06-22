package com.task1.msf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
public void showEmp(int Id,String Name,int salary,String Type) { 
	
}

public static void main(String args[]) {
	Employee obj;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter ID : ");
	int Id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Employee Name : ");
	String empName=sc.nextLine();
	System.out.println("Enter Employee salary : ");
	int empSal=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Employee Type : ");
	String emptype=sc.next();
	
	if(emptype.equals("permanent")) {
		
		obj= new PermanentEmployee();
		obj.showEmp(Id,empName,empSal,emptype);
	
	}else if(emptype=="parttime") {
		obj =new ParttimeEmployee();
		obj.showEmp(Id,empName,empSal,emptype);
	}else if(emptype=="contract"){
		obj =new ContractEmployee();
		obj.showEmp(Id,empName,empSal,emptype);
	}else {
		System.out.println("Invalid Entry");
	}	
}
}
