package it.ats.app.domain;

public class Search {
	private String portion;
	private String lang;
	private int length;
	private boolean initial;
	
	public Search() {
		this.portion = "";
	}
	
	public Search(String portion, String lang, int length, boolean initial) {
		this.portion = portion;
		this.lang = lang;
		this.initial = initial;
		this.length = length;
	}
	
	public String getPortion() {
		return portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}

	public int getLenght() {
		return length;
	}

	public void setLenght(int lenght) {
		this.length = lenght;
	}

	public boolean isInitial() {
		return initial;
	}

	public void setInitial(boolean initial) {
		this.initial = initial;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
}
