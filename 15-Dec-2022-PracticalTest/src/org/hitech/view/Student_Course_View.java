package org.hitech.view;

import java.util.Scanner;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

import org.hitech.model.Student;
import org.hitech.model.Course;
import org.hitech.service.Student_Course_Service;

public class Student_Course_View {
	private Student_Course_Service scService=new Student_Course_Service();
	
	public void addStudentCourseDetails() {
		Scanner sc=new Scanner(System.in);
		
		int sID;
		System.out.println("Enter the Student ID : ");
		sID=sc.nextInt();
		
		String sName;
		System.out.println("Enter the Student Name : ");
		sName=sc.next();
		
		String qualification;
		System.out.println("Enter the Student Qualification : ");
		qualification=sc.next();
		
		
		int cID;
		System.out.println("Enter the Course ID : ");
		cID=sc.nextInt();
		
		String cName;
		System.out.println("Enter the Course Name : ");
		cName=sc.next();
		
		double price;
		System.out.println("Enter the Course Price : ");
		price=sc.nextInt();
		
		
		
		Student s=new Student(sID, sName, qualification);
		Course c=new Course(cID, cName, price);
		scService.addStudentCourseDetails(s, c);
		scService.deleteStudentCourseDetails(s);
		}
	
	
	
	
	public void displayAllStudentCourseDetails() {
		HashMap<Student, Course> hash=scService.getStudentCourseDetails();
		
		Set<Student> set=hash.keySet();
		Collection<Course> sets=hash.values();
		
		for(Student s:set){
			System.out.println("Student Details : ");
			System.out.println("StudentID:"+s.getStudentID());
			System.out.println("Student Name:"+s.getStudentName());
			System.out.println("Student Qualification:"+s.getQualification());
		}
		for(Course c:sets) {
			System.out.println("Course Details : ");
			System.out.println("Course:"+c.getCourseID());
			System.out.println("Course Name:"+c.getCourseName());
			System.out.println("Course Price:"+c.getPrice());
		}
		
}
	public void deleteStudentCourseDetails() {
		HashMap<Student,Course> hash=scService.getStudentCourseDetails();

	}
	public static void main(String[] args) {
		Student_Course_View scView=new Student_Course_View();
		scView.addStudentCourseDetails();
		scView.deleteStudentCourseDetails();
		scView.displayAllStudentCourseDetails();
		

	}

}
