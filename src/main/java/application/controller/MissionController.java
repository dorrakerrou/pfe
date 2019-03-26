package application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Missionnaire;
import application.model.Mission;
import application.service.Missiondao;


@RestController
@RequestMapping("/api/mission")
@CrossOrigin("*")
public class MissionController {
	
	@Autowired
	Missiondao missiondao;
	
	
	@GetMapping("/listmission")
	public List<Mission> getMission() {
		return missiondao.getMissions() ; 
		
	}
	@PostMapping("/add")
	public Mission addMission(@RequestBody Mission Mission)
	{
		return missiondao.addMission(Mission);
	}
	
	@PutMapping("/update")
	public void updateMission(@RequestBody Mission missiona)
	{
		missiondao.updateMission(missiona);
		
	}
	@DeleteMapping("/{code}")
	public void deleteMission(@PathVariable Long code)
	{
		missiondao.deleteMission(code);
	}
	
}