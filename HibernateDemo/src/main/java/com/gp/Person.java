package com.gp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {
@Id@GeneratedValue
private int personId;
@Column
private String personName;
@Column
private String mobile;

@OneToMany(mappedBy="person", cascade= CascadeType.ALL)
private List<Vehicle> vehicles=new ArrayList<Vehicle>();

public Person() {
	super();
}

public Person(int personId, String personName, String mobile) {
	super();
	this.personId = personId;
	this.personName = personName;
	this.mobile = mobile;
}

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public List<Vehicle> getVehicles() {
	return vehicles;
}

public void setVehicles(List<Vehicle> vehicles) {
	this.vehicles = vehicles;
}
}
