package com.learn.validate.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.validate.domain.Student;

@RestController
public class ValidateController {

	@RequestMapping(value="testStudent")
	public void testStudent(@Validated Student student) {
		
	}
	
}
