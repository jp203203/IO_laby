package com.pwr.jpiasecki.iolaby.warstwabiznesowa.Presenter;

import com.pwr.jpiasecki.iolaby.warstwabiznesowa.Model.*;
import com.pwr.jpiasecki.iolaby.warstwabiznesowa.View.WyswietlanieDanych;

import java.util.List;

public class PrezenterSterowanie implements InterakcjaZUzytkownikiem {

	private WeryfikacjaStudenta weryfikacjaStudenta;
	private AktualizacjaGrup aktualizacjaGrup;
	private PobranieDanych pobranieDanych;
	private WyswietlanieDanych wyswietlanieDanych;
	private UsuwanieGrupy usuwanieGrupy;
	private PrzystapienieDoTury przystapienieDoTury;

	/**
	 * 
	 * @param weryfikacjaStudenta
	 * @param aktualizacjaGrup
	 * @param pobranieDanych
	 */
	public PrezenterSterowanie(WeryfikacjaStudenta weryfikacjaStudenta, AktualizacjaGrup aktualizacjaGrup, PobranieDanych pobranieDanych) {
		// TODO - implement PrezenterSterowanie.PrezenterSterowanie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param opcja
	 */
	public void wybierzOpcje(int opcja) {
		// TODO - implement PrezenterSterowanie.wybierzOpcje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nr_indeksu
	 */
	public boolean zweryfikujStudenta(int nr_indeksu) {
		// TODO - implement PrezenterSterowanie.zweryfikujStudenta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_tury
	 * @param nr_indeksu
	 */
	public void przystapDoTury(int id_tury, int nr_indeksu) {
		// TODO - implement PrezenterSterowanie.przystapDoTury
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_grupy
	 */
	public void usunGrupeZajeciowa(int id_grupy) {
		// TODO - implement PrezenterSterowanie.usunGrupeZajeciowa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param opcje
	 */
	public void wybierzListeOpcji(List<Integer> opcje) {
		// TODO - implement PrezenterSterowanie.wybierzListeOpcji
		throw new UnsupportedOperationException();
	}

}