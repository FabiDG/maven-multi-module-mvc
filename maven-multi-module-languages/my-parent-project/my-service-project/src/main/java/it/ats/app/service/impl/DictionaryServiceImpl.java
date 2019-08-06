package it.ats.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ats.app.domain.Search;
import it.ats.app.repository.DictionaryRepo;
import it.ats.app.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryRepo dictionaryRepo;
	
	@Override
	public List<String> contains(Search search) {
		
		List<String> lista = dictionaryRepo.findByLanguage(search.getLang()).getListaParole();
		List<String> listaContiene = new ArrayList<String>();
		
		String portionString = search.getPortion();
		portionString = portionString.toLowerCase();
		
		for(String s: lista) {
			if(s.contains(portionString)) {
				listaContiene.add(s);
				if(search.isInitial() && !s.startsWith(portionString)) {
					listaContiene.remove(s);
				}
				
			}
		}
		
//		if(search.isInitial()) {
//			for(String s: listaContiene) {
//				if(!s.startsWith(portionString)) {
//					listaContiene.remove(s);
//				}
//			}
//		}
		
		return listaContiene;
	}


	@Override
	public List<String> measures(Search search) {
		List<String> lista = dictionaryRepo.findByLanguage(search.getLang()).getListaParole();
		List<String> listaLunga = new ArrayList<String>();
		
		for(String s: lista) {
			if(s.length() == search.getLenght()) {
				listaLunga.add(s);
			}
		}
		
		if(listaLunga.isEmpty()) {
			return null;
		} else {
			return listaLunga;
		}
	}

}
