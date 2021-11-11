package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.com.example.demo.Model.Passenger;
import com.example.demo.PassengerRepository.passengerData;

@Controller
public class PassengerController {
	@Autowired
	private PassengerData passengerData;

	@RequestMapping("/dataView")
	public String PassengerView() {
		return "dataView";
	}
	
	@RequestMapping("/saveData")
	public String PassengerData(@ModelAttribute("Passenger") Passenger Pass, ModelMap modelmap) {
		passengerData.save(con);
		modelmap.addAttribute("sms", "Data Saved!!");
		return "dataView";
	}

	@RequestMapping("/getConnection")
	public String getPassengerConnection(ModelMap modelMap) {
		List<Passenger> Passengers = passengerData.findAll();
		modelMap.addAttribute("Passengers", Passenger);
		return "getConnection";
	}

	@RequestMapping("/displayLocation")
	public String displayPassengerLocations(ModelMap modelMap) {
		List<Passenger> Passengers = passengerdata.findAll();
		modelMap.addAttribute("Passenger", Passengers);
		return "getConnection";

	}
}


