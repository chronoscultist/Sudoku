package com.example.labb_4iamtostupidtocode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainMenu extends Application{

    public static Label status;


    // Override the start() method from the Application class

    public void start(Stage primaryStage) {

        // Create a new BorderPane object
        BorderPane root = new BorderPane();

        // Create a new VBox object for the status label
        VBox statusBox = new VBox();

        // Create the status label
        status = new Label("Sudoku");

        // Add the status label to the VBox
        statusBox.getChildren().add(status);

        // Create a new MenuBar object
        MenuBar menuBar = new MenuBar();

        // Create a new Menu object named "File", "Game" and "Help"
        Menu fileMenu = new Menu("File");
        Menu gameMenu = new Menu("Game");
        Menu helpMenu = new Menu("Help");

        // Create three MenuItems that will appear in the "File" Menu
        MenuItem saveGameMenuItem = new MenuItem("Save Game");
        MenuItem loadGameMenuItem = new MenuItem("Load Game");
        MenuItem exitGameMenuItem = new MenuItem("Exit");

        // Create MenuItems that will appear in the "Game" Menu
        MenuItem setDifficultyMenuItem = new MenuItem("Set Difficulty");


        // Add the three MenuItems to the "File" Menu
        fileMenu.getItems().addAll(loadGameMenuItem, saveGameMenuItem, exitGameMenuItem);

        // Add the MenuItems to the "Game" Menu
        gameMenu.getItems().addAll(setDifficultyMenuItem);

        // Add the "File", "Game" and "Help" Menu Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, gameMenu, helpMenu);

        // Set the MenuBar to be displayed at the top of the BorderPane
        root.setTop(menuBar);

        // Set the VBox to be displayed at the bottom of the BorderPane
        root.setBottom(statusBox);

        // Create a new Scene with the BorderPane and dimensions
        Scene scene = new Scene(root, 400, 400);


        primaryStage.setTitle("LETS COMMIT SEPPUKU");
        // Set the Scene of the Stage and show the Stage
        primaryStage.setScene(scene);
        primaryStage.show();

        // Set the actions for each File menu item click
        saveGameMenuItem.setOnAction(click -> MenuAction.saveGame(status));
        loadGameMenuItem.setOnAction(click -> MenuAction.loadGame(status));
        exitGameMenuItem.setOnAction(click -> MenuAction.exitGame(status));

        // Set the actions for each game menu item click
        setDifficultyMenuItem.setOnAction(click -> MenuAction.setDifficulty(status));
    }









    public static void main(String[] args) {

        launch(args);
    }
}
