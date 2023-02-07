package no.hvl.data102;

public class Film {

	private int filmnr;
	private String filmskaper;
	private String FilmTittel;
	private int år;
	private Sjanger[] sjangTab = Sjanger.values();
	private String filmselskap;
	
	
	public Film() {
		
	}
	
	public Film(int filmnr, String filmskaper, String FilmTittel, int år, String filmselskap) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.FilmTittel = FilmTittel;
		this.år = år;
		this.filmselskap = filmselskap;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getFilmTittel() {
		return FilmTittel;
	}

	public void setFilmTittel(String filmTittel) {
		FilmTittel = filmTittel;
	}

	public int getÅr() {
		return år;
	}

	public void setÅr(int år) {
		this.år = år;
	}

	public Sjanger[] getSjangTab() {
		return sjangTab;
	}

	public void setSjangTab(Sjanger[] sjangTab) {
		this.sjangTab = sjangTab;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	// Overkjøring av equals-metoden
	@Override
	public boolean equals(Object andre) {
		if (this == andre) {
			return true;
		}
		if (andre == null) {
			return false;

		}
		if (getClass() != andre.getClass()) {
			return false;
		}
		Film denAndre = (Film) andre;
		boolean like = this.filmnr == denAndre.getFilmnr();
		return like;
	}
	
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
	
}
