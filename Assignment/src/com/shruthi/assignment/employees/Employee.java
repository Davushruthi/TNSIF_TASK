package com.shruthi.assignment.employees;

public class Employee {
	
	private String name;
	private int employeeId;
	private double salary;
	
	public Employee(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId =employeeId;
		this.salary = salary;
		
	}
	
	public String getname(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getemployeeId(){
		return employeeId;
	}
	public void setName(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public double getsalary(){
		return salary;
	}
	public void setsalary(double salary) {
		this.salary= salary;
	}
	

}
