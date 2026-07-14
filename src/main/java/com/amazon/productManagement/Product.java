package com.amazon.productManagement;

public class Product {

	int productId;
	String productName;
	int price;
	public void acceptDetails() {
		
	}
	public void displayDetails() {
		System.out.println("productId "+productId+"productName "+productName+"Price "+price);
	}
	public int calculateDiscount(int price,int discount) {
		
		return price-(discount/100*price);
	}

}
