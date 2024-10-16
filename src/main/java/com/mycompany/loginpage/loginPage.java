/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginpage;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author johnl
 */
public class loginPage extends JFrame {
    private JLabel lblWelcome,lblRealEstate, lblTagLine1,lblTagLine2;
    private JButton btnLogin,btnSignUp;
    public loginPage() {
        setTitle("Welcome");
        setSize(1200,700);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblWelcome = new JLabel("Quahog Springfield Real Estate");
        lblWelcome.setBounds(0,50,600,50);
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);
        lblWelcome.setFont(new Font("Arial", Font.PLAIN, 25));
        add(lblWelcome);
        
        lblRealEstate = new JLabel("Welcome");
        lblRealEstate.setBounds(0,150,600,50);
        lblRealEstate.setHorizontalAlignment(JLabel.CENTER);
        lblRealEstate.setFont(new Font("Arial", Font.PLAIN, 40));
        add(lblRealEstate);
        
        lblTagLine1 = new JLabel("From Springfield to Spooner Street –");
        lblTagLine1.setBounds(700,250,500,15);
        lblTagLine1.setHorizontalAlignment(JLabel.CENTER);
        lblTagLine1.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblTagLine1);
        
        lblTagLine2 = new JLabel("Make Your Move with Us!");
        lblTagLine2.setBounds(700,270,500,15);
        lblTagLine2.setHorizontalAlignment(JLabel.CENTER);
        lblTagLine2.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblTagLine2);
        
        btnLogin = new JButton("Log In");
        btnLogin.setBounds(800,450, 100,35);
        btnLogin.setHorizontalAlignment(JLabel.CENTER);
        btnLogin.setFont(new Font("Arial", Font.PLAIN, 15));
        add(btnLogin);
        
        btnSignUp = new JButton("Sign Up");
        btnSignUp.setBounds(975,450, 100,35);
        btnSignUp.setHorizontalAlignment(JLabel.CENTER);
        btnSignUp.setFont(new Font("Arial", Font.PLAIN, 15));
        add(btnSignUp);
        
        
    }
 
}
