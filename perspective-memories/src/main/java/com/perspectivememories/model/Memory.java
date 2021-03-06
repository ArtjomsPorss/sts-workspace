package com.perspectivememories.model;

import java.time.LocalDateTime;

public class Memory {
	private LocalDateTime dateTime;
	private long userId;
	private long messageId;
	private String message;
	
	public Memory(){}
	
	public Memory(LocalDateTime dateTime, long userId, long messageId, String message) {
		super();
		this.dateTime = dateTime;
		this.userId = userId;
		this.messageId = messageId;
		this.message = message;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
