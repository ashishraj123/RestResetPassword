package com.reset.pasword;

import java.io.Serializable;

public class UserRecordObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2989954392186292748L;
	private String userName;
	private String emailId;
	private String mobileNumber;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRecordObject [userName=" + userName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
				+ ", password=" + password + "]";
	}
	
	
}
