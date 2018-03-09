/*
 * Written by: Phillip Sorrell Radke
 * Written for: Bug Smasher's group
 * CST-135
 * This class is for the main GUI of the application. It is the first screen that the customer will be welcomed with.
 * 
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.control.Button;

public class HomePageGUI extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		//Create the dispenser. Generates 5 Products in an array within the dispenser class.
		Dispenser dispenser = new Dispenser();
		
		//A StackPane is used to stack the GridPane.
		StackPane backgroundPane = new StackPane();
		
		//Get background image and add it to the stack pane
		Image bgImage = new Image("Dispenser Design/Background & Button Images/Background.png");
		
		Image drinksCategoryImage = new Image (
			  "Dispenser Design/Background & Button Images/Starter Page/Drinks Button.png");
		
		Image gumCategoryImage = new Image (
			  "Dispenser Design/Background & Button Images/Starter Page/Gum Button.png");
		
		Image sweetsCategoryImage = new Image (
			  "Dispenser Design/Background & Button Images/Starter Page/Sweets Button.png");
		//END IMAGE CREATION
		
		//Create the buttons with the image displayed on them.
		Button drinksCategoryButton = new Button(
			  "", new ImageView(drinksCategoryImage));
		
		Button gumCategoryButton = new Button(
			  "", new ImageView(gumCategoryImage));
		
		Button sweetsCategoryButton = new Button(
			  "", new ImageView(sweetsCategoryImage));
		//END BUTTON CREATION
		
		//This is where the buttons for the three categories will sit.
		GridPane homePane = new GridPane();
		homePane.setVgap(10);
		//Max size is set because if not, the GridPane will not center in the StackPane
		homePane.setMaxSize(575, 293);
		
		//Add the buttons to the GridPane.
		homePane.addColumn(0, drinksCategoryButton, gumCategoryButton, sweetsCategoryButton);
		
		backgroundPane.getChildren().addAll(new ImageView(bgImage), homePane);
		backgroundPane.setAlignment(homePane, Pos.CENTER);
		
		//set the scene and display on the stage.
		Scene scene = new Scene(backgroundPane);
		primaryStage.setTitle("Vending Machine");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
