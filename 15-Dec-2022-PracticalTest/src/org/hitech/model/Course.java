package org.hitech.model;

import java.util.Objects;

public class Course {
	private int courseID;
	private String courseName;
	private double price;
	
	public Course(){
		
	}
	public Course(int cID, String cName, double price){
		courseID=cID;
		courseName=cName;
		this.price=price;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int cID) {
		this.courseID = cID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String cName) {
		this.courseName = cName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseID, courseName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseID == other.courseID && Objects.equals(courseName, other.courseName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
