package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.util.*;

public class Kierunek {

	protected String kod_kierunku = "";
	protected String nazwa = "";
	private Collection<Przedmiot> przedmioty = new ArrayList<>();

	/**
	 * 
	 * @param kod
	 * @param nazwa
	 * @param przedmioty
	 */
	public Kierunek(String kod, String nazwa, List<Przedmiot> przedmioty) {
		// TODO - implement Kierunek.Kierunek
		throw new UnsupportedOperationException();
	}

	public String getKodKursu() {
		// TODO - implement Kierunek.getKodKursu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setKodKursu(String val) {
		// TODO - implement Kierunek.setKodKursu
		throw new UnsupportedOperationException();
	}

	public String getNazwa() {
		return this.nazwa;
	}

	/**
	 * 
	 * @param val
	 */
	public void setNazwa(String val) {
		this.nazwa = val;
	}

	public List<Przedmiot> getPrzedmioty() {
		// TODO - implement Kierunek.getPrzedmioty
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setPrzedmioty(List<Przedmiot> val) {
		// TODO - implement Kierunek.setPrzedmioty
		throw new UnsupportedOperationException();
	}

}