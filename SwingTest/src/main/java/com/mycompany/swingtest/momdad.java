/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingtest;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Lenovo
 */

class Dform extends JFrame{
    JFrame f= new JFrame();
    JTextField t1;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    
    
  Dform(){
      JLabel in=new JLabel("Enter text here:");
      in.setBounds(20,20,150,20);
      f.add(in);
      
      t1=new JTextField();
      t1.setBounds(20,40,150,20);
      f.add(t1);
      
      JButton b1=new JButton("Palin");
      b1.setBounds(40,65,80,20);
      
      l2=new JLabel();
      l2.setBounds(40,100,150,20);
      f.add(l2);
      
      
      b1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              String text=  t1.getText().toLowerCase().replaceAll("[^a-zA-Z]","");
              String reverse=new StringBuilder(text).reverse().toString();
              if(text.equals(reverse)){
                  l2.setText("'"+text+"'"+" is palindrome");
                  //JOptionPane.showMessageDialog(null, "'"+text+"'"+" is palindrome");
                
              }
              else{
                  l2.setText("'"+text+"'"+" is  not palindrome");
                 // JOptionPane.showMessageDialog(null,text+"is not palindrome");
              }    
          }
      
  });
      f.add(b1);
      
      JButton b2=new JButton("Rev");
      b2.setBounds(130,65,80,20);
      
      b2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
             String text= t1.getText();
             String rev = new StringBuilder(text).reverse().toString();
             l2.setText("Reverse of '"+text+"' is "+ rev);
          }
      });
      f.add(b2);
      
      JButton b3=new JButton("Vow");
      b3.setBounds(215,65,80,20);
      b3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              String text= t1.getText().toLowerCase();
              String vow = text.replaceAll("[^aeiou]", "");
            l2.setText("Vowels in'"+text+"' are "+ vow );
          }
      });
      f.add(b3);
      
      f.setSize(200,300);
      f.setLayout(null);
      f.setVisible(true);
      
  }
    
    
}
public class momdad {
    public static void main(String[] args){
        Dform form=new Dform();
        
    }
    
    
}
