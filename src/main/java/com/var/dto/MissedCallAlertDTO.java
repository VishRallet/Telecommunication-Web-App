package com.var.dto;

import java.time.LocalDateTime;

public class MissedCallAlertDTO {

	Long id;

	String mobileNumber;

	boolean subscribed;

	LocalDateTime subscribedAt;
	
	public MissedCallAlertDTO() {		
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

	public MissedCallAlertDTO(Long id, String mobileNumber, boolean subscribed, LocalDateTime subscribedAt) {
		super();
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.subscribed = subscribed;
		this.subscribedAt = subscribedAt;
	}
}
