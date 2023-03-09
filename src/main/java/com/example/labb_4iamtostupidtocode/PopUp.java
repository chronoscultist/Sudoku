package com.example.labb_4iamtostupidtocode;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;


public class PopUp {
    private JFrame frame;

    public void chooseDiff() {

        frame = new JFrame();
        Label confirmation = new Label("What difficulty would you like?");

        //Set location of popup frame
        frame.setLocation(860, 340);
        //set the layout
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS)) ;
        frame.setTitle("Difficulty Setting");

        //add confirmatin label text to the popup frame
        frame.add(confirmation);


        // For each difficulty in SudokuLevel, add Button with index value and string
        for (SudokuUtilities.SudokuLevel level : SudokuUtilities.SudokuLevel.values()) {
            JButton button = new JButton(level.toString());
            button.addActionListener(e -> {
                //If the button is clicked, set the difficulty
                System.out.println("Difficulty set to: " + level);
                frame.dispose();
                SudokuUtilities.generateSudokuMatrix(SudokuUtilities.SudokuLevel.valueOf(String.valueOf(level)));

            });
            frame.add(button);
        }
        //Pack Use all our previus frame. methods and put them together.
        frame.pack();
        frame.setVisible(true);


    }


}