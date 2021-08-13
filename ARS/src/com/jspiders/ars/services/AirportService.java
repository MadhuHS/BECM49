package com.jspiders.ars.services;

import com.jspiders.ars.entities.Airport;

public class AirportService {
	
	Airport a1;
	
	public void addAirport(String airportName, 
			String abbvrivation, String location)
	{
		//new DATA
		a1 = new Airport(airportName,abbvrivation,location);//constructor call
		
		System.out.println("airport added");
	}
	
	public void editAirportName(String newAirportName)
	{
		if(a1 != null)
		{
		 a1.setAirportName(newAirportName);//update
		}
		else
		{
			System.out.println("ERROR : Airpirt do not exist");
		}
	}
	
	//Assignment : implement all other update Methods
	
	public void showAirportDetails()
	{
		if(a1 != null)
		{
		System.out.println(a1.getAirportName());
		System.out.println(a1.getAbbvrivation());
		System.out.println(a1.getLocation());
		}
		else
		{
			System.out.println("ERROR : Airpirt do not exist");
		}
	}

}
