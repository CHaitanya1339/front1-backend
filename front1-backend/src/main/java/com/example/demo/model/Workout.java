package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workout {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long user_id;
	private Date date;
	private String duration;
	private String notes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Workout(Long id, Long user_id, Date date, String duration, String notes) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.date = date;
		this.duration = duration;
		this.notes = notes;
	}
	public Workout(Long user_id, Date date, String duration, String notes) {
		super();
		this.user_id = user_id;
		this.date = date;
		this.duration = duration;
		this.notes = notes;
	}
	public Workout() {
		super();
	}
	
	
	
}
