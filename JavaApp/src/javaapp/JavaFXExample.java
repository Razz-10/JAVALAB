/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
import javafx.application.*;
import javafx.stage.Stage;

import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.TextField;


/**
 *
 * @author Lenovo
 */
public class JavaFXExample extends Application{
    @Override
    public void start (Stage st){
        st.setTitle("Adding two numbers");
        GridPane pane=new GridPane();
        TextField t1=new TextField();
        
        pane.add(t1,30,100);
       //pane.getChildren().add(t1);
       Scene sc=new Scene(pane,200,300);
       st.setScene(sc);
        
        st.show();
        
        
    }
    public static void main(String[] args){
        launch(args);
        
    }
    
    
    
}
