package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long workout_id;
	private String name;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getWorkout_id() {
		return workout_id;
	}
	public void setWorkout_id(Long workout_id) {
		this.workout_id = workout_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Exercise(Long id, Long workout_id, String name, String description) {
		super();
		this.id = id;
		this.workout_id = workout_id;
		this.name = name;
		this.description = description;
	}
	public Exercise() {
		super();
	}
	public Exercise(Long workout_id, String name, String description) {
		super();
		this.workout_id = workout_id;
		this.name = name;
		this.description = description;
	}
	
	
	

}
