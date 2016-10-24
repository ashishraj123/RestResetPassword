package com.reset.UserRecord;

import javax.annotation.Resource;

import org.dozer.Mapper;
 import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.reset.Interface.UserService;
import com.reset.Utils.UtilityImpl;
import com.reset.pasword.UserRecordObject;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;
	
	@Resource
	private Mapper mapper;
	
	private final String DEFAULT_PASSWORD_STRING="Welcome123";
	
	private UtilityImpl utility;
	
	@Override
	public UserRecordObject setUserPasswordByEmailId(String emailId) {
		UserRecord userRecord=userRepository.findByEmailId(emailId);
		userRecord.setPassword(utility.generateMD5Password(DEFAULT_PASSWORD_STRING));
		return mapper.map(userRecord, UserRecordObject.class);
	}

	@Override
	public UserRecordObject setUserPasswordByUserName(String userName) {
		UserRecord userRecord=userRepository.findByUserName(userName);
		userRecord.setPassword(utility.generateMD5Password(DEFAULT_PASSWORD_STRING));
		return mapper.map(userRecord, UserRecordObject.class);
	}

	@Override
	public UserRecordObject setUserPasswordByMobile(String mobileNumber) {
		UserRecord userRecord=userRepository.findByMobileNumber(mobileNumber);
		userRecord.setPassword(utility.generateMD5Password(DEFAULT_PASSWORD_STRING));
		return mapper.map(userRecord, UserRecordObject.class);
	}
	
//	private UserRepository getApplicationContext(){
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//				BeanConfiguration.class);
//		UserRepository repository = context.getBean(UserRepository.class);
//	}

	
}
