package com.hibernate.model;

public class Student {
	private StudentPK pk;
	

	private int age;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StudentPK getPk() {
		return pk;
	}

	public void setPk(StudentPK pk) {
		this.pk = pk;
	}


}
