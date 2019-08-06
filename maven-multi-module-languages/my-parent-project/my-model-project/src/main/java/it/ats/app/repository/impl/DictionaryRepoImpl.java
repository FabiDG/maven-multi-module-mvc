package it.ats.app.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import it.ats.app.domain.Dictionary;
import it.ats.app.repository.DictionaryRepo;
import it.ats.app.repository.data.JsonData;

@Repository
public class DictionaryRepoImpl implements DictionaryRepo {
	
	@Override
	public List<Dictionary> findAll() {
		List<Dictionary> lista = new ArrayList<Dictionary>();
		lista.add(findByLanguage("ita"));
		lista.add(findByLanguage("eng"));
		lista.add(findByLanguage("fra"));
		return lista;
	}
	
	@Override
	public Dictionary findByLanguage(String lang) {
		Gson g = new Gson();
		JsonData jsonData = new JsonData();
		String json = jsonData.getDictionaryString(lang);
		return g.fromJson(json, Dictionary.class);
	}

//	public List<String> listFromJson(String lang) {
//		Gson g = new Gson();
//		JsonData jsonData = new JsonData();
//		
//						
//		Dictionary dic = g.fromJson(jsonData.getDictionaryString(lang), Dictionary.class);
//				
//		return dic.getListaParole();
//	}

}
