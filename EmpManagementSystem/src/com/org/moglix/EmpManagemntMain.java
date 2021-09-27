package com.org.moglix;

import java.util.Iterator;

import com.org.moglix.controller.EmployeeController;
import com.org.moglix.domain.Employee;

public class EmpManagemntMain {
	public static void main(String[] args) {
		EmployeeController employeeController =new EmployeeController();

       Employee emp=new Employee();
       emp.setEmp_id("EMP001");
       emp.setEmp_firstName("John");
       emp.setEmpLastName("vick");
       emp.setEmpAddress("Georgia");
       emp.setEmpSalary(1000.00);
       
       Employee emp2=new Employee();
       emp2.setEmp_id("EMP002");
       emp2.setEmp_firstName("Valkayrie");
       emp2.setEmpLastName("Masand");
       emp2.setEmpAddress("Japan");
       emp2.setEmpSalary(1111.00);
       
     String persistentMessage= employeeController.addEmployee(emp);
   employeeController.addEmployee(emp2);

     System.out.println(persistentMessage);
     System.out.println(employeeController.getById("EMP001"));
     
     Employee emp1=new Employee();
     emp1.setEmp_firstName("John1");
     emp1.setEmpLastName("vick1");
     emp1.setEmpAddress("Georgia1");
     emp1.setEmpSalary(99999.00);
     String updateEmployee=employeeController.updateEmployeeById(emp1, "EMP001");
     System.out.println(updateEmployee);
     System.out.println(employeeController.getById("EMP001"));

     
     Employee[] employeeList=employeeController.getList();
    for (Employee employee : employeeList) {
		if(employee!=null) {
			System.out.println(employee);
		}
	}
    
    String deletedEntity=employeeController.deleteEmployeeById("Emp001");
    System.out.println(deletedEntity);
    Employee[] employeeList1=employeeController.getList();
    for (Employee employee : employeeList1) {
		if(employee!=null) {
			System.out.println(employee);
		}
	}
	}
	

}
