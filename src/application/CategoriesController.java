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
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.glassfish.gmbal.Description;

import application.ZooDexModel;
import javafx.collections.ObservableList;
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
    
    private ListView test;
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
				
				//Instantiate String ArrayList 'animals'.
				ArrayList<String> animals = new ArrayList<String>();
				
				//Initialize 'animals' to the ArrayList returned by invertList().
				animals = ZooDexModel.mamList();
		    	
				//Instantiate FXMLLoader 'loader' to Description.fxml.
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Description.fxml"));
		    	
		    	//Declare and initialize Parent 'root' to the Parent-casted load() of 'loader'.
		    	Parent root = (Parent)loader.load();
		    	
		    	//Instantiate DescriptionController 'descriptControl' to the getController() of
		    	//DescriptionController to 'loader'.
		    	DescriptionController descriptControl = loader.<DescriptionController>getController();
		    	
		    	//Initialize the 'animals' of 'descriptControl' to 'animals'.
		    	descriptControl.animals = animals;
		    	
		    	//Initialize the 'animalType' of 'descriptControl' to "mammals".
		    	descriptControl.animalType = "mammals";
		    	
		    	//Declare and initialize Stage 'window' to the Stage-casted value of the scene of
		    	//'invertebratesButton'.
		    	Stage window = (Stage) mammalsButton.getScene().getWindow();
		    	
		    	//Display 'window' using 'root' at 1280x720.
		    	window.setScene(new Scene(root, 1280, 720));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == birdsButton) {
			try {
				
				//Instantiate String ArrayList 'animals'.
				ArrayList<String> animals = new ArrayList<String>();
				
				//Initialize 'animals' to the ArrayList returned by invertList().
				animals = ZooDexModel.birdList();
		    	
				//Instantiate FXMLLoader 'loader' to Description.fxml.
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Description.fxml"));
		    	
		    	//Declare and initialize Parent 'root' to the Parent-casted load() of 'loader'.
		    	Parent root = (Parent)loader.load();
		    	
		    	//Instantiate DescriptionController 'descriptControl' to the getController() of
		    	//DescriptionController to 'loader'.
		    	DescriptionController descriptControl = loader.<DescriptionController>getController();
		    	
		    	//Initialize the 'animals' of 'descriptControl' to 'animals'.
		    	descriptControl.animals = animals;
		    	
		    	//Initialize the 'animalType' of 'descriptControl' to "birds".
		    	descriptControl.animalType = "birds";
		    	
		    	//Declare and initialize Stage 'window' to the Stage-casted value of the scene of
		    	//'invertebratesButton'.
		    	Stage window = (Stage) birdsButton.getScene().getWindow();
		    	
		    	//Display 'window' using 'root' at 1280x720.
		    	window.setScene(new Scene(root, 1280, 720));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == amphibiansButton) {
			try {
				
				//Instantiate String ArrayList 'animals'.
				ArrayList<String> animals = new ArrayList<String>();
				
				//Initialize 'animals' to the ArrayList returned by invertList().
				animals = ZooDexModel.amphibList();
		    	
				//Instantiate FXMLLoader 'loader' to Description.fxml.
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Description.fxml"));
		    	
		    	//Declare and initialize Parent 'root' to the Parent-casted load() of 'loader'.
		    	Parent root = (Parent)loader.load();
		    	
		    	//Instantiate DescriptionController 'descriptControl' to the getController() of
		    	//DescriptionController to 'loader'.
		    	DescriptionController descriptControl = loader.<DescriptionController>getController();
		    	
		    	//Initialize the 'animals' of 'descriptControl' to 'animals'.
		    	descriptControl.animals = animals;
		    	
		    	//Initialize the 'animalType' of 'descriptControl' to "amphibians".
		    	descriptControl.animalType = "amphibians";
		    	
		    	//Declare and initialize Stage 'window' to the Stage-casted value of the scene of
		    	//'invertebratesButton'.
		    	Stage window = (Stage) amphibiansButton.getScene().getWindow();
		    	
		    	//Display 'window' using 'root' at 1280x720.
		    	window.setScene(new Scene(root, 1280, 720));
		    	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == reptilesButton) {
			try {
				
				//Instantiate String ArrayList 'animals'.
				ArrayList<String> animals = new ArrayList<String>();
				
				//Initialize 'animals' to the ArrayList returned by invertList().
				animals = ZooDexModel.reptList();
		    	
				//Instantiate FXMLLoader 'loader' to Description.fxml.
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Description.fxml"));
		    	
		    	//Declare and initialize Parent 'root' to the Parent-casted load() of 'loader'.
		    	Parent root = (Parent)loader.load();
		    	
		    	//Instantiate DescriptionController 'descriptControl' to the getController() of
		    	//DescriptionController to 'loader'.
		    	DescriptionController descriptControl = loader.<DescriptionController>getController();
		    	
		    	//Initialize the 'animals' of 'descriptControl' to 'animals'.
		    	descriptControl.animals = animals;
		    	
		    	//Initialize the 'animalType' of 'descriptControl' to "reptiles".
		    	descriptControl.animalType = "reptiles";
		    	
		    	//Declare and initialize Stage 'window' to the Stage-casted value of the scene of
		    	//'invertebratesButton'.
		    	Stage window = (Stage) reptilesButton.getScene().getWindow();
		    	
		    	//Display 'window' using 'root' at 1280x720.
		    	window.setScene(new Scene(root, 1280, 720));
		    	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == fishButton) {
			try {
				
				//Instantiate String ArrayList 'animals'.
				ArrayList<String> animals = new ArrayList<String>();
				
				//Initialize 'animals' to the ArrayList returned by invertList().
				animals = ZooDexModel.fishList();
		    	
				//Instantiate FXMLLoader 'loader' to Description.fxml.
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Description.fxml"));
		    	
		    	//Declare and initialize Parent 'root' to the Parent-casted load() of 'loader'.
		    	Parent root = (Parent)loader.load();
		    	
		    	//Instantiate DescriptionController 'descriptControl' to the getController() of
		    	//DescriptionController to 'loader'.
		    	DescriptionController descriptControl = loader.<DescriptionController>getController();
		    	
		    	//Initialize the 'animals' of 'descriptControl' to 'animals'.
		    	descriptControl.animals = animals;
		    	
		    	//Initialize the 'animalType' of 'descriptControl' to "fish".
		    	descriptControl.animalType = "fish";
		    	
		    	//Declare and initialize Stage 'window' to the Stage-casted value of the scene of
		    	//'invertebratesButton'.
		    	Stage window = (Stage) fishButton.getScene().getWindow();
		    	
		    	//Display 'window' using 'root' at 1280x720.
		    	window.setScene(new Scene(root, 1280, 720));
		    	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(event.getSource() == invertebratesButton) {
			try {
				
				//Instantiate String ArrayList 'animals'.
				ArrayList<String> animals = new ArrayList<String>();
				
				//Initialize 'animals' to the ArrayList returned by invertList().
				animals = ZooDexModel.invertList();
		    	
				//Instantiate FXMLLoader 'loader' to Description.fxml.
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Description.fxml"));
		    	
		    	//Declare and initialize Parent 'root' to the Parent-casted load() of 'loader'.
		    	Parent root = (Parent)loader.load();
		    	
		    	//Instantiate DescriptionController 'descriptControl' to the getController() of
		    	//DescriptionController to 'loader'.
		    	DescriptionController descriptControl = loader.<DescriptionController>getController();
		    	
		    	//Initialize the 'animals' of 'descriptControl' to 'animals'.
		    	descriptControl.animals = animals;
		    	
		    	//Initialize the 'animalType' of 'descriptControl' to "invertebrates".
		    	descriptControl.animalType = "invertebrates";
		    	
		    	//Declare and initialize Stage 'window' to the Stage-casted value of the scene of
		    	//'invertebratesButton'.
		    	Stage window = (Stage) invertebratesButton.getScene().getWindow();
		    	
		    	//Display 'window' using 'root' at 1280x720.
		    	window.setScene(new Scene(root, 1280, 720));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
