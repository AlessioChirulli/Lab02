package it.polito.tdp.alien;

public class Word {
private String alienWord;
private String translation;

public Word(String alienWord, String translation) {
	super();
	this.alienWord = alienWord;
	this.translation = translation;
}

public String getAlienWord() {
	return alienWord;
}

public void setAlienWord(String alienWorld) {
	this.alienWord = alienWorld;
}

public String getTranslation() {
	return translation;
}

public void setTranslation(String translation) {
	this.translation = translation;
}

public boolean equals(String alienWord) {
	if(this.alienWord.equals(alienWord))
		return true;
	else
		return false;
}

}
