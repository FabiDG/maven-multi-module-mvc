package it.ats.app.repository.data;

public class JsonData {
	private String itaDictionary;
	private String engDictionary;
	private String fraDictionary;
	
	public JsonData() {
		this.itaDictionary = "{\r\n" + 
				"			\"id\": 1,\r\n" + 
				"			\"lang\": \"ita\",\r\n" + 
				"			\"listaParole\": [\r\n" + 
				"				\"casa\",\r\n" + 
				"				\"automobile\",\r\n" + 
				"				\"cane\",\r\n" + 
				"				\"citta\",\r\n" + 
				"				\"tavolo\",\r\n" + 
				"				\"gatto\",\r\n" + 
				"				\"bottiglia\",\r\n" + 
				"				\"penna\"\r\n" + 
				"			]\r\n" + 
				"		}";
		this.engDictionary = "{\r\n" + 
				"			\"id\": 2,\r\n" + 
				"			\"lang\": \"eng\",\r\n" + 
				"			\"listaParole\": [\r\n" + 
				"				\"home\",\r\n" + 
				"				\"car\",\r\n" + 
				"				\"dog\",\r\n" + 
				"				\"city\",\r\n" + 
				"				\"table\",\r\n" + 
				"				\"cat\",\r\n" + 
				"				\"bottle\",\r\n" + 
				"				\"pen\"\r\n" + 
				"			]\r\n" + 
				"		}";
		this.fraDictionary = "{\r\n" + 
				"			\"id\": 3,\r\n" + 
				"			\"lang\": \"fra\",\r\n" + 
				"			\"listaParole\": [\r\n" + 
				"				\"maison\",\r\n" + 
				"				\"voiture\",\r\n" + 
				"				\"chien\",\r\n" + 
				"				\"ville\",\r\n" + 
				"				\"table\",\r\n" + 
				"				\"chat\",\r\n" + 
				"				\"bouteille\",\r\n" + 
				"				\"stylo\"\r\n" + 
				"			]\r\n" + 
				"		}";
	}

	public String getDictionaryString(String lang) {
		switch (lang) {
		case "ita":
			return itaDictionary;
		case "eng":
			return engDictionary;
		case "fra":
			return fraDictionary;
		default:
			return null;
		}
	}
	

}
