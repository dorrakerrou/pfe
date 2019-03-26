package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.AvoirFrais;
import application.model.AvoirFraisPK;

@Repository
public interface AvoirFraisRepository extends JpaRepository<AvoirFrais, AvoirFraisPK> {


	

	}
