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

//Import JavaFX's FXML, and Button.
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

//Create public class 'CategoriesController'.
public class CategoriesController
{
	
		//////////////////////////
		//FXML Declaration Field//
		//////////////////////////

	//Declare private FXML Button 'fishButton'.
    @FXML
    private Button fishButton;

	//Declare private FXML Button 'birdsButton'.
    @FXML
    private Button birdsButton;

    //Declare private FXML Button 'amphibiansButton'.
    @FXML
    private Button amphibiansButton;

    //Declare private FXML Button 'mammalsButton'.
    @FXML
    private Button mammalsButton;

    //Declare private FXML Button 'invertebratesButton'.
    @FXML
    private Button invertebratesButton;

    //Declare private FXML Button 'reptilesButton'.
    @FXML
    private Button reptilesButton;
    
    //Declare private FXML Button 'backButton'.
    @FXML
    private Button backButton;
    
	//Create method 'handleBackButton', which handles the action to perform when the user presses the
	//back button, with integrated exception handling.
    public void handleBackButton() throws Exception
    {
    	
    	//Declare and initialize a Parent 'root' to load NeedGive.fxml and the resources therein.
    	Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
    	
    	//Declare and initialize Stage 'window' to the Stage-casted value associated with the window of the need button.
    	Stage window = (Stage) backButton.getScene().getWindow();
    	
    	//Use 'window' to set a new scene of 1280x720px initialized in 'root'.
    	window.setScene(new Scene(root, 1280, 720));
    	
    }

}
