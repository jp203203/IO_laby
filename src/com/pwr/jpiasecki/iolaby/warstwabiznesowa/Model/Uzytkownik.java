package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.util.*;

public abstract class Uzytkownik {

	protected String imie = "";
	protected String nazwisko = "";
	private Collection<Grupa> grupy = new ArrayList<>();

	public String getImie() {
		return this.imie;
	}

	/**
	 * 
	 * @param val
	 */
	public void setImie(String val) {
		this.imie = val;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 * 
	 * @param val
	 */
	public void setNazwisko(String val) {
		this.nazwisko = val;
	}

	public List<Grupa> getGrupy() {
		// TODO - implement Uzytkownik.getGrupy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setGrupy(List<Grupa> val) {
		// TODO - implement Uzytkownik.setGrupy
		throw new UnsupportedOperationException();
	}

}