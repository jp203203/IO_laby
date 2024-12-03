package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.time.LocalDateTime;

public class TuraZapisow {

	protected int id_tury;
	private Kierunek kierunek;
	protected float wymagana_srednia;
	protected LocalDateTime godz_rozpoczecia;
	protected LocalDateTime godz_zakonczenia;

	/**
	 * 
	 * @param rozpoczecie
	 * @param zakonczenie
	 * @param srednia
	 * @param kurs
	 */
	public TuraZapisow(LocalDateTime rozpoczecie, LocalDateTime zakonczenie, float srednia, Kierunek kurs) {
		// TODO - implement TuraZapisow.TuraZapisow
		throw new UnsupportedOperationException();
	}

	public Kierunek getKierunek() {
		return this.kierunek;
	}

	/**
	 * 
	 * @param val
	 */
	public void setKierunek(Kierunek val) {
		this.kierunek = val;
	}

	public float getWymaganaSrednia() {
		// TODO - implement TuraZapisow.getWymaganaSrednia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setWymaganaSrednia(float val) {
		// TODO - implement TuraZapisow.setWymaganaSrednia
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getGodzRozpoczecia() {
		// TODO - implement TuraZapisow.getGodzRozpoczecia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setGodzRozpoczecia(LocalDateTime val) {
		// TODO - implement TuraZapisow.setGodzRozpoczecia
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getGodzZakonczenia() {
		// TODO - implement TuraZapisow.getGodzZakonczenia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setGodzZakonczenia(LocalDateTime val) {
		// TODO - implement TuraZapisow.setGodzZakonczenia
		throw new UnsupportedOperationException();
	}

	public int getIdTury() {
		// TODO - implement TuraZapisow.getIdTury
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param val
	 */
	public void setIdTury(int val) {
		// TODO - implement TuraZapisow.setIdTury
		throw new UnsupportedOperationException();
	}

}