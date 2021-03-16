package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class WordEnhanced {
private String alienWord;
private ArrayList<String> translation;

public WordEnhanced(String alienWord, String onceTranslation) {
	super();
	this.alienWord = alienWord;
	this.translation =new ArrayList<String>();
	translation.add(onceTranslation);
}

public String getAlienWord() {
	return alienWord;
}

public void setAlienWord(String alienWord) {
	this.alienWord = alienWord;
}

public ArrayList<String> getTranslation() {
	return translation;
}

public void addTranslation(String translation) {
	this.translation.add(translation);
}

public boolean equals(String alienWord) {
	if(this.alienWord.equals(alienWord))
		return true;
	else
		return false;
}

}
