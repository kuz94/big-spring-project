package ru.kuzmin.spring.dao;

import ru.kuzmin.spring.entities.Category;
import ru.kuzmin.spring.entities.Task;

import java.util.List;

public interface CategoryDao {

    List<Category> findAll();

    Category find(Long id);

    Category create(Task category);

    void update(Category category);

    void delete(Category category);

}
