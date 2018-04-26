package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * A popup window used to get input from the player
 * Utilizes JFrames to accomplish task
 */
public class Inputer extends JFrame{
    private JTextField inputField;
    private JLabel messageField;
    private JPanel mainPanel;
    private JButton submitButton;


    //Default constructor
    Inputer(Player p) {
        //Sets up name of window as input
        super("Input");
        //Sets the main content pane and close operation
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //Sets the default text for JLabel
        messageField.setText("Input Window");

        //Setting default location
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        //Displaying
        pack();
        setVisible(true);

        //Submit button listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setName(inputField.getText());
            }
        });
    }

    //Changes the JLabel to the given message
    public void changeLabel(String message) {
        messageField.setText(message);
    }
}
