/**
 * Sample Skeleton for 'Country.fxml' Controller Class
 */

package it.polito.tdp.country;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.country.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CountryController {
	
	Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cbxPartenza"
    private ComboBox<?> cbxPartenza; // Value injected by FXMLLoader

    @FXML // fx:id="cbxDestinazione"
    private ComboBox<?> cbxDestinazione; // Value injected by FXMLLoader

    @FXML
    void doDestinazione(ActionEvent event) {

    }

    @FXML
    void doPartenza(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cbxPartenza != null : "fx:id=\"cbxPartenza\" was not injected: check your FXML file 'Country.fxml'.";
        assert cbxDestinazione != null : "fx:id=\"cbxDestinazione\" was not injected: check your FXML file 'Country.fxml'.";

    }

	/**
	 * @param model the model to set
	 */
	public void setModel(Model model) {
		this.model = model;
	}
}
