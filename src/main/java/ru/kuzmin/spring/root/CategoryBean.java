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
import ru.kuzmin.spring.entities.Category;
import ru.kuzmin.spring.root.logger.CommonLogger;

/**
 *
 * @author kuzmin_a_a
 */
@Component
public class CategoryBean {
	private CommonLogger logger;

	@Autowired
	public void setLogger(CommonLogger logger) {
		this.logger = logger;
	}

	public List<Category> findAll() {
		logger.logEvent("bean:category", "findAll");
		List<Category> categories = new ArrayList<>();
		categories.add(new Category("category"));
		return categories;
	}

	public Category create(Category newCategory) {
		logger.logEvent("bean:category", "creating:" + newCategory.getName());
		return newCategory;
	}
}
