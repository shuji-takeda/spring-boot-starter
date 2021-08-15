package com.example.demo.app.service.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.entity.view.View;
import com.example.demo.app.repository.view.ViewDao;

@Service
public class ViewServiceImpl implements ViewService {
	
	private ViewDao viewDao;

	
	@Autowired
	public ViewServiceImpl(ViewDao viewDao) {
		this.viewDao = viewDao;
	}



	@Override
	public List<View> getAll() {
		return viewDao.getAll();
	}

}
