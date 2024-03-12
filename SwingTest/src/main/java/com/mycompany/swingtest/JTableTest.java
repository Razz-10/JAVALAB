/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingtest;
import javax.swing.*;
import javax.swing.tree.*;



/**
 *
 * @author Lenovo
 */
public class JTableTest {
    
    public static void CreateTree(){
        
        JFrame f=new JFrame("JTree Example");
        DefaultMutableTreeNode college = new DefaultMutableTreeNode("College");
        DefaultMutableTreeNode teacher = new DefaultMutableTreeNode("Teacher");
        DefaultMutableTreeNode student = new DefaultMutableTreeNode("Student");
        DefaultMutableTreeNode ram = new DefaultMutableTreeNode("Ram");
        DefaultMutableTreeNode Hari = new DefaultMutableTreeNode("Hari");
        teacher.add(ram);teacher.add(Hari);
        DefaultMutableTreeNode sita = new DefaultMutableTreeNode("Sita");
        DefaultMutableTreeNode gita = new DefaultMutableTreeNode("Gita");
        student.add(sita);student.add(gita);
        college.add(teacher);college.add(student);
        JTree tree =new JTree(college);
        f.add(tree);
        f.setSize(300,400);
        f.setVisible(true);
        
    }
   
    public static void CreateTable(String[] s){
        JFrame f =new JFrame("JTable Example");
        String[] header = {"ID","First Name","Last Name"};
        String[][] data={{"1","Hari","Karki"},{"2","Raj","Tuladhar"}};
        JTable table= new JTable(data,header);
        JScrollPane p= new JScrollPane(table);
        f.add(p);
        f.setSize(300,400);
        f.setVisible(true);
    }
   
           public static void main(String[] ss){
               JTableTest.CreateTree();
               JTableTest.CreateTable(ss);
               
           }
    }
   
