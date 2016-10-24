package com.reset.UserRecord;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name="UserInfo")
	public class UserRecord {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String userName;
		private String emailId;
		private String mobileNumber;
		private String password;
		public UserRecord(String userName, String emailId,String mobileNumber,String password) {
			super();
			this.userName = userName;
			this.emailId = emailId;
			this.mobileNumber = mobileNumber;
			this.password = password;
		}
		public UserRecord() {
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
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
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		@Override
		public String toString() {
			return "UserRecord [userName=" + userName + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
					+ ", password=" + password + "]";
		}
		
		
	}

