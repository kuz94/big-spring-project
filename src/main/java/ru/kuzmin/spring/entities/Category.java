package ru.kuzmin.spring.entities;

/**
 *
 * @author kuzmin_a_a
 */
public class Category {
	private Long id;
	private String name;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
