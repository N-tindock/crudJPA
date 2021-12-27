package com.text.form;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private String userName;

private String password;

private String email;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Register [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
}

}
