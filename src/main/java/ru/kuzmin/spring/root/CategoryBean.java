/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.root;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.kuzmin.spring.entities.Category;

/**
 *
 * @author kuzmin_a_a
 */
@Component
public class CategoryBean {
	private static final Logger logger = LoggerFactory.getLogger(CategoryBean.class);

	public List<Category> findAll() {
		logger.info("bean:{}:method:{}", "category", "findAll");
		List<Category> categories = new ArrayList<>();
		categories.add(new Category("category"));
		return categories;
	}

	public Category create(Category newCategory) {
		logger.info("bean:{}:method:{}", "category", "create");
		return newCategory;
	}
}
