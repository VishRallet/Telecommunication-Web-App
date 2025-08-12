package com.var.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="missedcall")
public class MissedCallAlert {
	
	@Id
	@Column(name="missed_call_id")
	Long id;
	
	@Column(name="missed_call_mobileNumber")
	String mobileNumber;
	
	@Column(name="missed_call_subscribed")
	boolean subscribed;
	
	@Column(name="missed_call_subscribedAt")
	LocalDateTime subscribedAt;
	
	public MissedCallAlert() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	public LocalDateTime getSubscribedAt() {
		return subscribedAt;
	}

	public void setSubscribedAt(LocalDateTime subscribedAt) {
		this.subscribedAt = subscribedAt;
	}

	@Override
	public String toString() {
		return "MissedCallAlert [id=" + id + ", mobileNumber=" + mobileNumber + ", subscribed=" + subscribed
				+ ", subscribedAt=" + subscribedAt + "]";
	}

	public MissedCallAlert(Long id, String mobileNumber, boolean subscribed, LocalDateTime subscribedAt) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.subscribed = subscribed;
		this.subscribedAt = subscribedAt;
	}

}
