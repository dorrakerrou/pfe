package application.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Missionnaire;


@Repository
public interface MissionnaireRepository extends JpaRepository<Missionnaire , String>{

	@Query("select o from Missionnaire o where o.cin=:x")
	public Optional<Missionnaire> getMiss(@Param("x")String cin); 

	
}
