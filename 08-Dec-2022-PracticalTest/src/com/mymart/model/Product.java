package com.mymart.model;
import java.util.Objects;
public class Product {
	private int productID;
	private String productName;
	private double productPrice;
	
	

	public Product(int pID, String pName, double pPrice) {
		super();
		this.productID = pID;
		this.productName = pName;
		this.productPrice = pPrice;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int pID) {
		this.productID = pID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String pName) {
		this.productName = pName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double pPrice) {
		this.productPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID, productName, productPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productID == other.productID && Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(productPrice) == Double.doubleToLongBits(other.productPrice);
	}


}
	


