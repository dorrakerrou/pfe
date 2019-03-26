package application.service;

import java.util.List;

public interface ICrudService<T, ID> {

    List<T> getAll();
	
	void add(T entity);
	
	void update(T entity);
		
	void saveAll(Iterable<T> iterable);

	void delete(String id);
	
	//void delete(String id);


}
