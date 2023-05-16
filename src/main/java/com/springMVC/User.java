package com.springMVC;

public class User {
	private String TheName_2;
	private String TheEmail_2;
	@Override
	public String toString() {
		return "User [TheName_2=" + TheName_2 + ", TheEmail_2=" + TheEmail_2 + "]";
	}
	public User(String theName_2, String theEmail_2) {
		super();
		TheName_2 = theName_2;
		TheEmail_2 = theEmail_2;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTheName_2() {
		return TheName_2;
	}
	public void setTheName_2(String theName_2) {
		TheName_2 = theName_2;
	}
	public String getTheEmail_2() {
		return TheEmail_2;
	}
	public void setTheEmail_2(String theEmail_2) {
		TheEmail_2 = theEmail_2;
	}
}
