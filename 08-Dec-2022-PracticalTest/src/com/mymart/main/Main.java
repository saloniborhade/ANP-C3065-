package com.mymart.main;

import com.mymart.view.ProductView;

public class Main {

	public static void main(String[] args) {
		ProductView productView=new ProductView();
		productView.addProduct();
		productView.displayAllProducts();

	}

}
