package com.xworkz.features.funtional;

import java.io.Serializable;

public class FishDTO implements Serializable {
	private String name;
	private String color;
	private String type;
	private String lifeSpan;
	private String cost;
	private String gender;
	
	public FishDTO() {
		
	}
	public FishDTO(String name, String color, String type, String lifeSpan, String cost, String gender) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.cost = cost;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "FishDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifeSpan=" + lifeSpan + ", cost="
				+ cost + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
