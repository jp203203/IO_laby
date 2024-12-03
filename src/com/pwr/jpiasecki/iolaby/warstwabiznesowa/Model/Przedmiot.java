package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.util.*;

public class Przedmiot {

	protected int id_przedmiotu;
	protected String nazwa = "";
	protected String kod_przedmiotu = "";
	private List<Grupa> grupy = new ArrayList<>();
	private List<String> rodzajeGrup = new ArrayList<>();

	public List<Grupa> getGrupy() {
		// TODO - implement Przedmiot.getGrupy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setGrupy(List<Grupa> val) {
		// TODO - implement Przedmiot.setGrupy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nazwa
	 * @param kod
	 */
	public Przedmiot(String nazwa, String kod) {
		// TODO - implement Przedmiot.Przedmiot
		throw new UnsupportedOperationException();
	}

	public int getIdPrzedmiotu() {
		// TODO - implement Przedmiot.getIdPrzedmiotu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setIdPrzedmiotu(int val) {
		// TODO - implement Przedmiot.setIdPrzedmiotu
		throw new UnsupportedOperationException();
	}

	public List<String> getRodzajeGrup() {
		return this.rodzajeGrup;
	}

	/**
	 * 
	 * @param val
	 */
	public void setRodzajeGrup(List<String> val) {
		// TODO - implement Przedmiot.setRodzajeGrup
		throw new UnsupportedOperationException();
	}

}