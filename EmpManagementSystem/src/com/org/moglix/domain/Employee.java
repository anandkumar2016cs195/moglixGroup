package com.org.moglix.domain;

import lombok.Data;

@Data
public class Employee {
	private String emp_id;
	private String emp_firstName;
	private String empLastName;
	private Double empSalary;
	private String empAddress;
	public Employee(String emp_id, String emp_firstName, String empLastName, Double empSalary, String empAddress) {
		super();
		this.emp_id = emp_id;
		this.emp_firstName = emp_firstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public Employee(String emp_firstName, Double empSalary, String empAddress) {
		super();
		this.emp_firstName = emp_firstName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public Employee() {
		super();
	}
}
