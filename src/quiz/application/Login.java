package quiz.application;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;


public class Login extends JFrame{
    
    Login(){
        getContentPane().setBackground(Color.white);
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    
    }
    public static void main(String[] args){
    
    new Login(); 
    }
    
}
