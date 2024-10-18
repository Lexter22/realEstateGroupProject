/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author johnl
 */
public class infoPage extends JFrame {
    
private JLabel nameId, ID, Price, Location;
private JTextArea Info;
private JButton Back, Buy;
private JPanel pic;
    public infoPage(){
        
        setTitle("Details");
        setSize(800,700);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nameId = new JLabel("Name: ");
        nameId.setBounds(50, 50, 350, 50);
        nameId.setFont(new Font("Arial" ,Font.PLAIN, 17));
        add(nameId);
        
        ID = new JLabel("Property ID: ");
        ID.setBounds(50, 110, 350, 50);
        ID.setFont(new Font("Arial" ,Font.PLAIN, 17));
        add(ID);
        
        Location = new JLabel("Location: " );
        Location.setBounds(50, 170, 350, 50);
        Location.setFont(new Font("Arial" ,Font.PLAIN, 17));
        add(Location);
        
        Price = new JLabel("Price: ");
        Price.setBounds(50, 230, 350, 50);
        Price.setFont(new Font("Arial" ,Font.PLAIN, 17));
        add(Price);
        
        Info = new JTextArea();
        Info.setBounds(50, 290, 680, 290);
        Info.setFont(new Font("Arial" ,Font.PLAIN, 17));
        Info.setEditable(false);
        add(Info);
        
        Back = new JButton("Back");
        Back.setBounds(550, 610, 75, 30);
        add(Back);
        
        Buy = new JButton("Buy");
        Buy.setBounds(650, 610, 75, 30);
        add(Buy);
        
        pic = new JPanel();
        pic.setBounds(400, 50, 330, 230);
        pic.setBackground(Color.red);
        add(pic);
        
    }
    
}
