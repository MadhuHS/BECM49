package com.jspiders.ars.test;

import com.jspiders.ars.services.AirportService;
import com.jspiders.ars.services.UserService;

public class AppTesting
{
	public static void main(String[] args)
	{
		UserService us1 = new UserService();
		us1.signup("User1", "user@gmail.com","abc123",9876543210l);
		
		System.out.println("--------------");
		
		AirportService as1 = new AirportService();
	    as1.addAirport("BangloreAirport","BIAP","Bangalore");
		as1.showAirportDetails();
		
		as1.editAirportName("Banglore INTL. Airport");
		as1.showAirportDetails();
	}
}
