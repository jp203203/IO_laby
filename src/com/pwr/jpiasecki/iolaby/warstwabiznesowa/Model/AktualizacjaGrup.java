package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model;

public interface AktualizacjaGrup {

	/**
	 * 
	 * @param id_grupy
	 * @param nr_indeksu
	 */
	void dodajStudenta(int id_grupy, int nr_indeksu);

	/**
	 * 
	 * @param id_grupy
	 * @param nr_indeksu
	 */
	void usunStudenta(int id_grupy, int nr_indeksu);

	/**
	 * 
	 * @param id_grupy
	 */
	void usunGrupe(int id_grupy);

}