/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kuzmin.spring.dao.TaskDao;
import ru.kuzmin.spring.entities.Category;
import ru.kuzmin.spring.entities.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kuzmin_a_a
 */
@Component
public class TaskBean {
	private static final Logger logger = LoggerFactory.getLogger(TaskBean.class);
	private TaskDao taskDao;

	@Autowired
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

	public List<Task> findAll() {
		logger.info("bean:{}:method:{}", "task", "findAll");
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task(new Category("category"), "task"));
		return tasks;
	}

	public Task create(Task newTask) {
		logger.info("bean:{}:method:{}", "task", "create");
		return taskDao.create(newTask);
	}
}
