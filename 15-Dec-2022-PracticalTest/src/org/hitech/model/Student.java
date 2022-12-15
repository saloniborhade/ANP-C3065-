package org.hitech.model;

import java.util.Objects;

public class Student {
	private int studentID;
	private String studentName;
	private String qualification;
	
	public Student(){
		
	}
	public Student(int sID, String sname, String squalification){
		super();
		studentID=sID;
		studentName=sname;
		this.qualification=squalification;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int sID) {
		this.studentID = sID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String sName) {
		this.studentName = sName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public int hashCode() {
		return Objects.hash(qualification, studentID, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(qualification, other.qualification) && studentID == other.studentID
				&& Objects.equals(studentName, other.studentName);
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", qualification=" + qualification
				+ "]";
	}
	
	
}
