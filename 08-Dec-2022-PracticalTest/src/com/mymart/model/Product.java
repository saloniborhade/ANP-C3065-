package com.mymart.model;
import java.util.Objects;
public class Product {
	int productID;
	String productName;
	double productPrice;
	
	public void setProductId(int id) {
		productID=id;
		
	}
	public void setProductName(String name) {
		productName=name;
	}
	public void setProductPrice(double price) {
		productPrice=price;
	}
	
	public int getProductId() {
		return productID;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public String toString() {
		return productID+" "+productName+" "+productPrice;
	}
	public double equals(int productID, String productName, double productPrice) {
		boolean result;
		if(productID == 0 && productName==null && productPrice==0)
			result= false;
		else
			result=true;

		return productID;
		
	}
	public int hashCode() {
		return Objects.hash(productID,productName);
	}
}
	


