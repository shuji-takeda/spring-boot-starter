package com.example.demo.app.entity.view;

import java.time.LocalDateTime;

public class View {
	
	private int id;
	private String bandName;
	private String bestSong;
	private LocalDateTime created;
	
	public View() {};
	
	public View(int id, String bandName, String bestSong, LocalDateTime created) {
		this.id = id;
		this.bandName = bandName;
		this.bestSong = bestSong;
		this.created = created;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBandName() {
		return bandName;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	public String getBestSong() {
		return bestSong;
	}
	public void setBestSong(String bestSong) {
		this.bestSong = bestSong;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	
	
}
