package com.amazon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class OrderEntity {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int orderId;
	String productName;
	String productPrice;
	String orderedAt;
	String orderStatus;
}
