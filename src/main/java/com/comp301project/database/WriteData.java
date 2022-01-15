package com.comp301project.database;

import java.io.FileWriter;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.comp301project.Entity.WashingMachine;
import com.comp301project.LaundryService.WashingMachineService;

public class WriteData {

	private static FileWriter file;
	private static WriteData writer;
	
	public static WriteData getWriter() {
		if(writer==null) {
			writer=new WriteData();
		}
		return writer;
	}
	
	@SuppressWarnings("unchecked")
	public void save() {
		List<WashingMachine> allMachines=WashingMachineService.getWashingMachineServiceInstance().getAllWashingMachines();
		JSONArray allMachinesArray=new JSONArray();
		for(int i=0;i<allMachines.size();i++) {
			JSONObject washingMachine = new JSONObject();
			washingMachine.put("washingMachineID", allMachines.get(i).getWashingMachineID());
			washingMachine.put("pricePerHour", allMachines.get(i).getPricePerHour());
			List<Integer> reservedHours=allMachines.get(i).getReservedHours();
			JSONArray reservedHoursArray = new JSONArray();
			for(int j=0;j<reservedHours.size();j++) {
				reservedHoursArray.add(reservedHours.get(j));
			}
			washingMachine.put("reservedHours", reservedHoursArray);
			allMachinesArray.add(washingMachine);
		}
		handleSavingToFile(allMachinesArray);
    }

	private void handleSavingToFile(JSONArray allMachines) {
		try {
			file = new FileWriter("LaundryDataset.json");
	        file.write(allMachines.toJSONString());
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		finally {
			try {
				file.flush();
		        file.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
    }
	
}