package com.amazon.entity;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OtpEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int otp ;
	String message;
	String status ;
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
