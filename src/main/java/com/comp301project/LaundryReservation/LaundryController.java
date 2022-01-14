package com.comp301project.LaundryReservation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.comp301project.AboutTime.TimeHandler;
import com.comp301project.LaundryService.WashingMachineService;

@Controller
public class LaundryController {
	
	@GetMapping
	public ModelAndView get(Model model) {
		model.addAttribute("allMachines",WashingMachineService.getWashingMachineServiceInstance().getAllWashingMachines());
		model.addAttribute("currentTime",TimeHandler.getTimeHandlerObject());
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}
	
	@PostMapping
	@ResponseBody
	public ModelAndView post(@RequestParam String value,Model model) {
		if(value.equals("increaseHour") || value.equals("decreaseHour")) {
			HandleHourChanging(value);
		}
		else {
			WashingMachineService.getWashingMachineServiceInstance().getWashingMachineById(value).makeReservation(TimeHandler.getTimeHandlerObject().getCurrentHour());
		}
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("redirect:/");
	    return modelAndView;
	}
		
	private void HandleHourChanging(String value) {
		if(value.equals("increaseHour")) {
			TimeHandler.getTimeHandlerObject().increaseHourByOne();
		}
		else {
			TimeHandler.getTimeHandlerObject().decreaseHourByOne();
		}
	}
	
}