package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Formdata {
	
	@Id
	
	private String mobile;
	private String age;
	private String pan;
	private String cibil;
	private String emptype;
	private String service;
	private String income;
	private String loan;
	private String tenure;
	private String carname;
	private String name;
	private String bank;
	private String account;
	
	public Formdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Formdata(String mobile, String age, String pan, String cibil, String emptype, String service, String income,
			String loan, String tenure, String carname, String name, String bank, String account) {
		super();
		this.mobile = mobile;
		this.age = age;
		this.pan = pan;
		this.cibil = cibil;
		this.emptype = emptype;
		this.service = service;
		this.income = income;
		this.loan = loan;
		this.tenure = tenure;
		this.carname = carname;
		this.name = name;
		this.bank = bank;
		this.account = account;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getCibil() {
		return cibil;
	}
	public void setCibil(String cibil) {
		this.cibil = cibil;
	}
	public String getEmptype() {
		return emptype;
	}
	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Formdata [mobile=" + mobile + ", age=" + age + ", pan=" + pan + ", cibil=" + cibil + ", emptype="
				+ emptype + ", service=" + service + ", income=" + income + ", loan=" + loan + ", tenure=" + tenure
				+ ", carname=" + carname + ", name=" + name + ", bank=" + bank + ", account=" + account + "]";
	}
	
	
	
	
}
