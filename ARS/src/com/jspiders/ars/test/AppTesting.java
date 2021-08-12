package com.jspiders.ars.test;

import com.jspiders.ars.services.UserService;

public class AppTesting
{
	public static void main(String[] args)
	{
		UserService us1 = new UserService();
		us1.signup("User1", "user@gmail.com","abc123",9876543210l);
	}
}
