/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kuzmin.spring.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import ru.kuzmin.spring.dao.TaskDao;
import ru.kuzmin.spring.entities.Task;

/**
 *
 * @author Антон
 */
@Repository
public class JdbcTaskDao extends JdbcDaoSupport implements TaskDao {

	private final RowMapper<Task> taskMapper = (rs, index) -> {
		return new Task(rs.getLong("id"),
				  null,
				  rs.getString("description"));
	};

	@Autowired
	public JdbcTaskDao(DataSource dataSource) {
		setDataSource(dataSource);
		checkDaoConfig();
	}

	@Override
	public List<Task> findAll() {
		return getJdbcTemplate().query("select * from task", taskMapper);
	}

	@Override
	public Task find(Long id) {
		return getJdbcTemplate().queryForObject("select * from task where id = ?",
				  new Long[]{id}, taskMapper);
	}

	@Override
	public Task create(Task task) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		getJdbcTemplate().update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement("insert into task(description) values(?)", new String[]{"id"});
				ps.setString(1, task.getDescription());
				return ps;
			}
		},
				  keyHolder);
		task.setId(keyHolder.getKey().longValue());
		return task;
	}

	@Override
	public void update(Task task) {

	}

	@Override
	public void delete(Task task) {

	}
}
