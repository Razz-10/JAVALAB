/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swingtest;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class MyForm extends JFrame implements MouseListener  {
    JFrame f=new JFrame();
    JTextField t1; JTextField t2;JLabel lr;
    MyForm(){
        
        JMenuBar bar=new JMenuBar();
        JMenu file_menu= new JMenu("File");
        JMenu View_menu= new JMenu("View");
        JMenuItem open =new JMenuItem("Open");
        file_menu.add(open);
        
        JMenuItem close =new JMenuItem("Close");
        file_menu.add(close);
        
         JMenu print =new JMenu("Print");
         JMenuItem preview =new JMenuItem("Preview");
         print.add(preview);
         file_menu.add(print);
        
        bar.add(file_menu);
        bar.add(View_menu);
        
        f.setJMenuBar(bar);
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
        
        JButton b1=new JButton("Add");
        b1.setBounds(80,100,100,20);
         
        lr=new JLabel("Result");
        lr.setBounds(80,130,150,20);
        f.add(lr);
        
       
        
        //Event
       b1.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
         Object[] options={"Yes","No"};
         int ret=JOptionPane.showOptionDialog(f,"Are you sure","Message",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
         if(ret==0){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int sum  = n1+n2;
            lr.setText("Sum="+sum);
       }
        }
    });
       f.addMouseListener(this);
        f.add(b1);
        
        
        
         
        
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    }
     @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
         int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                
                int sum = num1 + num2;
                
                lr.setText("Sum = "+sum);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}


public class SwingTest {

    public static void main(String[] args) {
        MyForm myform=new MyForm();
        
    }
}

