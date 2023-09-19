
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton exit;
    About(){
        setBounds(400,200,800,500);
        getContentPane().setBackground(Color.magenta);
        setLayout(null);
        
        
        JLabel text =  new JLabel("ABOUT TOUR MANAGEMENT SYSTEM");
        text.setBounds(20,10,300,30);
        text.setFont(new Font("tohamo",Font.BOLD,16));
        add(text);
        
        String s = "                                                         About Projects          \n  "
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;
        
        
        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(80, 50, 600, 350);
        t1.setFont(new Font("tohamo",Font.PLAIN,15));
        t1.setBackground(Color.cyan);
        add (t1);
        
                 
        exit = new JButton("exit");
        exit.setBounds(300,400,100,25);
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
        setVisible(false);
    }
    }
    public static void main(String [] args){
        new About();
    }
        
    
}
    


