package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("Karthika");
}
public void studentDept(){
	System.out.println("Ceramic tech");
}
public void studentID() {
	System.out.println("2015301019");
}
public static void main(String args[]) {
	College name=new College();
	name.collegeName();
	name.collegeCode();
	name.collegeRank();
	Department deptName= new Department();
	deptName.department();
	Student std = new Student();
	std.studentName();
	std.studentDept();
	std.studentID();
	

	
	}
}

