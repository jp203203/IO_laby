package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.util.*;

public class Fabryka {

	private Collection<Kierunek> kierunki = new ArrayList<>();
	private Collection<TuraZapisow> turyZapisow = new ArrayList<>();
	private Collection<Grupa> grupy = new ArrayList<>();
	private Collection<Student> studenci = new ArrayList<>();
	private KierunekDAO KierunekDAO;
	private TuraZapisowDAO TuraZapisowDAO;
	private GrupaDAO GrupaDAO;

	public Fabryka() {
		// TODO - implement Fabryka.Fabryka
		throw new UnsupportedOperationException();
	}

}