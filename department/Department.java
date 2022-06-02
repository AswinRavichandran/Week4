package org.department;

import org.college.College;

public class Department extends College{
	public void deptName() {
		System.out.println("AGRICULTURE");

	}
	public static void main(String[] args) {
		Department dep=new Department();
		dep.deptName();
		dep.collegeCode();
	}
	

}
