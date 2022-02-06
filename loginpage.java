package com.devi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginpage implements ActionListener {
	private  static JTextField area;
	private static JPasswordField pwd;
	private static JFrame frame;
	private static JPanel panel;

	private static JLabel users,label1,success;
	private static JButton button;
	
	
	public static void main(String[] args) {
		
		//created frame.
		frame=new JFrame();
	frame.setSize(300,300);
	frame.setBackground(Color.red);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("login page");

	// created panel.
	panel=new JPanel();
		frame.add(panel);
	panel.setLayout(null);
	
	
	// for the user-name and the input field of user.
	users=new JLabel();
	users.setText("User");
	users.setBounds(40,20,30,20);
	panel.add(users);
		
		 area=new JTextField(20);
		area.setBounds(100,20,165,25);
		area.setBackground(Color.white);
		panel.add(area);
		
		
		//for the password name and the password filed.
		label1=new JLabel();
		label1.setText("password");
		label1.setBounds(30,80,70,20);
		panel.add(label1);
		
		 pwd =new JPasswordField(10);
		pwd.setBounds(100,80,165,25);
		panel.add(pwd);
		
		
		// for the login button,
		button=new JButton();
		button.setText("login");
		button.setBounds(40,140,80,20);
		button.addActionListener(new loginpage());
		panel.add(button);
		
		
		// for the success label
		
		success = new JLabel();
		success.setText("");
		success.setBounds(100,170,100,20);
		
		panel.add(success);
		
		
		// for the visibility of the frame and their contents.
		frame.setVisible(true);
	}
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	String user=area.getText();
	String password=pwd.getText();
//		System.out.println(user +","+ password);
		
			if (users.equals("devi") && password.equals("1234")){
				success.setText("login successfully");
			}
			else{
				success.setText("login unsucess");
			}
		}
		
	
}