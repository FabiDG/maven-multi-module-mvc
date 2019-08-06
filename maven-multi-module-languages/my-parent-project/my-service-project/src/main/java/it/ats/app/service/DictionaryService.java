
package it.ats.app.service;

import java.util.List;

import it.ats.app.domain.Search;

public interface DictionaryService {
	public List<String> contains(Search portion);

	public List<String> measures(Search search);

}
