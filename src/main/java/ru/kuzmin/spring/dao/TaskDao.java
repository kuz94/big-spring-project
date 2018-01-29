package ru.kuzmin.spring.dao;

import ru.kuzmin.spring.entities.Task;
import java.util.List;

/**
 *
 * @author Антон
 */
public interface TaskDao {
	
	List<Task> findAll();
	
	Task find(Long id);
	
	Task create(Task task);
	
	void update(Task task);
	
	void delete(Task task);
}
