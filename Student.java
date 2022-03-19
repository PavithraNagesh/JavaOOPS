package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Pavithra");
	}
	public void studentDept() {
		System.out.println("Department: Computer Science");
	}
	public void studentId() {
		System.out.println("Student ID:STD0007");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		

	}

}
