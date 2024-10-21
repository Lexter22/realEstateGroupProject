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

    
    private JPanel pnLogo,pnl ; 
    private JLabel lblQuahog, lblReal;
    private JButton btnAdd, btnDel, btnTransact, btnUsers, btnSignOut;
    public adminPage() {
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        pnLogo=new JPanel();
        pnLogo.setBounds(10,10,80,80);
        pnLogo.setBackground(Color.green);
        add(pnLogo);
        
        
        
        lblQuahog=new JLabel("QUAHOG SPRINGFIELDS");
        lblQuahog.setBounds(120,10,300,50);
        lblQuahog.setFont(new Font("Arial", Font.BOLD, 25));
        add(lblQuahog);
        
        lblReal=new JLabel("REAL ESTATES");
        lblReal.setBounds(120,40,300,50);
        lblReal.setFont(new Font("Arial", Font.BOLD, 15));
        add(lblReal);
        
        
        
        btnAdd=new JButton("ADD");
        btnAdd.setBounds(650,60,100,25);
        btnAdd.setBorder(null);
        btnAdd.setBackground(Color.CYAN);
        btnAdd.setFocusable(false);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnAdd);
        
        btnDel=new JButton("DELETE");
        btnDel.setBounds(775,60,100,25);
        btnDel.setBorder(null);
        btnDel.setBackground(Color.CYAN);
        btnDel.setFocusable(false);
        btnDel.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnDel);
        
        btnUsers=new JButton("USERS");
        btnUsers.setBounds(900,60,100,25);
        btnUsers.setBorder(null);
        btnUsers.setFocusable(false);
        btnUsers.setBackground(Color.CYAN);
        btnUsers.setFocusable(false);
        btnUsers.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnUsers);
        
        btnTransact=new JButton("TRANSACTIONS");
        btnTransact.setBounds(1020,60,130,25);
        btnTransact.setBorder(null);
        btnTransact.setFocusable(false);
        btnTransact.setBackground(Color.CYAN);
        btnTransact.setFocusable(false);
        btnTransact.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnTransact);
        
        btnSignOut=new JButton("SIGN OUT");
        btnSignOut.setBounds(1040,20,130,25);
        btnSignOut.setBorder(null);
        btnSignOut.setFocusable(false);
        btnSignOut.setBackground(Color.CYAN);
        btnSignOut.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnSignOut);
        
        pnl=new JPanel();
        pnl.setBounds(0,0,1200,100); 
        pnl.setBackground(Color.CYAN);
        add(pnl);
        
    }
        
}
