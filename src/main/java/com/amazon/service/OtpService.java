package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.dto.UserResponseDto;
import com.amazon.entity.OtpEntity;
import com.amazon.repo.OtpRepo;

@Service
public class OtpService {
	final OtpRepo otpRepo;

	OtpService(OtpRepo otpRepo) {
		this.otpRepo = otpRepo;
	}
	
	public UserResponseDto saveOtp(String name,String email) {
		OtpEntity entity=new OtpEntity();
		entity.setOtp(generate());
		entity.setStatus("success");
		entity.setMessage("otp is generated");
		OtpEntity save = otpRepo.save(entity);
		return new UserResponseDto(save.getOtp(),save.getStatus(),save.getMessage());
		
	}
	
	public int generate() {
		return 123456;
	}
	
}
