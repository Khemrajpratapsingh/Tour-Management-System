
package tour.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Loading extends JFrame implements Runnable {
    
    JProgressBar bar;
    String username;
    
    Thread t;
        public void run(){
    try{
       for(int i=1;i<=101;i++){
           int max = bar.getMaximum();//100
           int value = bar.getValue();
           if(max>value){
               bar.setValue(bar.getValue() + 1 );
           }else{
               setVisible(false);
               new Dashboard(username);
               
           }
           Thread.sleep(50);
       }
        
    }catch(Exception e){
        e.printStackTrace();
    }
    

    }
    
    Loading(String username) {
        this.username = username;
        t = new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
    
        
        JLabel text = new JLabel("Tour Management System");
        text.setBounds(100,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(180,80,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading, Please wait...");
        loading.setBounds(230,130,150,30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Raleway",Font.BOLD,16));
        add(loading);
        
        JLabel lbusername = new JLabel("welcome " +username);
        lbusername.setBounds(20,310,400,40);
        lbusername.setForeground(Color.red);
        lbusername.setFont(new Font("Raleway",Font.BOLD,16));
        add(lbusername);
        
        t.start();
        
        setVisible(true);
                
       
        
    }
    public static void main(String[] args){
        new Loading("");
    }
    
}
