package com.jspiders.ars.entities;

import java.util.Date;

public class Flight {

	private String flightNo;
	private String airline;
	private String departCity;
	private String arrivalCity;
	private Date departDate;
	private Date arriavlDate;
	private String departTime;
	private String arriavlTime;
	private int firstClassSeatsAvilable;
	private double firstClassSeatCost;
	private int BuisClassSeatsAvilable;
	private double BuisClassSeatCost;
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepartCity() {
		return departCity;
	}
	public void setDepartCity(String departCity) {
		this.departCity = departCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getArriavlDate() {
		return arriavlDate;
	}
	public void setArriavlDate(Date arriavlDate) {
		this.arriavlDate = arriavlDate;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getArriavlTime() {
		return arriavlTime;
	}
	public void setArriavlTime(String arriavlTime) {
		this.arriavlTime = arriavlTime;
	}
	public int getFirstClassSeatsAvilable() {
		return firstClassSeatsAvilable;
	}
	public void setFirstClassSeatsAvilable(int firstClassSeatsAvilable) {
		this.firstClassSeatsAvilable = firstClassSeatsAvilable;
	}
	public double getFirstClassSeatCost() {
		return firstClassSeatCost;
	}
	public void setFirstClassSeatCost(double firstClassSeatCost) {
		this.firstClassSeatCost = firstClassSeatCost;
	}
	public int getBuisClassSeatsAvilable() {
		return BuisClassSeatsAvilable;
	}
	public void setBuisClassSeatsAvilable(int buisClassSeatsAvilable) {
		BuisClassSeatsAvilable = buisClassSeatsAvilable;
	}
	public double getBuisClassSeatCost() {
		return BuisClassSeatCost;
	}
	public void setBuisClassSeatCost(double buisClassSeatCost) {
		BuisClassSeatCost = buisClassSeatCost;
	}
	
	
}
