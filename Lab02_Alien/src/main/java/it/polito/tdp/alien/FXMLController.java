package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FXMLController {

	//AlienDictionary dizionario=new AlienDictionary();
	AlienDictionaryEnhanced dizionario=new AlienDictionaryEnhanced();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtTranslate;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private GridPane btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.setText("");
    	txtTranslate.setText("");
        dizionario.ripulisci();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    String[] traduzione=txtTranslate.getText().split(" ");
    if(traduzione.length==1) {
    	if(!traduzione[0].toLowerCase().matches("[a-z]*")){
    		txtResult.setText("Inserire solo lettere!");
        	return ;	
    	}
    	if(dizionario.translation(traduzione[0].toLowerCase())!=null && dizionario.translation(traduzione[0].toLowerCase()).length()!=0) {
    	//txtResult.setText("La traduzione di "+traduzione[0].toLowerCase()+" è "+dizionario.translation(traduzione[0].toLowerCase()));
    		txtResult.setText("La traduzione di "+traduzione[0].toLowerCase()+" sono: "+dizionario.translation(traduzione[0].toLowerCase()));
    		return ;
    	}else {
    		txtResult.setText("Parola non presente nel dizionario");
    		return;
    	}
    		
    }else if(traduzione.length==2) {
    	if(!traduzione[0].toLowerCase().matches("[a-z]*") || !traduzione[1].toLowerCase().matches("[a-z]*")) {
    		txtResult.setText("Inserire solo lettere!");
        	return ;
    	}else {
    		dizionario.addWord(traduzione[0].toLowerCase(), traduzione[1].toLowerCase());
    		txtResult.setText("Traduzione aggiunta nel dizionario");
    		return ;
    	}
    }else {
    	txtResult.setText("Errore nel formato!");
    	return;
    }
    }

    @FXML
    void initialize() {
        assert txtTranslate != null : "fx:id=\"txtTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
