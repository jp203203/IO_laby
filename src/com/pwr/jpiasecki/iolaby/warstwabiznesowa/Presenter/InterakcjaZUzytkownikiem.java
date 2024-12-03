package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Presenter;

import java.util.List;

public interface InterakcjaZUzytkownikiem {

	/**
	 * 
	 * @param id_tury
	 * @param nr_indeksu
	 */
	void przystapDoTury(int id_tury, int nr_indeksu);

	/**
	 * 
	 * @param id_grupy
	 */
	void usunGrupeZajeciowa(int id_grupy);

	/**
	 * 
	 * @param opcja
	 */
	void wybierzOpcje(int opcja);

	/**
	 * 
	 * @param nr_indeksu
	 */
	boolean zweryfikujStudenta(int nr_indeksu);

	/**
	 * 
	 * @param opcje
	 */
	void wybierzListeOpcji(List<Integer> opcje);

}