package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	private Film[] filmtabell;
	private int antall;

	public Filmarkiv() {

	}

	public Filmarkiv(int maksAntall) {
		antall = 0;
		filmtabell = new Film[maksAntall];
	}

	@Override
	public Film finnFilm(int nr) {
		Film film = null;
		for (int i = 0; i < filmtabell.length; i++) {
			if (filmtabell[i] == filmtabell[nr]) {
				film = filmtabell[i];
			}
		}
		return film;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		Film[] nyTab = new Film[filmtabell.length * 2];

		if (unikID(nyFilm.getFilmnr()) && antall != filmtabell.length) {
			filmtabell[antall] = nyFilm;
			antall++;

		} else if (unikID(nyFilm.getFilmnr()) && antall == filmtabell.length) {
			for (int i = 0; i < nyTab.length; i++) {
				nyTab[i] = filmtabell[i];
			}
			filmtabell = nyTab;
			filmtabell[antall] = nyFilm;
			antall++;
		}

	}

	public boolean unikID(int id) {
		boolean unik = true;

		for (int i = 0; i < filmtabell.length; i++) {
			if (filmtabell[i].getFilmnr() == id) {
				unik = false;
			}
		}
		return unik;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean slettet = false;

		for (int i = 0; i < filmtabell.length; i++) {
			if (filmtabell[i].getFilmnr() == filmnr) {
				filmtabell[i] = null;
				antall--;
				slettet = true;
			}
		}
		return slettet;
	}

	@Override
	public Film[] soekTittel(String delstreng) {

		int antallTreff = 0;

		// Finner først ut hvor stor tabellen skal være
		for (int i = 0; i < antall; i++) {
			if (filmtabell[i].getFilmTittel().contains(delstreng)) {
				antallTreff++;
			}
		}
		if (antallTreff == 0) {
			return null;
			// returnerer null her hvis ingen treff
		}

		Film[] treffTab = new Film[antallTreff];
		int j = 0;

		// Genererer tabellen
		for (int i = 0; i < antall; i++) {
			if (filmtabell[i].getFilmTittel().contains(delstreng)) {
				treffTab[j] = filmtabell[i];
				j++;
			}
		}
		return treffTab;

	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		int antallTreff = 0;

		for (int i = 0; i < antall; i++) {
			if (filmtabell[i].getFilmTittel().contains(delstreng)) {
				antallTreff++;
			}
		}

		if (antallTreff == 0) {
			return null;
		}

		Film[] treffTab = new Film[antallTreff];
		int j = 0;

		for (int i = 0; i < antall; i++) {
			if (filmtabell[i].getFilmTittel().contains(delstreng)) {
				treffTab[j] = filmtabell[i];
				j++;
			}
		}
		return treffTab;

	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}

}
