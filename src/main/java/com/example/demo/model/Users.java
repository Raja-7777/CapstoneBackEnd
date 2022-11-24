package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class Users {
	
	@Id
	@Column(name = "Userid")
	String id;
//	@Column(name = "Name")
	String name;
//	@Column(name = "Email_Id")
	String emailid;
//	@Column(name = "Mobile_No")
	String mobno;
//	@Column(name = "Password_E")
	String password;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		BCryptPasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
		String encryptedPwd = pwdEncoder.encode(password);
		this.password = encryptedPwd;

		
	}
	@Override
	public String toString() {
		return "NetflixUsers [id=" + id + ", name=" + name + ", emailid=" + emailid + ", mobno=" + mobno + ", password="
				+ password + "]";
	}
	public Users(String id, String name, String emailid, String mobno, String password) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.mobno = mobno;
		this.password = password;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailid, id, mobno, name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(emailid, other.emailid) && Objects.equals(id, other.id)
				&& Objects.equals(mobno, other.mobno) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
	
	
	
	
	

}

