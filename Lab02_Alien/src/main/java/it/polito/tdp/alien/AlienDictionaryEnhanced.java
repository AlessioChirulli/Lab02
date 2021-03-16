package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AlienDictionaryEnhanced {
	
	private List<WordEnhanced> dizionario;

	public AlienDictionaryEnhanced() {
		super();
		dizionario=new LinkedList<WordEnhanced>();
	}
	
	public void addWord(String alienWord,String translation) {
		for(WordEnhanced word:dizionario) {
			if(word.equals(alienWord)) {
				word.addTranslation(translation);;
				return ;
			}
		}
		WordEnhanced w=new WordEnhanced(alienWord,translation);
		dizionario.add(w);
	}
	
	public String translation(String alienWord) {
		String s="";
			for(WordEnhanced word:dizionario) {
				if(word.equals(alienWord)) {
					for(String stringa:word.getTranslation()) {
						s+=stringa+",";
					}
				}
			}
		return s.substring(0,s.length()-1);		
	}
	public void ripulisci() {
		dizionario.clear();
	}
}
