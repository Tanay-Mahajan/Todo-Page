package com.todo.webApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.webApplication.model.userLoginDetails;
import com.todo.webApplication.model.userLoginDetailsRepo;

@Service
public class LoginService {

	@Autowired
	userLoginDetailsRepo loginrepo;
	
	public boolean validateUser(String userId, String password) {
		boolean isLoginSuccess = loginrepo.findUserExtist(userId,password);
		System.out.println(isLoginSuccess);
		return isLoginSuccess;
	}
	
	public void insertIntoDb(String userId,String userPassword,String userName,String userEmail,String userContactNo)
	{	
		userLoginDetails userDetails = new userLoginDetails();
		userDetails.setUserId(userId);
		userDetails.setUserName(userName);
		userDetails.setUserPassword(userPassword);
		userDetails.setUserEmail(userEmail);
		userDetails.setUserContactNo(userContactNo);
		
		loginrepo.save(userDetails);
	}
}

