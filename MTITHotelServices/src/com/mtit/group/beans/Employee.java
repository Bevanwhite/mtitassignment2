package com.mtit.group.beans;

public class Employee {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -5577579081118070434L;
	
	private int eid;
	private String name;
	private int age;
	private String marriageStatus;
	private String address;
	private float workinghoursperday;
	private float amountperhour;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public String getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getWorkinghoursperday() {
		return workinghoursperday;
	}
	public void setWorkinghoursperday(float workinghoursperday) {
		this.workinghoursperday = workinghoursperday;
	}

	public void setAmountperhour(float amountperhour) {
		this.amountperhour = amountperhour;
	}
	
	
	@Override
	public String toString() {
		return eid + "::" + name + "::" + age + "::" + marriageStatus + "::" + workinghoursperday + "::" + amountperhour;
	}

}
