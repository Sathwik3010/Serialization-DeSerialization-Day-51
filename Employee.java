package com.codegnan.Io;

import java.io.Serializable;

public class Employee implements Serializable{

	transient int empId;
	String empName;
	transient double empSalary;
	String empLocation;
	transient String empDepartment;
	
	public Employee(int empId, String empName, double empSalary, String empLocation, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
		this.empDepartment = empDepartment;
	}

	public void displayDetails() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
		System.out.println("Employee Location: "+empLocation);
		System.out.println("Employee Department: "+empDepartment);

	}
	

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empLocation=" + empLocation + "]";
	}

}
