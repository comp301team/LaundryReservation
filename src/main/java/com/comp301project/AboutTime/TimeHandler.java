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
		handleHourEndPoints();
	}
	
	public void decreaseHourByOne() {
		this.currentHour--;
		handleHourEndPoints();
	}
	
	public int getCurrentHour() {
		handleHourEndPoints();
		return currentHour;
	}
	
	public void setCurrentHour(int currentHour) {
		this.currentHour=currentHour;
		handleHourEndPoints();
	}
	
	public String getCurrentHourAsNicelyFormatted() {
		if(this.currentHour/10==0) {
			return "0"+this.currentHour+":00-"+"0"+this.currentHour+":59";
		}
		
		else {
			return this.currentHour+":00-"+this.currentHour+":59";
		}
	}
	
	private void handleHourEndPoints() {
		if(this.currentHour>23) {
			this.currentHour=0;
		}
		
		if(this.currentHour<0) {
			this.currentHour=23;
		}
	}
	
}