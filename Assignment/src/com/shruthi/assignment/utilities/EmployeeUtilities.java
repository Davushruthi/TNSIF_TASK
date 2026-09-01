package com.shruthi.assignment.utilities;

import com.shruthi.assignment.employees.Employee;


public class EmployeeUtilities {
	public static void displayEmployee(Employee employee) {

        System.out.println("Name: " + employee.getname());
        System.out.println("Employee ID: " + employee.getemployeeId());
        System.out.println("Salary: " + employee.getsalary());
        
	}
}