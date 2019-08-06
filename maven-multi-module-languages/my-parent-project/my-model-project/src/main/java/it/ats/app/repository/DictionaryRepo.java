package it.ats.app.repository;

import java.util.List;

import it.ats.app.domain.Dictionary;

public interface DictionaryRepo {
	public List<Dictionary> findAll();
	public Dictionary findByLanguage(String lang);
}
