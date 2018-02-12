package ru.kuzmin.spring.dao.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import ru.kuzmin.spring.dao.CategoryDao;
import ru.kuzmin.spring.entities.Category;
import ru.kuzmin.spring.entities.Task;

import javax.sql.DataSource;
import java.util.List;

public class JdbcCategoryDao extends JdbcDaoSupport implements CategoryDao {

    public JdbcCategoryDao(DataSource dataSource) {
        setDataSource(dataSource);
        checkDaoConfig();
    }

    @Override
    public List<Category> findAll() {

        return null;
    }

    @Override
    public Category find(Long id) {
        return null;
    }

    @Override
    public Category create(Task category) {
        return null;
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }
}
