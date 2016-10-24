package com.reset.pasword;

import javax.annotation.Resource;

import com.reset.Interface.UserService;
import com.reset.contants.UtilConstants;

public class UserDetailDao {
	
	@Resource
	private UserService userService;
	
	public String resetPassword(UserInput userInput) {
		if (UtilConstants.MOBILE_NUMBER.equals(userInput.getInputType())) {
			return userService.setUserPasswordByMobile(userInput.getUserInput()).getPassword();
		} else if (UtilConstants.EMAIL_ID.equals(userInput.getInputType())) {
			return userService.setUserPasswordByEmailId(userInput.getUserInput()).getPassword();
		} else {
			return userService.setUserPasswordByUserName(userInput.getUserInput()).getPassword();
		}
	}

}
