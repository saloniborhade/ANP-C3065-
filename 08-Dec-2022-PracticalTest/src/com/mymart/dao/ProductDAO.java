package com.mymart.dao;
import java.util.LinkedList;
import com.mymart.model.*;
public class ProductDAO {
	
	
	public static void addProduct(int id, String name, double price) {
		LinkedList<Product>linkedList=new LinkedList<>();
		linkedList.add(new Product());
	}
	public static String getAllProducts(int id, String name, double price) {
		System.out.println("The Products Details are : " id+" "+name+" "+price);
		
	}

}
