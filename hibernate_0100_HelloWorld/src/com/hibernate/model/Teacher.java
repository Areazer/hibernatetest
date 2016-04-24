package com.hibernate.model;


import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity  
@Table(name="teacher")
@IdClass(value = TeacherPK.class)
public class Teacher {
	private int id;
	private String name;
	private String title;
	
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	

	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
