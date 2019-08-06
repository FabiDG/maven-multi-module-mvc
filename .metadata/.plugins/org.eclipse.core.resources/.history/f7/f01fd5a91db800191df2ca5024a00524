package it.ats.app.controller.impl;

import java.util.List;

import it.ats.app.controller.DictionaryController;
import it.ats.app.domain.Search;
import it.ats.app.service.DictionaryService;
import it.ats.app.service.impl.DictionaryServiceImpl;


public class DictionaryControllerImpl implements DictionaryController {

	private DictionaryService dictionaryService;
	
	public DictionaryControllerImpl() {
		this.dictionaryService = new DictionaryServiceImpl();
	}
	
	@Override
	public List<String> process(String portion, String lang, boolean initial) {
		Search search = new Search(portion, lang, 0, initial);		
		
		List<String> lista = dictionaryService.contains(search);
		for(String parola: lista) {
			System.out.println(parola);
		}
		
		return lista;
	}
	
	

	@Override
	public List<String> processLength(String lengthS, String lang) {
		int length = Integer.parseInt(lengthS);
		Search search = new Search("", lang, length, false);
		
		List<String> lista = dictionaryService.measures(search);
		
		if(lista != null) {
			for(String parola: lista) {
				System.out.println(parola);
			}
		}
		
		return lista;
	}

	

}
