package it.ats.app.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import it.ats.app.domain.Search;
import it.ats.app.service.DictionaryService;
import it.ats.app.service.impl.DictionaryServiceImpl;

public class ServiceTest {
	
	@Test
	public void testDictionaryNoUpperCase() {
		DictionaryService dictionaryService = new DictionaryServiceImpl();
		Search search = new Search("ca", "ita", 0, false);
		List<String> lista = dictionaryService.contains(search);
		
		for(String s: lista) {
			System.out.println(s);
		}
		Assert.assertEquals(2, lista.size());
	}

}
