package user.details;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import practice.Practice;
import role.details.Role;
import service.Service;

@Entity
@Table(name = "User")
public class User {

	@Id @GeneratedValue
	private int    id;
	private String password;
	private String name;
	private String mobileNum;
	private String emailId;

	
	@OneToOne(cascade=CascadeType.ALL)
	private Role role; // many to one mapping with role tables*/
	
	@OneToOne(cascade=CascadeType.ALL)
	private Service service; // many to one mapping with service table
	
	@OneToOne(cascade=CascadeType.ALL)
	private Practice practice;//// many to one mapping with practice tables
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Practice getPractice() {
		return practice;
	}

	public void setPractice(Practice practice) {
		this.practice = practice;
	}

	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	
	public User(String password,String name,String mob,String email)
	{
	 this.mobileNum=mob;
	 this.name=name;
	 this.emailId=email;
	 this.password=password;
	 
	}
	
	
}
