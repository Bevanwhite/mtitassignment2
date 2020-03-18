package com.mtit.group.beans;

public class Customer {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -5577579081118070434L;
	
	private int cid;
	private String name;
	private int age;
	private int roomNumber;
	private int numberOfPeople;
	private int numberOfDays;
	private double amount;
	private double realamount;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public double getAmount() {
		realamount= numberOfPeople * numberOfDays * amount ;
		return realamount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return cid + "::" + name + "::" + age + "::" +roomNumber;
	}
	

}
