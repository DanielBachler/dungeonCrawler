package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inputer extends JFrame{
    private JTextField inputField;
    private JLabel messageField;
    private JPanel mainPanel;
    private JButton submitButton;

    private String message;

    Inputer() {
        super("Input");
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
                message = inputField.getText();
                inputField.setText("");
            }
        });
    }

    public void changeLabel(String message) {
        messageField.setText(message);
    }

    public String getInput() {
        return message;
    }
}
