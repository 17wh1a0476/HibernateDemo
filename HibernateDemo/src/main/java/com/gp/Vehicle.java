package com.gp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id@GeneratedValue
	private int vehicleId;
	@Column
	private String vehicleName;
	@Column
	private String model;

	@ManyToOne
	@JoinColumn(name="personId")
	private Person person;

	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleId, String vehicleName, String model) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.model = model;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}	
}
