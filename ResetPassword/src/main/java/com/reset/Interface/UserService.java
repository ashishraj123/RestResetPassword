package com.reset.Interface;

import com.reset.pasword.UserRecordObject;

public interface UserService {

	public UserRecordObject setUserPasswordByEmailId(String emailId);

	public UserRecordObject setUserPasswordByUserName(String userName);

	public UserRecordObject setUserPasswordByMobile(String mobileNumber);
	
	
	
	
}
