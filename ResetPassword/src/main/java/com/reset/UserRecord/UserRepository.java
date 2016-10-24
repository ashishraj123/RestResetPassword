package com.reset.UserRecord;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, Long> {

	 public UserRecord findByUserName(String userName);
	 public UserRecord findByEmailId(String emailId);
	 public UserRecord findByMobileNumber(String mobileNumber);
}
