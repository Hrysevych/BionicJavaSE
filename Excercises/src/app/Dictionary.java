package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

public class Dictionary {

	TreeMap<String, String> dictionary = new TreeMap<String, String>();

	public void init() {
	
		
		dictionary.put("Save", "Зберегти");
		dictionary.put("Remove", "Видалити");
		dictionary.put("Cancel", "Вiдмiнити");
		dictionary.put("Create", "Створити");
		dictionary.put("OK", null);
	}
	
	public void initFromFile() {
		BufferedReader inputReader = null;
		try {
			inputReader = new BufferedReader(new FileReader("dictionary"));
			String str;
			while ((str = inputReader.readLine()) != null) {
				System.out.println(str.split(" ")[0]);
				System.out.println(str.split(" ")[1]);
				dictionary.put(str.split(" ")[0], str.split(" ")[1]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getTranslation(String input) {
		System.out.println();
		if (dictionary.containsKey(input)) return dictionary.get(input);
		else return input;
	}

}
