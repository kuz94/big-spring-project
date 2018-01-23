/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.mvc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.kuzmin.spring.entities.Task;
import ru.kuzmin.spring.root.TaskBean;
import ru.kuzmin.spring.root.logger.CommonLogger;

/**
 *
 * @author kuzmin_a_a
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
	private final TaskBean taskBean;
	private final CommonLogger logger;

	@Autowired
	public TaskController(TaskBean taskBean, CommonLogger logger) {
		this.taskBean = taskBean;
		this.logger = logger;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Task> getAllTasks() {
		logger.logEvent("resource:task", "request:findall");
		return taskBean.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Task createTask(Task newTask) {
		logger.logEvent("resource:task", "request:creating");
		return taskBean.create(newTask);
	}
}
