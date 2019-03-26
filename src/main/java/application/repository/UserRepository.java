package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Utilisateur;


@Repository
public interface UserRepository extends JpaRepository<Utilisateur, String>{

	Utilisateur findByUsername(String str);

}