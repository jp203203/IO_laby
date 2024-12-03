package com.pwr.jpiasecki.iolaby.warstwabiznesowa.View;

import com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model.*;

import java.util.List;

public interface WyswietlanieDanych {

	/**
	 * 
	 * @param Tury
	 */
	void wyswietlTuryZapisow(List<TuraZapisow> Tury);

	/**
	 * 
	 * @param Kierunki
	 */
	void wyswietlKierunki(List<Kierunek> Kierunki);

	/**
	 * 
	 * @param Grupy
	 */
	void wyswietlGrupy(List<Grupa> Grupy);

	/**
	 * 
	 * @param Przedmioty
	 */
	void wyswietlPrzedmioty(List<Przedmiot> Przedmioty);

	/**
	 * 
	 * @param tresc
	 */
	void wyswietlKomunikat(String tresc);

}