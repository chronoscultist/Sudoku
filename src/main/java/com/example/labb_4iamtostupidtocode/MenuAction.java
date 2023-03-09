package com.example.labb_4iamtostupidtocode;

import javafx.scene.control.Label;

public class MenuAction {

    public static void setDifficulty(Label status) {
        System.out.println("Changing Difficulty");
        status.setText("Changing Difficulty");
        PopUp PopUp = new PopUp();
        PopUp.chooseDiff();
    }

    public static void saveGame(Label status) {
        System.out.println("Saving game");
        status.setText("Saving game");
    }

    public static void loadGame(Label Status) {
        System.out.println("Loading game");
        Status.setText("Loading game");
    }

    public static void exitGame(Label status) {
        System.out.println("Exiting game");
        status.setText("Loading game");
        System.exit(0);
    }
}