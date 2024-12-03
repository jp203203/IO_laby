package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.util.*;

public class Student extends Uzytkownik {

	protected int nr_albumu;
	protected float srednia;
	private Collection<Kierunek> kierunki = new ArrayList<>();

	/**
	 * 
	 * @param nr
	 * @param imie
	 * @param nazwisko
	 */
	public Student(int nr, String imie, String nazwisko) {
		// TODO - implement Student.Student
		throw new UnsupportedOperationException();
	}

	public int getNrAlbumu() {
		// TODO - implement Student.getNrAlbumu
		throw new UnsupportedOperationException();
	}

	public List<Kierunek> getKierunki() {
		// TODO - implement Student.getKierunki
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setKierunki(List<Kierunek> val) {
		// TODO - implement Student.setKierunki
		throw new UnsupportedOperationException();
	}

	public float getSrednia() {
		return this.srednia;
	}

	/**
	 * 
	 * @param val
	 */
	public void setSrednia(float val) {
		this.srednia = val;
	}

}