package it.ats.app.domain;

import java.util.List;

public class Dictionary {
	
	private List<String> listaParole;
	private Integer id;
	private String lang;
	
	public Dictionary(){
		
	}
	
	public List<String> getListaParole(){
		return this.listaParole;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
