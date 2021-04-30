package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AboutController implements Initializable
{
	
	@FXML
	private Button backButton;
	
	@FXML
	private Label aboutText;
	
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		
		aboutText.setWrapText(true);
		
		StringBuffer sb = new StringBuffer();

		try
		{
			
			Scanner scan = new Scanner(new File("src\\application\\aboutpage.txt"));
			
			while(scan.hasNext())
			{
				
				sb.append(scan.nextLine());
				
			}
			
			scan.close();
			
		} catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
			
		}
		
		aboutText.setText(sb.toString());
		
	}

}
