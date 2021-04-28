/*
 * Application Programming - CS 3433 - 001
 * 2-2:50pm MWF
 * Heena Rathore
 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * 				Group 04
 * Andrew Vitek
 * Caden Marty
 * Caesar Castillo
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import application.model.ZooDexModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/*
 * 		/////////
 * 		//Class//
 * 		/////////
 * 
 * TODO: Class description.
 * Created public class 'DescriptionController'.
 */
public class CategoriesController implements EventHandler<ActionEvent> {
	
		//////////////////////////
		//FXML Declaration Field//
		//////////////////////////

	/*
	 * declare private FXML buttons
	 * back button for the user to go back to the previous screen
	 * the animal buttons are used to show the list of a animals by the clicked category
	 */
    @FXML
    private Button fishButton;
    @FXML
    private Button birdsButton;
    @FXML
    private Button amphibiansButton;
    @FXML
    private Button mammalsButton;
    @FXML
    private Button invertebratesButton;
    @FXML
    private Button reptilesButton;   
    @FXML
    private Button backButton;
    /*
     * Create method 'handleBackButton', which handles the action to perform when the user presses the
     * back button, with integrated exception handling.
     * - Parent root (Declare and initialize a Parent 'root' to load NeedGive.fxml and the resources therein.)
     * - State window (Declare and initialize Stage 'window' to the Stage-casted value associated with the window of the 			need button.)
     * - window.setScene(Use 'window' to set a new scene of 1280x720px initialized in 'root'.)
     * 
     */
    public void handleBackButton() throws Exception {
    	Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
    	Stage window = (Stage) backButton.getScene().getWindow();
    	window.setScene(new Scene(root, 1280, 720));
    }
    /*
     * these methods call onto the handle method to set the action of the button
     * when the user clicks on a button, a list of the associated animal will appear to the user
     */
    @FXML
    void showMammals(ActionEvent event) {
    	mammalsButton.setOnAction(this);
    }
    @FXML
    void showBirds(ActionEvent event) {
    	birdsButton.setOnAction(this);
    }
    @FXML
    void showAmphibians(ActionEvent event) {
    	amphibiansButton.setOnAction(this);
    }
    @FXML
    void showReptiles(ActionEvent event) {
    	reptilesButton.setOnAction(this);	
    }
    @FXML
    void showFish(ActionEvent event) {
    	fishButton.setOnAction(this);  	
    }
    @FXML
    void showInvertebrates(ActionEvent event) {
    	invertebratesButton.setOnAction(this);  	
    }
    /*
     * the handle method takes care of the setOnAction method associated with each button
     * when the user clicks on a category button, the handle method will check which button was pressed
     * then call the associated method from the model class to show the corresponding list of animals
     */
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == mammalsButton) {
			try {
				ZooDexModel.mamList();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == birdsButton) {
			try {
				ZooDexModel.birdList();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == amphibiansButton) {
			try {
				ZooDexModel.amphibList();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == reptilesButton) {
			try {
				ZooDexModel.reptList();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == fishButton) {
			try {
				ZooDexModel.fishList();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == invertebratesButton) {
			try {
				ZooDexModel.invertList();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
