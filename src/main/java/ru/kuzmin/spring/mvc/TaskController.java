/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.kuzmin.spring.entities.Task;
import ru.kuzmin.spring.root.TaskBean;

import java.util.List;

/**
 *
 * @author kuzmin_a_a
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
	private final TaskBean taskBean;

	@Autowired
	public TaskController(TaskBean taskBean) {
		this.taskBean = taskBean;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Task> getAllTasks() {
		logger.info("resource:{}:request{}", "task", "findAll");
		return taskBean.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Task createTask(Task newTask) {
		logger.info("resource:{}:request{}", "task", "create");
		return taskBean.create(newTask);
	}
}
