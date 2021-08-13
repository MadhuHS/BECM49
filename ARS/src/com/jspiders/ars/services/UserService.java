package com.jspiders.ars.services;

import com.jspiders.ars.entities.User;

public class UserService {

	User u1;
	
	public void signup(String name,String userName,String password,long mob)
	{
		u1 = new User("user1234",name,userName,password,mob,"Customer");
		
		System.out.println("name      : "+u1.getName());
		System.out.println("username  : "+u1.getEmail());
		System.out.println("user Mob  : "+u1.getMobileNum());
		
	}
	
	public void updateUserPassword()
	{
		
	}
	
	//Assignment : implement showUserDetails() and  all other update Methods
}
