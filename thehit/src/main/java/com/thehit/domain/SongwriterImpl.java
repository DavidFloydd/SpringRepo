package com.thehit.domain;

import com.thehit.interfaces.Songwriter;

public class SongwriterImpl implements Songwriter {

	private String name, lastname;
	private Integer age;
	private Song song;

	public SongwriterImpl(String firstname, String lastname, Integer age, Song song) {
		super();
		this.name = firstname;
		this.lastname = lastname;
		this.age = age;
		this.song = song;
	}

	public SongwriterImpl() {
		super();
	}

	public void compose(Song song) {
		System.out.println("Composer " + name + " composed a song called " + song.getName()
				+ ". This song has the following lyrics " + song.getLyrics());
	}

	public String getFirstname() {
		return name;
	}

	public void setFirstname(String firstname) {
		this.name = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

}
