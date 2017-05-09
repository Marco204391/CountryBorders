/**
 * Sample Skeleton for 'Country.fxml' Controller Class
 */

package it.polito.tdp.country;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.country.model.Country;
import it.polito.tdp.country.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class CountryController {
	
	Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cbxPartenza"
    private ComboBox<Country> cbxPartenza; // Value injected by FXMLLoader

    @FXML // fx:id="cbxDestinazione"
    private ComboBox<Country> cbxDestinazione; // Value injected by FXMLLoader

    @FXML
    private TextArea txtResult;
    
    @FXML
    void handlePercorso(ActionEvent event) {

    }

    @FXML
    void handleRaggiungibili(ActionEvent event) {
    	
    	Country partenza = cbxPartenza.getValue();
    	if(partenza==null){
    		txtResult.appendText("Errore: devi selezionare lo stato di partenza \n");
    	}
    	
    	List <Country> raggiungibili = model.getRaggiungibili(partenza);
    	
    	txtResult.appendText(raggiungibili.toString());
    	
    	cbxDestinazione.getItems().clear();
    	cbxDestinazione.getItems().addAll(raggiungibili);
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cbxPartenza != null : "fx:id=\"cbxPartenza\" was not injected: check your FXML file 'Country.fxml'.";
        assert cbxDestinazione != null : "fx:id=\"cbxDestinazione\" was not injected: check your FXML file 'Country.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Country.fxml'.";
        
    }

	/**
	 * @param model the model to set
	 */
	public void setModel(Model model) {
		this.model = model;
		
		//riempire la prima tendina con un elenco completo delle nazioni
		cbxPartenza.getItems().addAll(model.getCountries());
	}
}
