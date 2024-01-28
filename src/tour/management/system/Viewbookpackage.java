
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Viewbookpackage extends JFrame implements ActionListener{
    JButton back;
    Viewbookpackage(String username){
        setBounds(400,200,900,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
       JLabel text  = new JLabel("VIEW PACKAGES DETAILS");
		text.setBounds(60,0, 300, 30);
                text.setFont(new Font("Tohamo",Font.BOLD,20));
		add(text);
                
                
        
        JLabel lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(30,50, 150, 25);
		add(lblAvailability);
                
                 JLabel labelusername = new JLabel();
	labelusername.setBounds(220,50, 150, 25);
		add(labelusername);
		
		JLabel lblCleanStatus = new JLabel("package ");
		lblCleanStatus.setBounds(30, 90, 150, 25);
		add(lblCleanStatus);
                
                 JLabel lblpackage = new JLabel();
		lblpackage.setBounds(220,90, 150, 25);
		add(lblpackage);
                
                
                 JLabel lblnumber = new JLabel("total persons");
		lblnumber.setBounds(30,130, 150, 25);
		add(lblnumber);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(220, 130, 150, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setBounds(30, 170, 150, 25);
		add(lblNewLabel_1);
                
                 JLabel lblname = new JLabel();
		lblname.setBounds(220,170, 150, 25);
		add(lblname);

		
		JLabel lblgender = new JLabel("number");
		lblgender.setBounds(30, 210, 150, 25);
		add(lblgender);
                
                JLabel lbgender = new JLabel();
		lbgender.setBounds(220,210, 150, 25);
		add(lbgender);
                
                
                JLabel l3 = new JLabel("phone");
		l3.setBounds(30, 250, 150, 25);
		add(l3);
                
                JLabel lblcountry = new JLabel();
		lblcountry.setBounds(220,250, 150, 25);
		add(lblcountry);
                
                JLabel l4 = new JLabel("prize");
		l4.setBounds(30, 290, 150, 25);
		add(l4);
                
                JLabel lbladdress = new JLabel();
		lbladdress.setBounds(220,290, 150, 25);
		add(lbladdress);
               
        back = new JButton("Back");
        back.setBounds(200,350,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,500,400);
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lblpackage.setText(rs.getString("package"));
                lblNewLabel.setText(rs.getString("persons"));
                lblname.setText(rs.getString("id"));
                lbgender.setText(rs.getString("number"));
                lblcountry.setText(rs.getString("phone"));
                lbladdress.setText(rs.getString("prize"));
               
                
               


                
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
                
                setVisible(true);
               
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
        setVisible(false);
        
    }
    }
    public static void main(String[]args){
        new Viewbookpackage("jonty");
    }
    
}
