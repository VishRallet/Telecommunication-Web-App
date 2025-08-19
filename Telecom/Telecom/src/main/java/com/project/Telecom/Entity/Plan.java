package com.project.Telecom.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Plan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(nullable=false)
	String name;
	@Column(nullable=false)
	int validity;
	@Column(nullable=false)
	int price;
	@Column(nullable=false)
	PlanType type;
	@Column(nullable=false)
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
	public Plan(Long id, String name, int validity, int price, PlanType type, String description) {
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
	public Plan() {
	}
	

}
