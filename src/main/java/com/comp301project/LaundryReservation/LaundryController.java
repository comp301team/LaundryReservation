package com.comp301project.LaundryReservation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.comp301project.AboutTime.TimeHandler;
import com.comp301project.LaundryService.WashingMachineService;

@Controller
public class LaundryController {
	
	@GetMapping("/")
	public String get(Model model) {
		model.addAttribute("message",WashingMachineService.getWashingMachineServiceInstance().getAllWashingMachines());
		model.addAttribute("currentTime",TimeHandler.getTimeHandlerObject());
		return "home";
	}
	
	@GetMapping("/qq")
	public int getQ() {
		return 26;
	}
	
}
