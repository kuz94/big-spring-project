/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.dao;

/**
 *
 * @author kuzmin_a_a
 */
public class Task {
	private Long id;
	private Category category;
	private String description;

	public Task() {
	}

	public Task(Category category, String description) {
		this.category = category;
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}
}
