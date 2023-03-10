package com.humanresourcesproject.humanresourcesproject.modelClasses;
import javax.persistence.*;

import com.humanresourcesproject.humanresourcesproject.users.User;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private long employeeId; 
	private String firstName;
	private String LastName;
	private String jobTitle;
	private String location;
	
	private User typeOfUser;
	
	public User getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(User typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}

