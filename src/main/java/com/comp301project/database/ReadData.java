package com.comp301project.database;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.comp301project.Entity.WashingMachine;
import com.comp301project.LaundryService.WashingMachineService;

public class ReadData {

	@SuppressWarnings("unchecked")
	public void ReadDataFromFile() {
		JSONParser parser=new JSONParser();
		File dataBaseFile=new File("LaundryDataset.json");
		try {
			FileReader fileReader=new FileReader(dataBaseFile);
			Object parsedFile = parser.parse(fileReader);
			ArrayList<JSONObject> washingMachines = (ArrayList<JSONObject>) parsedFile;
			int hourValue=0;
			for(int i=0;i<washingMachines.size();i++) {
				ArrayList<Integer> reservedHours = new ArrayList<Integer>();
				JSONObject currentMachine= washingMachines.get(i);
			    String ID = (String) currentMachine.get("washingMachineID");
			    int price=((Long) currentMachine.get("pricePerHour")).intValue();
			    JSONArray reservedHoursArray=(JSONArray) currentMachine.get("reservedHours");
			    for(int j=0;j<reservedHoursArray.size();j++) {
			    	hourValue=((Long) reservedHoursArray.get(j)).intValue();
			    	reservedHours.add(hourValue);
			    }
			    WashingMachine washingMachine = new WashingMachine (ID,price,reservedHours);
			    WashingMachineService.getWashingMachineServiceInstance().addNewWashingMachine(washingMachine);
			}
			for(int i=0;i<WashingMachineService.getWashingMachineServiceInstance().getAllWashingMachines().size();i++) {
				System.out.println(WashingMachineService.getWashingMachineServiceInstance().getAllWashingMachines().get(i).getReservedHours());
			}
		}
		catch(Exception exception) {
			WashingMachineService.getWashingMachineServiceInstance().getAllWashingMachines().clear();
			//defaultları jsona yazdir
		}
	}
	
}