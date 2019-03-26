package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Classe;
import application.service.Classedao;



@RestController
@RequestMapping("/api/listclasse")
@CrossOrigin("*")

public class ClasseController {
	
	
	@Autowired
	Classedao classedao;
	
	@GetMapping("/listClasse")
	public List<Classe> getAllclasses(){
		return classedao.findAll();
	}


}
