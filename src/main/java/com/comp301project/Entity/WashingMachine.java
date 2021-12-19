package com.comp301project.Entity;
import java.util.Collections;
import java.util.List;

import com.comp301project.LaundryService.WashingMachineService;

public class WashingMachine {
	
	public int washingMachineID;
	private int pricePerHour;
	private List<Integer> reservedHours;
	
	public WashingMachine(int washingMachineID,int pricePerHour,List<Integer> reservedHours) {
		this.washingMachineID=washingMachineID;
		this.pricePerHour=pricePerHour;
		this.reservedHours=reservedHours;
		this.sortReservedHours();
		WashingMachineService.getWashingMachineServiceInstance().addNewWashingMachine(this);
		//bu line otomatik ekleme icin simdilik comment
	}
	
	public int getWashingMachineID() {
		return washingMachineID;
	}
	
	public void setWashingMachineID(int washingMachineID) {
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
		System.out.println(reservedHours);
		return reservedHours;
	}
	
	public void setReservedHours(List<Integer> reservedHours) {
		this.reservedHours = reservedHours;
	}
	
	public void makeReservation(int hour) {
		System.out.println("reservation for "+hour+" has done successfully!!");

		this.reservedHours.add(hour);
		//System.out.println(this.reservedHours);

		this.sortReservedHours();
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