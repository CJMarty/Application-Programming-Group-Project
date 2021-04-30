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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import application.ZooDexModel;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.ArrayList;
/*
 * 		/////////
 * 		//Class//
 * 		/////////
 * 
 * TODO: Class description.
 * Created public class 'DescriptionController'.
 */
public class DescriptionController implements EventHandler<ActionEvent>, Initializable{
	
	//////////////////////////
	//FXML Declaration Field//
	//////////////////////////
	
	/*
	 * declare private FXML buttons
	 * back button for the user to go back to the previous screen
	 * the animal buttons are used to show the region and description of the clicked animal
	 */
    @FXML
    private Button backButton;
    @FXML
    private Button mammalDescriptButton;
    @FXML
    private Button reptDescriptButton;
    @FXML
    private Button fishDescriptButton;
    @FXML
    private Button birdDescriptButton;
    @FXML
    private Button amphibDescriptButton;
    @FXML
    private Button invertDescriptButton;
    
    @FXML
    private ListView animalsList = new ListView();
    
    public ArrayList<String> animals = new ArrayList<String>();
    public String animalType;
    
    @FXML
    private ImageView animalImage;
    
    @FXML
    private Label animalNameLabel = new Label();
    
    @FXML
    private Label animalRegionLabel = new Label();
    
    @FXML
    private Label animalDescriptionLabel = new Label();
  
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
   
    //Create method 'handleBackCategories', which handles the action to perform when the user presses
    //the back button a categoried Description.fxml menu, with integrated exception handling.
    public void handleBackCategories() throws Exception
    {
	
    	//Declare and initialize Parent 'root' to Categories.fxml.
		Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
		
		//Declare and initialize Stage 'window' to the scene of 'backButton'.
    	Stage window = (Stage) backButton.getScene().getWindow();
    	
    	//Use 'window' to setScene(), using 'root' at 1280x720.
    	window.setScene(new Scene(root, 1280, 720));
    
    }
    
    /*
     * these methods call onto the handle method to set the action of the button
     * when the user clicks on a button, the region and description of the associated animal will show to the user
     */
    @FXML
    void mammalDescript(ActionEvent event) {
    	mammalDescriptButton.setOnAction(this);
    }
    @FXML
    void birdDescript(ActionEvent event) {
    	birdDescriptButton.setOnAction(this);
    }
    @FXML
    void amphibDescript(ActionEvent event) {
    	amphibDescriptButton.setOnAction(this);
    }
    @FXML
    void invertDescript(ActionEvent event) {
    	invertDescriptButton.setOnAction(this);
    }
    @FXML
    void fishDescript(ActionEvent event) {
    	fishDescriptButton.setOnAction(this);
    }
    @FXML
    void reptDescript(ActionEvent event) {
    	reptDescriptButton.setOnAction(this);
    }
    /*
     * the handle method takes care of the setOnAction method associated with each button
     * when the user clicks on a description button, the handle method will check which button was pressed
     * then call the associated method from the model class to show the corresponding region and description
     */
	@Override
	//method used to handle the buttons
	public void handle(ActionEvent event) {
		if(event.getSource() == mammalDescriptButton) {
			try {
				ZooDexModel.mamReg();
				ZooDexModel.mamDescript();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == fishDescriptButton) {
			try {
				ZooDexModel.fishReg();
				ZooDexModel.fishDescript();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == reptDescriptButton) {
			try {
				ZooDexModel.reptReg();
				ZooDexModel.reptDescript();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == amphibDescriptButton) {
			try {
				ZooDexModel.amphibReg();
				ZooDexModel.amphibDescript();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == invertDescriptButton) {
			try {
				ZooDexModel.invertReg();
				ZooDexModel.invertDescript();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(event.getSource() == birdDescriptButton) {
			try {
				ZooDexModel.birdReg();
				ZooDexModel.birdDescript();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		
		Platform.runLater(() -> {

			animalsList.getItems().clear();
			
			for(String name : animals)
			{
				
				animalsList.getItems().add(name);
				
			}

	    });
		
	}
	
	public void infoGrab() throws FileNotFoundException
	{
		
		int index = animalsList.getSelectionModel().getSelectedIndex();
		
			/////////////////////
			//Animal Name Label//
			/////////////////////
		
		animalNameLabel.setWrapText(true);
		
		animalNameLabel.setText((String)(animalsList.getSelectionModel().getSelectedItem()));
		
		Image image = new Image(getClass().getResource("graphics\\description\\animals\\" +
		animalType + "\\" + ((String)(animalsList.getSelectionModel().getSelectedItem())) +
		".png").toString(), true);
		
		animalImage.setImage(image);
		
			///////////////////////
			//Animal Region Label//
			///////////////////////
		
		ArrayList<String> regions = new ArrayList<String>();
		
		regions = ZooDexModel.invertReg();
		
		String region = regions.get(index);
		
		animalRegionLabel.setWrapText(true);
		
		animalRegionLabel.setText(region);
		
			////////////////////////////
			//Animal Description Label//
			////////////////////////////
		
		ArrayList<String> descriptions = new ArrayList<String>();
		
		descriptions = ZooDexModel.invertDescript();
		
		String description = descriptions.get(index);
		
		animalDescriptionLabel.setWrapText(true);
		
		animalDescriptionLabel.setText(description);
		
	}
	
}
