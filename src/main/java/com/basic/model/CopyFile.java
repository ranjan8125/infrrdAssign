package com.basic.model;

import java.sql.Timestamp;

public class CopyFile {
	
	private Timestamp timestamp;
	private String copyFrom;
	private String copyTo;
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getCopyFrom() {
		return copyFrom;
	}
	public void setCopyFrom(String copyFrom) {
		this.copyFrom = copyFrom;
	}
	public String getCopyTo() {
		return copyTo;
	}
	public void setCopyTo(String copyTo) {
		this.copyTo = copyTo;
	}

}
