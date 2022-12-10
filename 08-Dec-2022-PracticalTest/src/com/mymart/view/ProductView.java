package com.mymart.view;

import java.util.LinkedList;
import java.util.Scanner;

import com.mymart.model.Product;
import com.mymart.service.ProductService;

public class ProductView {

	private static ProductService productService=new ProductService();
	
	public void addProduct() {
		//take input from user
		Scanner sc= new Scanner(System.in);
		int pID;
		System.out.print("Enter the Product Id : ");
		pID=sc.nextInt();
		
		String pName;
		System.out.print("Enter the Product Name : ");
		pName=sc.next();
		
		double pPrice;
		System.out.print("Enter the Product Price : ");
		pPrice=sc.nextInt();
		
		
//		int pID=1;
//		String pName="samsung Speaker";
//		double pPrice=4000;
		
		Product product=new Product(pID, pName, pPrice);
		productService.addProductService(product);
		
	}
	public void displayAllProducts() {
		LinkedList<Product> product=productService.getAllProductsService();
		for(Product p:product) {
			System.out.println("Product Details : ");
			System.out.println("ProductID:"+p.getProductID());
			System.out.println("ProductName:"+p.getProductName());
			System.out.println("ProductPrice:"+p.getProductPrice());
		
		}
	}
}
