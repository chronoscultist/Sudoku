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

public class MainMenu extends Application {

    public Label statusLabel;

    // Override the start() method from the Application class
    @Override
    public void start(Stage primaryStage) {

        // Create a new BorderPane object
        BorderPane root = new BorderPane();

        // Create a new VBox object for the status label
        VBox statusBox = new VBox();

        // Create the status label
        statusLabel = new Label("Welcome to Sudoku!");

        // Add the status label to the VBox
        statusBox.getChildren().add(statusLabel);

        // Create a new MenuBar object
        MenuBar menuBar = new MenuBar();

        // Create a new Menu object named "File"
        Menu fileMenu = new Menu("File");

        // Create a new Menu object named "Game"
        Menu gameMenu = new Menu("Game");

        // Create a new Menu object named "Help"
        Menu helpMenu = new Menu("Help");

        // Create three MenuItems that will appear in the "File" Menu
        MenuItem saveGameMenuItem = new MenuItem("Save Game");
        MenuItem loadGameMenuItem = new MenuItem("Load Game");
        MenuItem exitGameMenuItem = new MenuItem("Exit");

        // Add the two MenuItems to the "File" Menu
        fileMenu.getItems().addAll(loadGameMenuItem, saveGameMenuItem, exitGameMenuItem);

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

        // Set the actions for each menu item
        saveGameMenuItem.setOnAction(click -> {MenuAction.saveGame(statusLabel);});
        loadGameMenuItem.setOnAction(click -> {MenuAction.loadGame(statusLabel);});
        exitGameMenuItem.setOnAction(click -> {MenuAction.exitGame(statusLabel);});
    }

    // The main method calls the launch() method to start the application
    public static void main(String[] args) {
        launch(args);
    }
}
