package com.comp301project.LaundryService;
import java.util.ArrayList;
import java.util.List;

import com.comp301project.AboutTime.TimeHandler;
import com.comp301project.Entity.WashingMachine;

public class WashingMachineService {
	
	private List<WashingMachine> allWashingMachines;
	private List<WashingMachine> availableWashingMachines;
	private static WashingMachineService washingMachineServiceSingleton;
	
	private WashingMachineService() {
		allWashingMachines=new ArrayList<WashingMachine>();
		availableWashingMachines=new ArrayList<WashingMachine>();
	}
	
	public static WashingMachineService getWashingMachineServiceInstance() {
		if(washingMachineServiceSingleton==null) {
			washingMachineServiceSingleton=new WashingMachineService();
		}
		return washingMachineServiceSingleton;
	}
	
	public void addNewWashingMachine(WashingMachine newMachine) {
		allWashingMachines.add(newMachine);
	}
	
	public List<WashingMachine> getAllWashingMachines(){
		return allWashingMachines;
	}
	
	public List<WashingMachine> getAvailableMachines(){
		this.availableWashingMachines.clear();
		int currentTime=TimeHandler.getTimeHandlerObject().getCurrentHour();
		System.out.println("current h:"+currentTime);
		for(int i=0;i<allWashingMachines.size();i++) {
			if(this.allWashingMachines.get(i).isAvailableAtThisTime(currentTime)) {
				this.availableWashingMachines.add(allWashingMachines.get(i));
			}
		}
		return this.availableWashingMachines;
	}
	
	public WashingMachine getWashingMachineById(String Id) {
		WashingMachine washingMachine = null;
		for(int i=0;i<this.allWashingMachines.size();i++){
			if(allWashingMachines.get(i).getWashingMachineID().equals(Id)) {
				washingMachine=allWashingMachines.get(i);
			}
		}
		return washingMachine;
	}
}