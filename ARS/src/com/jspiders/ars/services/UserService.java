package com.jspiders.ars.services;

import com.jspiders.ars.entities.User;

public class UserService {

	public void signup(String name,String userName,String password,long mob)
	{
		User u1 = new User();
		
		u1.setUid("user1234");
		u1.setName(name);
		u1.setEmail(userName);
		u1.setPassword(password);
		u1.setMobileNum(mob);
		u1.setRole("Customer");
		
		System.out.println("name      : "+u1.getName());
		System.out.println("username  : "+u1.getEmail());
		System.out.println("user Mob  : "+u1.getMobileNum());
		
	}
}
