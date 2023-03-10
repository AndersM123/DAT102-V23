package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class FilmArkiv2 implements FilmarkivADT {

	private int antall;
	private LinearNode<Film> start;
	// Ingen referanse til siste, kun start
	
	public FilmArkiv2() {
		start = null;
		antall = 0;
	}
	
	@Override
	public Film finnFilm(int nr) {
		Film film = null;
		LinearNode<Film> aktuell = start;
		
		while(aktuell.getElement() != null) {
			if(aktuell.getElement().getFilmnr() == nr) {
				film = aktuell.getElement();
			} else {
				aktuell = aktuell.getNeste();	
			}
		}
		return film;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
	    if (unikID(nyFilm.getFilmnr())) {
	        if (start == null) {
	            start = new LinearNode<>(nyFilm);
	        } else {
	            LinearNode<Film> aktuell = start;
	            while (aktuell.getNeste() != null) {
	                aktuell = aktuell.getNeste();
	            }
	            aktuell.setNeste(new LinearNode<>(nyFilm));
	        }
	        antall++;
	    }
	}
	
	public boolean unikID(int id) {
	    boolean unik = true;
	    LinearNode<Film> aktuell = start;
	    while (aktuell != null) {
	        if (aktuell.getElement().getFilmnr() == id) {
	            unik = false;
	            break;
	        } else {
	        	aktuell = aktuell.getNeste();	        	
	        }
	    }
	    return unik;
	}


	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		return null;
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
