package it.ats.app.controller;

import java.util.List;

public interface DictionaryController {
	public List<String> process(String s, String lang, boolean b);
	public List<String> processLength(String s, String lang);
}
