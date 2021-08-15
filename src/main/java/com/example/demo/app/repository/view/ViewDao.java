package com.example.demo.app.repository.view;

import java.util.List;

import com.example.demo.app.entity.view.View;

public interface ViewDao {
	
	// 一覧表示用
	List<View> getAll();
	
	// 追加用
	void insert(View view);
	
	// 更新用
	int update(View view);
}
