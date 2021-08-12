package com.jspiders.ars.services;

import com.jspiders.ars.entities.User;

public class UserService {

	public void signup(String name,String userName,String password,long mob)
	{
		User u1 = new User();
		
		u1.setUid("uuwodbs");
		u1.setName(name);
		
		System.out.println(u1.getName());
		
	}
}
