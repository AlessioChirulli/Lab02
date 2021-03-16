package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {

	private List<Word> dizionario;

	public AlienDictionary() {
		super();
		dizionario=new LinkedList<Word>();
	}
	
	public void addWord(String alienWord,String translation) {
		for(Word word:dizionario) {
			if(word.equals(alienWord)) {
				word.setTranslation(translation);
				return ;
			}
		}
		Word w=new Word(alienWord,translation);
		dizionario.add(w);
	}
	
	public String translation(String alienWord) {
			for(Word word:dizionario) {
				if(word.equals(alienWord)) {
					return word.getTranslation();
				}
			}
		return null;		
	}
	public void ripulisci() {
		dizionario.clear();
	}
}
