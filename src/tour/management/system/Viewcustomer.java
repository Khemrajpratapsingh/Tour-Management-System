
package tour.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Viewcustomer extends JFrame implements ActionListener{
    JButton back;
    String username;
    Viewcustomer(String username){
        this.username=username;
      
        setBounds(450,180,850,625);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        JLabel lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(30,50, 150, 25);
		add(lblAvailability);
                
                 JLabel labelusername = new JLabel();
	labelusername.setBounds(220,50, 150, 25);
		add(labelusername);
		
		JLabel lblCleanStatus = new JLabel("Id ");
		lblCleanStatus.setBounds(30, 110, 150, 25);
		add(lblCleanStatus);
                
                 JLabel lblid = new JLabel();
		lblid.setBounds(220,110, 150, 25);
		add(lblid);
                
                
                 JLabel lblnumber = new JLabel("number");
		lblnumber.setBounds(30,170, 150, 25);
		add(lblnumber);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(220, 170, 150, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(30, 230, 150, 25);
		add(lblNewLabel_1);
                
                 JLabel lblname = new JLabel();
		lblname.setBounds(220,230, 150, 25);
		add(lblname);

		
		JLabel lblgender = new JLabel("Gender");
		lblgender.setBounds(30, 290, 150, 25);
		add(lblgender);
                
                JLabel lbgender = new JLabel();
		lbgender.setBounds(220,290, 150, 25);
		add(lbgender);
                
                
                JLabel l3 = new JLabel("Country");
		l3.setBounds(500, 50, 150, 25);
		add(l3);
                
                JLabel lblcountry = new JLabel();
		lblcountry.setBounds(690,50, 150, 25);
		add(lblcountry);
                
                JLabel l4 = new JLabel("Address");
		l4.setBounds(500, 110, 150, 25);
		add(l4);
                
                JLabel lbladdress = new JLabel();
		lbladdress.setBounds(690,110, 150, 25);
		add(lbladdress);
                
                JLabel l5 = new JLabel("Phone");
		l5.setBounds(500 ,170, 150, 25);
		add(l5);
                
                JLabel lblphone = new JLabel();
		lblphone.setBounds(690,170, 150, 25);
		add(lblphone);
                
                JLabel l6 = new JLabel("Email");
		l6.setBounds(500, 230, 150, 25);
		add(l6);
                
                JLabel lblemail = new JLabel();
		lblemail.setBounds(690,230, 150, 25);
		add(lblemail);
                
        back = new JButton("Back");
        back.setBounds(350,350,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120,400,600,200);
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lblid.setText(rs.getString("id"));
                lblNewLabel.setText(rs.getString("number"));
                lblname.setText(rs.getString("name"));
                lbgender.setText(rs.getString("gender"));
                lblcountry.setText(rs.getString("country"));
                lbladdress.setText(rs.getString("address"));
                lblphone.setText(rs.getString("Phone"));
                lblemail.setText(rs.getString("Email"));
                
                
               


                
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
                
                setVisible(true);
               
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible((false));
            
        }
    }
    public static void main(String[]args){
        new Viewcustomer("jonty");
    }
    
}
