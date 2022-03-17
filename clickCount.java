package com.count;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clickCount implements ActionListener
{
    private int count=0;
    JFrame frame;
    private JLabel label;
    // created a constructor to initialize the value of swing.
    public clickCount(){
        frame = new JFrame();
        JButton button = new JButton("click me");
        button.addActionListener(this);

        label=new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(220,100));
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI made by Devi");
        frame.pack();
        frame.setVisible(true);




    }
    public static void main(String[] args) {
       clickCount click= new clickCount();
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of click "+count);
    }
}
