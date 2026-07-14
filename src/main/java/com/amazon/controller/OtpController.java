package com.amazon.controller;


import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.dto.UserRequestDto;
import com.amazon.dto.UserResponseDto;
import com.amazon.service.OtpService;

@RestController
@RequestMapping("otp")
public class OtpController {
	final OtpService otpService;

	OtpController(OtpService otpService) {
		this.otpService = otpService;
	}
	@PostMapping("/generate")
	public UserResponseDto generateOtp(@RequestBody UserRequestDto userRequestDto) {
		return otpService.saveOtp(userRequestDto.name(), userRequestDto.email());
	}
	

}
