package com.project.Telecom.Dto;

import com.project.Telecom.Entity.PlanType;


public class PlanDto {
	Long id;
	String name;
	int validity;
	int price;
	PlanType type;
	String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public PlanType getType() {
		return type;
	}
	public void setType(PlanType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public PlanDto(Long id, String name, int validity, int price, PlanType type, String description) {
		super();
		this.id = id;
		this.name = name;
		this.validity = validity;
		this.price = price;
		this.type = type;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", validity=" + validity + ", price=" + price + ", type=" + type
				+ ", description=" + description + "]";
	}
	public PlanDto() {
	}
}
