package com.project.Telecom.Dto;


import java.util.Date;

import com.project.Telecom.Entity.Status;

public class RechargeDto {
	Long id;
	Long user_id;
	Long plan_id;
	Date date;
	int amount;
	Status status;
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
	public RechargeDto(Long id, Long user_id, Long plan_id, Date date, int amount, Status status) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.plan_id = plan_id;
		this.date = date;
		this.amount = amount;
		this.status = status;
	}
	public RechargeDto() {
	//	super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RechargeDto [id=" + id + ", user_id=" + user_id + ", plan_id=" + plan_id + ", date=" + date
				+ ", amount=" + amount + "]";
	}
	
	}
