package com.mymart.dao;
import java.util.LinkedList;

import com.mymart.model.Product;

public class ProductDAO {
	private static LinkedList<Product> list=new LinkedList<>();
	
	public boolean addProduct(Product product) {
		boolean addStatus=false;
		list.add(product);
		addStatus=true;
		return addStatus;
	}
	public LinkedList<Product> getAllProducts(){
		return list;
	}

}
