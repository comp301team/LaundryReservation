package com.comp301project.database;

import java.util.ArrayList;
import java.util.Arrays;
import com.comp301project.Entity.WashingMachine;
import com.comp301project.LaundryService.WashingMachineService;

public class WriteDefaultData {

	private static WriteDefaultData writeDefaultData;
	
	public static WriteDefaultData getInstance() {
		if(writeDefaultData==null) {
			writeDefaultData=new WriteDefaultData();
		}
		return writeDefaultData;
	}
	
	public void returnToDefaults() {
		try {
			WashingMachineService service=WashingMachineService.getWashingMachineServiceInstance();
			Integer rh1[] = {4, 5, 8, 11, 12, 13, 17, 19, 20};
			Integer rh2[] = {0, 1, 3, 4, 7, 10, 12, 13, 14, 16, 17};
			Integer rh3[] = {4, 6, 7, 12, 13, 14, 18, 19, 23};
			Integer rh4[] = {1, 3, 5, 6, 9, 12, 13, 16, 19};
			Integer rh5[] = {3, 10, 12, 14, 16, 18, 20};
			Integer rh6[] = {0, 4, 12, 13, 21, 22, 23};
			Integer rh7[] = {3, 7, 12, 13, 15, 16, 17, 21};
			Integer rh8[] = {0, 6, 10, 11, 12, 14, 17, 19};
			WashingMachine wm1=new WashingMachine("1",5,new ArrayList<>(Arrays.asList(rh1)));
			WashingMachine wm2=new WashingMachine("2",7,new ArrayList<>(Arrays.asList(rh2)));
			WashingMachine wm3=new WashingMachine("3",9,new ArrayList<>(Arrays.asList(rh3)));
			WashingMachine wm4=new WashingMachine("4",3,new ArrayList<>(Arrays.asList(rh4)));
			WashingMachine wm5=new WashingMachine("5",10,new ArrayList<>(Arrays.asList(rh5)));
			WashingMachine wm6=new WashingMachine("6",8,new ArrayList<>(Arrays.asList(rh6)));
			WashingMachine wm7=new WashingMachine("7",2,new ArrayList<>(Arrays.asList(rh7)));
			WashingMachine wm8=new WashingMachine("8",5,new ArrayList<>(Arrays.asList(rh8)));
			service.addNewWashingMachine(wm1);
			service.addNewWashingMachine(wm2);
			service.addNewWashingMachine(wm3);
			service.addNewWashingMachine(wm4);
			service.addNewWashingMachine(wm5);
			service.addNewWashingMachine(wm6);
			service.addNewWashingMachine(wm7);
			service.addNewWashingMachine(wm8);
			WriteData.getWriter().save();
		}
		catch(Exception e){
			System.out.println("An error occurred at writing defaults!");
		}
	}
	
}