package com.example.labb_4iamtostupidtocode;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class MainMenu extends Application{

    public static Label status;


    // Override the start() method from the Application class
    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();

        VBox statusBox = new VBox();

        status = new Label("Sudoku");

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

        GridPane gridPane = new GridPane();

        int[][][] sudokuMatrix = SudokuUtilities.generateSudokuMatrix(SudokuUtilities.SudokuLevel.EASY);
        int[][] initialSudokuValues = new int[SudokuUtilities.GRID_SIZE][SudokuUtilities.GRID_SIZE];
        int[][] sudokuSolution = new int[SudokuUtilities.GRID_SIZE][SudokuUtilities.GRID_SIZE];
        for (int row = 0; row < SudokuUtilities.GRID_SIZE; row++) {
            for (int col = 0; col < SudokuUtilities.GRID_SIZE; col++) {
                initialSudokuValues[row][col] = sudokuMatrix[row][col][0];
                sudokuSolution[row][col] = sudokuMatrix[row][col][1];


        // Add TextFields to the GridPane for each cell of the Sudoku board
        for (int row = 0; row < SudokuUtilities.GRID_SIZE; row++) {
            for (int col = 0; col < SudokuUtilities.GRID_SIZE; col++) {
                TextField textField = new TextField();
                textField.setPrefWidth(40);
                textField.setPrefHeight(40);
                textField.setText(String.valueOf(initialSudokuValues[row][col]));
                textField.setEditable(initialSudokuValues[row][col] == 0);
                textField.setStyle("-fx-font-size: 20px; -fx-alignment: center;");
                gridPane.add(textField, col, row);
            }
        }


    }











    public static void main(String[] args) {

        launch(args);
    }
}
    }}
