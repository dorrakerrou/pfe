package application.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import application.model.Utilisateur;
import application.repository.UserRepository;


@Service
@Primary
public class UserService implements ICrudService<Utilisateur, String>{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Utilisateur> getAll() {
		return userRepository.findAll();
	}

	@Override
	public void add(Utilisateur user) {
		userRepository.save(user);
	}

	@Override
	public void update(Utilisateur user) {
		userRepository.save(user);
	}

	

	@Override
	public void saveAll(Iterable<Utilisateur> iterable) {
		userRepository.saveAll(iterable);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	
}
