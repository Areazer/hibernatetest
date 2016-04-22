package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Teacher {
	private int id;
	private String name;
	private String title;
	
	
	
	@Id
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
