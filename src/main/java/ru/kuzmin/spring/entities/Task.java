package ru.kuzmin.spring.entities;

/**
 * A {@code Task} represents task entity from database.
 * Also it is ssh test
 * 
 * @author kuzmin_a_a
 */
public class Task {
	private Long id;
	private Category category;
	private String description;

	public Task() {
	}

	public Task(Long id, Category category, String description) {
		this.id = id;
		this.category = category;
		this.description = description;
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
	
	public void setId(Long id) {
		this.id = id;
	}
}
