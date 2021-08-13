package com.jspiders.ars.entities;

public class Airport {

	private String airportName;
	private String abbvrivation;
	private String location;
	
	public Airport(String airportName,String abbvrivation,String location)
	{
		this.airportName = airportName;
		this.abbvrivation = abbvrivation;
		this.location = location;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAbbvrivation() {
		return abbvrivation;
	}

	public void setAbbvrivation(String abbvrivation) {
		this.abbvrivation = abbvrivation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
