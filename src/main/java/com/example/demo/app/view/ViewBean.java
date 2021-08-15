package com.example.demo.app.view;

public class ViewBean {

	private String bandName;
	private String bestSong;
	
	public ViewBean(String bandName, String bestSong) {
		this.bandName = bandName;
		this.bestSong = bestSong;
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
}
