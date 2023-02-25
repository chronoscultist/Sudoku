package com.example.labb_4iamtostupidtocode;

import javafx.scene.control.Label;

public class MenuAction {

    public static void saveGame(Label statusLabel) {
        System.out.println("Saving game");
        statusLabel.setText("Game saved.");
    }

    public static void loadGame(Label statusLabel) {
        System.out.println("Loading game");
        statusLabel.setText("Game loaded.");
    }

    public static void exitGame(Label statusLabel) {
        System.out.println("Exiting game");
        statusLabel.setText("Exiting game.");
        System.exit(0);
    }
}