package com.jspiders.ars.entities;

//write --> create,update
//read  --> print,use
public class User {

	private String uid;// write --> create Once
	private String name;// write read --> Full access
	private String email;// write read --> Full access
	private String password;// write ONLY --> create , update
	private long mobileNum;// write read --> Full access
	private String role;// write ONLY --> create

	//write
	public void setUid(String uid) {
		if (uid.length() == 0) {
			this.uid = uid;
		}
	}
	//write
	public void setName(String name)
	{
		this.name = name;
	}
	//read
	public String getName()
	{
		return this.name;
	}

}
