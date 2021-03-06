//Application Programming - CS 3433 - 001
//2-2:50pm MWF
//Heena Rathore
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
//  Group 04
//Andrew Vitek
//Caden Marty
//Caesar Castillo
//Herman Garza
//Roland Sanchez
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

	///////////////////////////////////
	//Application Package and Imports//
	///////////////////////////////////

//Import application package.
package application;

//Import JavaFX's FXML, FXMLLoader, Parent, Scene, Button, and Stage.
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

	/////////
	//Class//
	/////////

	//TODO: Class description.

//Create public class 'MainController'.
public class MainController
{
		
		//////////////////////////
		//FXML Declaration Field//
		//////////////////////////

	//Declare private FXML button 'categoriesButton'.
	@FXML
	private Button categoriesButton;
	
	//Declare private FXML button 'aboutButton'.
	@FXML
	private Button aboutButton;
	
	//Declare private FXML button 'sourcesButton'.
	@FXML
	private Button sourcesButton;
	
	//Declare private FXML button 'sourcesButton'.
	@FXML
	private Button addNewAnimalButton;
	
	//Create method 'handleCategoriesButton', which handles the action to perform when the user presses the
	//categories button, with integrated exception handling.
    public void handleCategoriesButton() throws Exception
    {
    	
    	//Declare and initialize a Parent 'root' to load Categories.fxml and the resources therein.
    	Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
    	
    	//Declare and initialize Stage 'window' to the Stage-casted value associated with the window of the need button.
    	Stage window = (Stage) categoriesButton.getScene().getWindow();
    	
    	//Use 'window' to set a new scene of 1280x720px initialized in 'root'.
    	window.setScene(new Scene(root, 1280, 720));
    	
    }
    
	//Create method 'handleAboutButton', which handles the action to perform when the user presses the
	//about button, with integrated exception handling.
    public void handleAboutButton() throws Exception
    {
    	
    	//Declare and initialize a Parent 'root' to load Categories.fxml and the resources therein.
    	Parent root = FXMLLoader.load(getClass().getResource("About.fxml"));
    	
    	//Declare and initialize Stage 'window' to the Stage-casted value associated with the window of the need button.
    	Stage window = (Stage) aboutButton.getScene().getWindow();
    	
    	//Use 'window' to set a new scene of 1280x720px initialized in 'root'.
    	window.setScene(new Scene(root, 1280, 720));
    	
    }
    
	// Create method 'handleAddNewAnimalButton', which handles the action to perform
	// when the user presses the
	// addNewAnimal button, with integrated exception handling.
	public void handleAddNewAnimalButton() throws Exception {

		// Declare and initialize a Parent 'root' to load NeedGive.fxml and the
		// resources therein.
		Parent root = FXMLLoader.load(getClass().getResource("AddNewAnimal.fxml"));

		// Declare and initialize Stage 'window' to the Stage-casted value associated
		// with the window of the need button.
		Stage window = (Stage) addNewAnimalButton.getScene().getWindow();

		// Use 'window' to set a new scene of 1280x720px initialized in 'root'.
		window.setScene(new Scene(root, 1280, 720));

	}

}
