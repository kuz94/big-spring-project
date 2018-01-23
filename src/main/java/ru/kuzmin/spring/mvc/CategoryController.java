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
import ru.kuzmin.spring.entities.Category;
import ru.kuzmin.spring.root.CategoryBean;
import ru.kuzmin.spring.root.logger.CommonLogger;

/**
 *
 * @author kuzmin_a_a
 */
@RestController
@RequestMapping("/categories")
public class CategoryController {

	private final CategoryBean categoryBean;
	private final CommonLogger logger;

	@Autowired
	public CategoryController(CategoryBean categoryBean, CommonLogger logger) {
		this.categoryBean = categoryBean;
		this.logger = logger;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> getAllCategories() {
		logger.logEvent("resource:category", "request:findall");
		return categoryBean.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createCategory(Category newCategory) {
		logger.logEvent("resource:category", "request:creating");
		categoryBean.create(newCategory);
	}
}
