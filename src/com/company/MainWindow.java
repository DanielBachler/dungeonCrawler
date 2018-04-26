package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The main game window, contains the map as well as gives info to the player
 */
public class MainWindow extends JFrame{
    private JButton startButton;
    private JLabel map;
    private JLabel topMessage;
    private JPanel mainPanel;
    private JButton exitButton;

    //Default constructor for MainWindow
    MainWindow() {
        //Sets up super constructor
        super();
        //Sets content pane and close operation
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Sets initial map image
        Icon mapInitial = new ImageIcon("redSquare.png");
        map.setIcon(mapInitial);

        //Setting default location
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        //Displaying
        pack();
        setVisible(true);

        //The start button listener
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Exit button listener
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Closes window and exits program with no error
                close();
                System.exit(0);
            }
        });
    }

    //Changes the message on top of the map
    public void changeTopMessage(String message) {
        topMessage.setText(message);
    }

    //Method to close open window
    private void close() {
        this.dispose();
    }
}
