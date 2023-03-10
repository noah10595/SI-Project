package com.humanresourcesproject.humanresourcesproject.modelClasses;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Account implements Serializable {
private String userName;
private String password;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false, updatable = true)
private Employee employee;
private String role;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	employee = employee;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


}
