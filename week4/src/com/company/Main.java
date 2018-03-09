package com.company;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class Category extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        public void drinksCategory(){
            StackPane backgroundPane = new StackPane();
            Image cokePicture = new Image(Drink_Coke.png);
            Image dasaniPicture = new Image(Drink_Dasani.png);
            Image fantaPicture = new Image(Drink_fanta.png);
            Image poweradePicture = new Image(Drink_Powerade.png);
            Image spritePicture = new Image(Drink_Sprite.png);
            Button cokeButton = new Button("$" + d.price + " " + d.weight + " Coke", new ImageView(cokePicture));
            Button dasaniButton = new Button("$" + d.price + " " + d.weight + " Dasani", new ImageView(dasaniPicture));
            Button fantaButton = new Button("$" + d.price + " " + d.weight + " Fanta", new ImageView(fantaPicture));
            Button poweradeButton = new Button("$" + d.price + " " + d.weight + " PowerAde", new ImageView(poweradePicture));
            Button spriteButton = new Button("$" + d.price + " " + d.weight + " Sprite", new ImageView(spritePicture));
            GridPane pane = new GridPane();
            pane.setVgap(10);
            pane.setMaxSize(575, 293);
            pane.addColumn(0, cokeButton, dasaniButton, fantaButton, poweradeButton, spriteButton);
            backgroundPane.getChildren().addAll(new ImageView(), pane);
            backgroundPane.setAlignment(pane, Pos.CENTER);
            Scene scene = new Scene(backgroundPane);
            primaryStage.setTitle("Drinks Category");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
         public void gumCategory(){
            StackPane backgroundPane = new StackPane();
            GridPane pane = new GridPane();
            pane.setVgap(10);
            pane.setMaxSize(575, 293);
            pane.addColumn((0, ));
            backgroundPane.setAlignment(pane, Pos.CENTER);
            Scene scene = new Scene(backgoundPane);
            primaryStage.setTitle("Gum Category");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public void sweetsCategory(){
            StackPane backgroundPane = new StackPane();
            Image butterfingerPicture = new Image(Sweets_butterfinger.png);
            Image kitkatPicture = new Image(Sweets_Kit-Kat-590x456.png);
            Image natureValleyPicture = new Image(Sweets_Nature-Valley-Oats-Honey-Bar.png);
            Image paydayPicture = new Image(Sweets_Payday.png);
            Image snickersPicture = new Image(Sweets_Snickers.png);
            Button butterfingerButton = new Button("$" + c.price + " " + c.weight + " Butterfinger", new ImageView(butterfingerPicture));
            Button kitkatButton = new Button("$" + c.price + " " + c.weight + " KitKat", new ImageView(kitkatPicture));
            Button natureValleyButton = new Button("$" + c.price + " " + c.weight + " Nature Valley", new ImageView(natureValleyPicture));
            Button paydayButton = new Button("$" + c.price + " " + c.weight + " Payday", new ImageView(paydayPicture));
            Button snickersButton = new Button("$" + c.price + " " + c.weight + " Snickers", new ImageView(snickersPicture));
            GridPane pane = new GridPane();
            pane.setVgap(10);
            pane.setMaxSize(575, 293);
            pane.addColumn(0, butterfingerButton, kitkatButton, natureValleyButton, paydayButton, snickersButton);
            Scene scene = new Scene(backgroundPane);
            primaryStage.setTitle("Sweets Category");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public void chipsCategory(){
            StackPane backgroundPane = new StackPane();
            Image doritosPicture = new Image(Chips_Doritos.png);
            Image laysClassicPicture = new Image(Chips_lays-classic.png);
            Image laysOvenBakedPicture = new Image(Chips_lays-oven-baked-barbecue.png);
            Image rufflesAllDressedPicture = new Image(Chips_ruffles-all-dressed.png);
            Image rufflesQuesoPicture = new Image(Chips_ruffles-queso-cheese.png);
            Button doritosButton = new Button("$" + c.price + " " + c.weight + " Doritos", new ImageView(doritosPicture));
            Button laysClassicButton = new Button("$" + c.price + " " + c.weight + " Lays Classic", new ImageView(laysClassicPicture));
            Button laysOvenBakedButton = new Button("$" + c.price + " " + c.weight + " Lays Oven Baked", new ImageView(laysOvenBakedPicture));
            Button rufflesAllDressedButton = new Button("$" + c.price + " " + c.weight + " Ruffles All Dressed", new ImageView(rufflesAllDressedPicture));
            Button rufflesQuesoButton = new Button("$" + c.price + " " + c.weight + " Ruffles Queso", new ImageView(rufflesQuesoPicture));
            GridPane pane = new GridPane();
            pane.setVgap(10);
            pane.setMaxSize(575, 293);
            pane.addColumn(0, doritosButton, laysClassicButton, laysOvenBakedButton, rufflesAllDressedButton, rufflesQuesoButton);
            Scene scene = new Scene(backgroundPane);
            primaryStage.setTitle("Chips Category");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
}