 package application.service;

import java.util.List;
import java.util.Optional;

import application.model.Missionnaire;


public interface IMissionnaire {
  
	List<Missionnaire> getMissionnaires() ; 
	
	Missionnaire addMissionaire(Missionnaire missionaire) ; 
	
	void updateMissionaire(Missionnaire missionaire) ; 
	
	void deleteteMissionaire(String cin) ;

	

}
