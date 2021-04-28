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

//Import JavaFX's Application, Stage, Scene, AnchorPane, and FXMLLoader.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

	/////////
	//Class//
	/////////

	//This class serves to boot the application, targeted on Main.fxml.

//Create class 'Main', extending JavaFX's 'Application'.
public class Main extends Application
{
	
	//Create overridden function 'start', which boots the root AnchorPane, the primary .FXML file, and resources
	//from application.css.
	@Override
	public void start(Stage primaryStage)
	{
		
		//Try-catch block for errors in booting the application.
		try
		{
			
			//Create AnchorPane 'root' and initialize it to the AnchorPane-casted value of Main.fxml
			//resource through an FXMLLoader load() call.
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			
			//Instantiate an instance of Scene 'scene' to 'root' at a 1280x720px resolution.
			Scene scene = new Scene(root,1280,720);
			
			//Grab the stylesheet of application.css.
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Set the scene of 'primaryStage' to 'scene'.
			primaryStage.setScene(scene);
			
			//Display 'primaryStage'.
			primaryStage.show();
			
		}
		catch(Exception e)
		{
			
			//Print the stack trace for this exception.
			e.printStackTrace();
			
		}
	}
	
		/////////////////
		//Main function//
		/////////////////

	//Create the main function.
	public static void main(String[] args)
	{
		
		//Use JavaFX's Application function 'launch', passing 'args'.
		launch(args);
		
	}

}
