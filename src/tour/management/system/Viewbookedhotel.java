
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Viewbookedhotel extends JFrame implements ActionListener {
     JButton back;
    Viewbookedhotel(String username){
        setBounds(400,200,1000,600);
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
		
		JLabel lblCleanStatus = new JLabel("Hotel name ");
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
                
                
		JLabel lbldays = new JLabel("Total Days");
		lbldays.setBounds(30, 170, 150, 25);
		add(lbldays);
                
                 JLabel lblday = new JLabel();
		lblday.setBounds(220,170, 150, 25);
		add(lblday);

                
		JLabel lblac = new JLabel("IAc/Non Ac");
		lblac.setBounds(30, 210, 150, 25);
		add(lblac);
                
                 JLabel lbac = new JLabel();
		lbac.setBounds(220,210, 150, 25);
		add(lbac);

                
		JLabel lblfood = new JLabel("Food Included?");
		lblfood.setBounds(30, 250, 150, 25);
		add(lblfood);
                
                 JLabel lbfood = new JLabel();
		lbfood.setBounds(220,250, 150, 25);
		add(lbfood);

		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(30, 290, 150, 25);
		add(lblNewLabel_1);
                
                 JLabel lblname = new JLabel();
		lblname.setBounds(220,290, 150, 25);
		add(lblname);

		
		JLabel lblgender = new JLabel("number");
		lblgender.setBounds(30, 330, 150, 25);
		add(lblgender);
                
                JLabel lbgender = new JLabel();
		lbgender.setBounds(220,330, 150, 25);
		add(lbgender);
                
                
                JLabel l3 = new JLabel("phone");
		l3.setBounds(30, 370, 150, 25);
		add(l3);
                
                JLabel lblcountry = new JLabel();
		lblcountry.setBounds(220,370, 150, 25);
		add(lblcountry);
                
                JLabel l4 = new JLabel("Total Cost");
		l4.setBounds(30, 410, 150, 25);
		add(l4);
                
                JLabel lbladdress = new JLabel();
		lbladdress.setBounds(220,410, 150, 25);
		add(lbladdress);
               
        back = new JButton("Back");
        back.setBounds(150,450,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,500,400);
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from hotel where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lblpackage.setText(rs.getString("name"));
                lblNewLabel.setText(rs.getString("persons"));
                lblname.setText(rs.getString("id"));
                lbgender.setText(rs.getString("number"));
                lblcountry.setText(rs.getString("phone"));
                lbladdress.setText(rs.getString("prize"));
                lblday.setText(rs.getString("days"));
                lbac.setText(rs.getString("AC"));
                lbfood.setText(rs.getString("food"));
                
               
                
               


                
                
                
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
            new Viewbookedhotel("jonty");
        }
}

