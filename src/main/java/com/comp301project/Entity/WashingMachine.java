package com.comp301project.Entity;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.comp301project.database.WriteData;

public class WashingMachine {
	
	private String washingMachineID;
	private int pricePerHour;
	private List<Integer> reservedHours;
	
	public WashingMachine(String washingMachineID,int pricePerHour,List<Integer> reservedHours) {
		this.washingMachineID=washingMachineID;
		this.pricePerHour=pricePerHour;
		this.reservedHours=reservedHours;
		this.sortReservedHours();
	}
	
	public String getWashingMachineID() {
		return washingMachineID;
	}
	
	public void setWashingMachineID(String washingMachineID) {
		this.washingMachineID = washingMachineID;
	}
	
	public int getPricePerHour() {
		return pricePerHour;
	}
	
	public void setPricePerHour(int pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	public List<Integer> getReservedHours() {
		this.sortReservedHours();
		return reservedHours;
	}
	
	public void setReservedHours(List<Integer> reservedHours) {
		this.reservedHours = reservedHours;
	}
	
	public void makeReservation(int hour) throws IOException {
		if(isAvailableAtThisTime(hour)) {
			this.reservedHours.add(hour);
			this.sortReservedHours();
			WriteData.getWriter().save();
		}
	}
	
	private void sortReservedHours() {
		Collections.sort(this.reservedHours);
	}
	
	public boolean isAvailableAtThisTime(int time) {
		for(int i=0;i<this.reservedHours.size();i++) {
			if(this.reservedHours.get(i)==time) {
				return false;
			}
		}
		return true;
	}
	
}