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
import ru.kuzmin.spring.entities.Category;
import ru.kuzmin.spring.root.CategoryBean;

import java.util.List;

/**
 *
 * @author kuzmin_a_a
 */
@RestController
@RequestMapping("/categories")
public class CategoryController {
	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	private final CategoryBean categoryBean;

	@Autowired
	public CategoryController(CategoryBean categoryBean) {
		this.categoryBean = categoryBean;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> getAllCategories() {
		logger.info("resource:{}:request:{}", "category", "findAll");
		return categoryBean.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createCategory(Category newCategory) {
		logger.info("resource:{}:request:{}", "category", "create");
		categoryBean.create(newCategory);
	}
}
