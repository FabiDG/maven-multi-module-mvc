package it.ats.app.repository.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import it.ats.app.repository.DictionaryRepo;
import it.ats.app.repository.impl.DictionaryRepoImpl;

public class DictionaryRepositoryTest {
	
	@Test
	public void testDictionaryNoUpperCase() {
		DictionaryRepo dictionaryRepo = new DictionaryRepoImpl();
		List<String> lista = dictionaryRepo.findByLanguage("ita").getListaParole();
		if(lista != null) {
			for(String s: lista) {
				System.out.println(s);
			}
		}
		Assert.assertEquals(8, lista.size());
	}
}
