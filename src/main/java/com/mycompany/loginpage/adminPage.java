/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;



public class adminPage extends JFrame{

    
    private JPanel logo, l; 
    private JLabel lQs, lRe;
    private JButton add, del, transact, users, signOut;
    public adminPage() {
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        logo=new JPanel();
        logo.setBounds(10,10,80,80);
        logo.setBackground(Color.green);
        add(logo);
        
        
        
        lQs=new JLabel("QUAHOG SPRINGFIELDS");
        lQs.setBounds(120,10,300,50);
        lQs.setFont(new Font("Arial", Font.BOLD, 25));
        add(lQs);
        
        lRe=new JLabel("REAL ESTATES");
        lRe.setBounds(120,40,300,50);
        lRe.setFont(new Font("Arial", Font.BOLD, 15));
        add(lRe);
        
        
        
        add=new JButton("ADD");
        add.setBounds(650,60,100,25);
        add.setBorder(null);
        add.setBackground(Color.CYAN);
        add.setFocusable(false);
        add.setFont(new Font("Arial", Font.BOLD, 15));
        add(add);
        
        del=new JButton("DELETE");
        del.setBounds(775,60,100,25);
        del.setBorder(null);
        del.setBackground(Color.CYAN);
        del.setFocusable(false);
        del.setFont(new Font("Arial", Font.BOLD, 15));
        add(del);
        
        users=new JButton("USERS");
        users.setBounds(900,60,100,25);
        users.setBorder(null);
        users.setFocusable(false);
        users.setBackground(Color.CYAN);
        users.setFocusable(false);
        users.setFont(new Font("Arial", Font.BOLD, 15));
        add(users);
        
        transact=new JButton("TRANSACTIONS");
        transact.setBounds(1020,60,130,25);
        transact.setBorder(null);
        transact.setFocusable(false);
        transact.setBackground(Color.CYAN);
        transact.setFocusable(false);
        transact.setFont(new Font("Arial", Font.BOLD, 15));
        add(transact);
        
        signOut=new JButton("SIGN OUT");
        signOut.setBounds(1040,20,130,25);
        signOut.setBorder(null);
        signOut.setFocusable(false);
        signOut.setBackground(Color.CYAN);
        signOut.setFont(new Font("Arial", Font.BOLD, 15));
        add(signOut);
        
        l=new JPanel();
        l.setBounds(0,0,1200,100);
        l.setBackground(Color.CYAN);
        add(l);
        
    }
        
}
