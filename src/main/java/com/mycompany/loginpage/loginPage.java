/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author johnl
 */
public class loginPage extends JFrame implements ActionListener{
    
    private JLabel lblQuahogSpringField1, lblQuahogSpringField2, lblUserName, lblPassword;
    private JTextField txtLoginField;
    private JPasswordField psfPassword;
    private JButton btnBack, btnLogIn;
    
    public loginPage() {
        
        setSize(400, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lblQuahogSpringField1 = new JLabel("Quahog Springfield");
        lblQuahogSpringField1.setBounds(20, 35, 360, 40);
        lblQuahogSpringField1.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField1.setFont(new Font("Arial", Font.PLAIN, 35));
        add(lblQuahogSpringField1);
        
        
        lblQuahogSpringField2 = new JLabel("Real Estates");
        lblQuahogSpringField2.setBounds(20, 75, 360, 30);
        lblQuahogSpringField2.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField2.setFont(new Font("Arial", Font.PLAIN, 20));
        add(lblQuahogSpringField2);
        
        
        lblUserName = new JLabel("Username :");
        lblUserName.setBounds(20, 400, 360, 30);
        lblUserName.setHorizontalAlignment(JLabel.LEFT);
        lblUserName.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblUserName);
        
        
        lblPassword = new JLabel("Password :");
        lblPassword.setBounds(20, 430, 360, 30);
        lblPassword.setHorizontalAlignment(JLabel.LEFT);
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblPassword);
        
        txtLoginField = new JTextField();
        txtLoginField.setBounds(120, 405, 240, 20);
        //txtLoginField.setFont(new Font("Arial", Font.PLAIN,20));
        add(txtLoginField);
        
        
        psfPassword = new JPasswordField();
        psfPassword.setBounds(120, 435, 240, 20);
        psfPassword.setFont(new Font("Arial", Font.PLAIN,20));
        add(psfPassword);
        
        
        btnBack = new JButton("Back");
        btnBack.setBounds(175, 500, 80, 25);
        add(btnBack);
        
        
        btnLogIn = new JButton("Log In");
        btnLogIn.setBounds(275, 500, 80, 25);
        add(btnLogIn);
        
        btnBack.addActionListener(this);
        btnLogIn.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btnBack){
            
            welcomePage frame = new welcomePage();
            frame.setVisible(true);
            dispose();
        }
        
}  
}
