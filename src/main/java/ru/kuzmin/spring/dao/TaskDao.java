/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
