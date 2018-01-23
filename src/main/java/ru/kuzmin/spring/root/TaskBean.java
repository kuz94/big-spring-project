/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.root;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kuzmin.spring.dao.Category;
import ru.kuzmin.spring.dao.Task;
import ru.kuzmin.spring.root.logger.CommonLogger;

/**
 *
 * @author kuzmin_a_a
 */
@Component
public class TaskBean {
	private CommonLogger logger;

	@Autowired
	public void setLogger(CommonLogger logger) {
		this.logger = logger;
	}

	public List<Task> findAll() {
		logger.logEvent("bean:task", "findAll");
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(new Category("category"), "task"));
		return tasks;
	}

	public Task create(Task newTask) {
		logger.logEvent("bean:task", "create"
											  + ":" + newTask.getCategory().getName()
											  + ":" + newTask.getDescription());
		return newTask;
	}
}
