package it.ats.app.mvcproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ats.app.domain.Search;
import it.ats.app.service.DictionaryService;

@Controller
public class DictionaryControllerImpl implements DictionaryController {

	@Autowired
	private DictionaryService dictionaryService;
	
	// PROBLEMA CON PATH --> PER ORA COPIATO IN PROCESS-TO-VIEW
	
	@Override
	@RequestMapping("/process")
	@ResponseBody
	public List<String> process(@RequestParam String portion, @RequestParam String lang, @RequestParam boolean initial) {
		Search search = new Search(portion, lang, 0, initial);		
		
		List<String> lista = dictionaryService.contains(search);
		for(String parola: lista) {
			System.out.println(parola);
		}
		
		return lista;

	}
	
	@Override
	@RequestMapping("/processLength")
	@ResponseBody
	public List<String> processLength(@RequestParam String lengthS, @RequestParam String lang) {
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
