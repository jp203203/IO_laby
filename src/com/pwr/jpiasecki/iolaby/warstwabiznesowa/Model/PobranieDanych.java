package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

import java.util.List;

public interface PobranieDanych {

	List<Kierunek> pobierzKierunki();

	/**
	 * 
	 * @param kierunek
	 */
	List<TuraZapisow> pobierzTury(Kierunek kierunek);

	/**
	 * 
	 * @param nr_indeksu
	 */
	Student pobierzStudenta(int nr_indeksu);

}