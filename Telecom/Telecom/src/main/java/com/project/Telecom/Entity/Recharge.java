package com.project.Telecom.Entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Recharge {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(nullable=false)
	Long user_id;
	@Column(nullable=false)
	Long plan_id;
	@Column(nullable=false)
	Date date;
	@Column(nullable=false)
	int amount;
	@Column(nullable=false)
	Status status;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	User user;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="plan_id")
	Plan plan;
	public Recharge(Long id, Long user_id, Long plan_id, Date date, int amount, Status status) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.plan_id = plan_id;
		this.date = date;
		this.amount = amount;
		this.status = status;
	}
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
	public Long getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Long plan_id) {
		this.plan_id = plan_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Recharge [id=" + id + ", user_id=" + user_id + ", plan_id=" + plan_id + ", date=" + date + ", amount="
				+ amount + ", status=" + status + "]";
	}
	public Recharge() {
	
	}
	
}
