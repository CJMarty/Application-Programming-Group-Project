/*
 * Application Programming - CS 3433 - 001
 * 2-2:50pm MWF
 * Heena Rathore
 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * 				Group 04
 * Andrew Vitek
 * Caden Marty
 * Cesar Castillo
 * Herman Garza
 * Roland Sanchez
 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 */

/*/
 * 		///////////////////////////////////
 * 		//Application Package and Imports//
 * 		///////////////////////////////////
 */

//Import application package.
package application;

//Import JavaFX's FXML, button, and model class
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import application.model.ZooDexModel;
import javafx.event.ActionEvent;

/*
 * 		/////////
 * 		//Class//
 * 		/////////
 * 
 * TODO: Class description.
 * Created public class 'AddNewAnimalController'.
 */
public class AddNewAnimalController implements Initializable {

	//////////////////////////
	// FXML Declaration Field//
	//////////////////////////

	// Declare private FXML button 'categoriesListView'.
	@FXML
	private ListView<String> categoriesListView;

	// Declare private FXML button 'addNewAnimalButton'.
	@FXML
	private Button addNewAnimalButton;

	// Declare private FXML button 'newAnimalName'.
	@FXML
	private TextField newAnimalName;

	// Declare private FXML button 'newAnimalRegion'.
	@FXML
	private TextField newAnimalRegion;

	// Declare private FXML button 'newAnimalDescription'.
	@FXML
	private TextField newAnimalDescription;

	// Declare private FXML button 'backButton'.
	@FXML
	private Button backButton;

	/*
	 * Create method 'handleBackButton', which handles the action to perform when
	 * the user presses the back button, with integrated exception handling. -
	 * Parent root (Declare and initialize a Parent 'root' to load Main.fxml and the
	 * resources therein.) - State window (Declare and initialize Stage 'window' to
	 * the Stage-casted value associated with the window of the need button.) -
	 * window.setScene(Use 'window' to set a new scene of 1280x720px initialized in
	 * 'root'.)
	 * 
	 */
	public void handleBackButton() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Stage window = (Stage) backButton.getScene().getWindow();
		window.setScene(new Scene(root, 1280, 720));
	}

	/*
	 * The addNewAnimal method is responsible for the addition of new animals. It
	 * will first initialize all strings needed to be passed to the addNewAnimal
	 * method in the ZooDexModel where the actual process of adding a new animal
	 * will occur. Lastly, it will clear all text fields.
	 */
	@FXML
	void addNewAnimal(ActionEvent event) {

		// Initializing strings using the text the user entered
		String newAnimalNameString = newAnimalName.getText().toString();
		String newAnimalRegionString = newAnimalRegion.getText().toString();
		String newAnimalDescriptionString = newAnimalDescription.getText().toString();
		String newAnimalCategoryString = categoriesListView.getSelectionModel().getSelectedItem();

		// Adds new animal to a category through the addNewAnimal method in the
		// ZooDezModel class
		ZooDexModel.addNewAnimal(newAnimalNameString, newAnimalRegionString, newAnimalDescriptionString,
				newAnimalCategoryString);

		// Clear text fields
		newAnimalName.clear();
		newAnimalRegion.clear();
		newAnimalDescription.clear();

	}

	/*
	 * The initialize method is responsible for building the list view of animal
	 * categories.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		categoriesListView.getItems().addAll("invertebrates", "fish", "amphibians", "reptiles", "birds", "mammals");
	}
}
