package com.learn.validate.domain;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Student {
	
	@NotBlank
	private String name;
	@Min(3)
	private int age;
	@NotBlank
	private String classess;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassess() {
		return classess;
	}
	public void setClassess(String classess) {
		this.classess = classess;
	}
	
}
