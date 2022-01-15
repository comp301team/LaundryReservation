package com.comp301project.AboutTime;

public class TimeHandler {
	
	private int currentHour=0;
	private static TimeHandler timeHandlerInstance;
	
	public static TimeHandler getTimeHandlerObject() {
		if(timeHandlerInstance==null) {
			timeHandlerInstance=new TimeHandler();
		}
		return timeHandlerInstance;
	}
	
	public void increaseHourByOne() {
		this.currentHour++;
		if(this.currentHour==24) {
			this.currentHour=0;
		}
	}
	
	public void decreaseHourByOne() {
		this.currentHour--;
		if(this.currentHour==-1) {
			this.currentHour=23;
		}
	}
	
	public void handleTime(String type) {
		if(type.equals("increaseHour")) {
			this.increaseHourByOne();
		}
		else {
			this.decreaseHourByOne();
		}
	}
	
	public int getCurrentHour() {
		return currentHour;
	}
	
	public void setCurrentHour(int currentHour) {
		this.currentHour=currentHour;
	}
	
	public String getCurrentHourAsNicelyFormatted() {
		if(this.currentHour/10==0) {
			return "0"+this.currentHour+":00-"+"0"+this.currentHour+":59";
		}
		else {
			return this.currentHour+":00-"+this.currentHour+":59";
		}
	}
	
}