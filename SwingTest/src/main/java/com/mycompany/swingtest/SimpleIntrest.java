package com.mycompany.swingtest;
import javax.swing.*;
import java.awt.event.*;
class Frame extends JFrame{
    JFrame f=new JFrame();
    JTextField t1; JTextField t2;JTextField t3;JLabel lr;
    Frame(){
  
        JLabel l1=new JLabel("Enter Principal:");
        l1.setBounds(20,20,150,20);
        f.add(l1);
        
        t1=new JTextField();
        t1.setBounds(190,20,100,20);
        f.add(t1);
        
         JLabel l2=new JLabel("Enter Rate:");
        l2.setBounds(20,60,190,20);
        f.add(l2);
        
        t2=new JTextField();
        t2.setBounds(190,60,100,20);
        f.add(t2);
        
         JLabel l3=new JLabel("Enter Time:");
        l3.setBounds(20,100,190,20);
        f.add(l3);
        
        t3=new JTextField();
        t3.setBounds(190,100,100,20);
        f.add(t3);
        
        JButton b1=new JButton("Calculate");
        b1.setBounds(80,130,100,20);
         
        lr=new JLabel("Simple Interest");
        lr.setBounds(80,150,150,20);
        f.add(lr);
         b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            double P = Double.parseDouble(t1.getText());
                double T = Double.parseDouble(t2.getText());
                int R=Integer.parseInt(t3.getText());         
                double SI = (P*T*R)/100;
                lr.setText("SimpleInterest = "+String.valueOf(SI));
        }
        });
        f.add(b1);  
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
  
public class SimpleIntrest {
     public static void main(String[] args) {
        Frame myform=new Frame();
        
    }
    
}
