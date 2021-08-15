package com.example.demo.app.repository.view;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.app.entity.view.View;

@Repository
public class ViewDaoImpl implements ViewDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ViewDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<View> getAll() {
		String sql = "select * from band;";
		List<Map<String , Object>> map = jdbcTemplate.queryForList(sql);
		List<View> list = new ArrayList<>();
		map.stream().forEach(
				target-> {
					View instance = new View();
					instance.setId((int)target.get("id"));
					instance.setBandName((String)target.get("bandName"));
					instance.setBestSong((String)target.get("bestSong"));
					instance.setCreated(((Timestamp)target.get("created")).toLocalDateTime());
					list.add(instance);
					});
		return list;
	}

	@Override
	public void insert(View view) {
		// TODO Auto-generated method stub

	}

	@Override
	public int update(View view) {
		// TODO Auto-generated method stub
		return 0;
	}

}
