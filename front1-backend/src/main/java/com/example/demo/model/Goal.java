package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Goal")
public class Goal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int user_id;
	private String goalName;
	private String duration;
	private String description;
	private int targetWeight;
	@Value(value = "false")
	private boolean approval;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public int getTargetWeight() {
		return targetWeight;
	}
	public void setTargetWeight(int targetWeight) {
		this.targetWeight = targetWeight;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	
	public Goal(int id, int user_id, String goalName, String description,String duration,int targetWeight) {
		super();
		this.id = id;
		this.user_id=id;
		this.goalName = goalName;
		this.description = description;
		this.duration = duration;
		this.targetWeight= targetWeight;
	}
	
	public Goal(int user_id, String goalName, String description,String duration,int targetWeight) {
		super();
		this.user_id=id;
		this.goalName = goalName;
		this.description = description;
		this.duration = duration;
		this.targetWeight= targetWeight;
	}
	
	public Goal() {
		super();
	}

}