package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.time.LocalTime;
import java.util.*;

public class Grupa {

	protected int id_grupy;
	protected int nr_grupy;
	protected LocalTime godz_rozpoczecia;
	protected LocalTime godz_zakonczenia;
	protected int dzien_tyg;
	private Prowadzacy prowadzacy;
	private Collection<Student> czlonkowie = new ArrayList<>();
	private int limit_miejsc;
	private int zajete_miejsca;
	protected RodzajGrupy rodzaj_grupy;

	/**
	 * 
	 * @param rozpoczecie
	 * @param zakonczenie
	 * @param dzien
	 * @param prowadzacy
	 */
	public Grupa(LocalTime rozpoczecie, LocalTime zakonczenie, int dzien, Prowadzacy prowadzacy) {
		// TODO - implement Grupa.Grupa
		throw new UnsupportedOperationException();
	}

	public int getNrGrupy() {
		// TODO - implement Grupa.getNrGrupy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setNrGrupy(int val) {
		// TODO - implement Grupa.setNrGrupy
		throw new UnsupportedOperationException();
	}

	public LocalTime getGodzRozpoczecia() {
		// TODO - implement Grupa.getGodzRozpoczecia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setGodzRozpoczecia(LocalTime val) {
		// TODO - implement Grupa.setGodzRozpoczecia
		throw new UnsupportedOperationException();
	}

	public LocalTime getGodzZakonczenia() {
		// TODO - implement Grupa.getGodzZakonczenia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setGodzZakonczenia(LocalTime val) {
		// TODO - implement Grupa.setGodzZakonczenia
		throw new UnsupportedOperationException();
	}

	public int getDzienTyg() {
		// TODO - implement Grupa.getDzienTyg
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setDzienTyg(int val) {
		// TODO - implement Grupa.setDzienTyg
		throw new UnsupportedOperationException();
	}

	public Prowadzacy getProwadzacy() {
		// TODO - implement Grupa.getProwadzacy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setProwadzacy(Prowadzacy val) {
		// TODO - implement Grupa.setProwadzacy
		throw new UnsupportedOperationException();
	}

	public List<Student> getCzlonkowie() {
		// TODO - implement Grupa.getCzlonkowie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setCzlonkowie(List<Student> val) {
		// TODO - implement Grupa.setCzlonkowie
		throw new UnsupportedOperationException();
	}

	public int getIdGrupy() {
		// TODO - implement Grupa.getIdGrupy
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setIdGrupy(int val) {
		// TODO - implement Grupa.setIdGrupy
		throw new UnsupportedOperationException();
	}

	public int getLimitMiejsc() {
		// TODO - implement Grupa.getLimitMiejsc
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setLimitMiejsc(int val) {
		// TODO - implement Grupa.setLimitMiejsc
		throw new UnsupportedOperationException();
	}

	public int getZajeteMiejsca() {
		// TODO - implement Grupa.getZajeteMiejsca
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setZajeteMiejsca(int val) {
		// TODO - implement Grupa.setZajeteMiejsca
		throw new UnsupportedOperationException();
	}

}