package jp.co.aforce.bean;

import java.io.Serializable;

public class Info implements Serializable {
	
	private String memberId;
	private String lastName;
	private String firstName;
	private String sex;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String job;
	private String phoneNumber;
	private String mailAddress;
	
	//get
	public String getMemberId() {
		return memberId;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSex() {
		return sex;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public String getJob() {
		return job;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	
	//set
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
	
	

}
