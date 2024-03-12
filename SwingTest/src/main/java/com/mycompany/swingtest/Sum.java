/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingtest;

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


class mForm extends JFrame implements ActionListener{
    JFrame f=new JFrame();
    JTextField t1; JTextField t2;JLabel lr;
    mForm(){
        JLabel l1=new JLabel("Enter first number:");
        l1.setBounds(20,20,150,20);
        f.add(l1);
        
        t1=new JTextField();
        t1.setBounds(190,20,100,20);
        f.add(t1);
        
         JLabel l2=new JLabel("Enter Second  number:");
        l2.setBounds(20,60,190,20);
        f.add(l2);
        
        t2=new JTextField();
        t2.setBounds(190,60,100,20);
        f.add(t2);
         
        lr=new JLabel("Result");
        lr.setBounds(80,130,150,20);
        f.add(lr);
        
        f.addKeyListener(new keychecker());
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
        

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
    
class keychecker extends KeyAdapter{
         public void keyPressed(KeyEvent e)  {

        int num1 = Integer.parseInt(t1.getText()); 

        int num2 = Integer.parseInt(t2.getText()); 

        int sum = num1 + num2;

        lr.setText("The sum is" +sum);
   }
}
}

public class Sum {
    public static void main(String[] args){
        mForm form=new mForm();
        
    }
    
}