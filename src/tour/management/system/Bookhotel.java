
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Bookhotel extends JFrame implements ActionListener{
        
         Choice chotel , chac , chfood;
    JTextField tfpersons , tfdays;
    JLabel labelusername,lbgender,lblname,lblcountry,lbladdress;
    JButton back,bookpackage,checkprize;
    String username;
  
    Bookhotel(String username){
        this.username = username;
        setBounds(450,200,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text  = new JLabel("Book Hotel");
		text.setBounds(110,10, 200, 30);
                text.setFont(new Font("Tohamo",Font.BOLD,25));
		add(text);
                
        
                JLabel lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(40,70, 100, 20);
                lblAvailability.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblAvailability);
                
                labelusername = new JLabel();
	         labelusername.setBounds(250,70, 100, 20);
                 labelusername.setFont(new Font("Tohamo",Font.PLAIN,16));
                 add(labelusername);
		
		JLabel lblCleanStatus = new JLabel("Select Hotel");
		lblCleanStatus.setBounds(40,110, 200, 20);
                lblCleanStatus.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblCleanStatus);
                
               chotel = new Choice();
               chotel.setBounds(250,110,200,20);
               add(chotel);
               
               try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("select * from bookhotel");
                   while(rs.next()){
                       chotel.add(rs.getString("name"));
                   }
               }catch(Exception e){
                   e.printStackTrace();
               }
                
                 JLabel lblnumber = new JLabel("Total Persons");
		lblnumber.setBounds(40,150, 100, 25);
                lblnumber.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblnumber);
		
	        tfpersons = new JTextField("");
		tfpersons.setBounds(250, 150, 200, 25);
                tfpersons.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(tfpersons);
		
                  JLabel lbldays = new JLabel("No Of Days");
		lbldays.setBounds(40,190, 100, 25);
                lbldays.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lbldays);
		
	        tfdays = new JTextField("");
		tfdays.setBounds(250, 190, 200, 25);
                tfdays.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(tfdays);
                
                JLabel lblac = new JLabel("AC/Non AC");
		lblac.setBounds(40,230, 100, 25);
                lblac.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblac);
                
                 chac = new Choice();
                 chac.add("AC");
                 chac.add("Non AC");
               chac.setBounds(250,230,200,20);
               add(chac);
               
               JLabel lblfood= new JLabel("Food Included");
		lblfood.setBounds(40,270, 100, 25);
                lblfood.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblfood);
                
                chfood = new Choice();
                 chfood.add("Yes");
                 chfood.add("No");
               chfood.setBounds(250,270,200,20);
               add(chfood);
               

                
		 JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setBounds(40, 310, 100, 25);
                lblNewLabel_1.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblNewLabel_1);
                
                  lblname = new JLabel();
		lblname.setBounds(250,310, 150, 25);
                lblname.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblname);

		
		 JLabel lblgender = new JLabel("Number");
		lblgender.setBounds(40, 350, 100, 25);
                lblgender.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblgender);
                
                 lbgender = new JLabel();
		lbgender.setBounds(250,350, 150, 25);
                lbgender.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lbgender);
                
                
               JLabel  l3 = new JLabel("Phone");
		l3.setBounds(40, 390, 100, 25);
                l3.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(l3);
                
                lblcountry = new JLabel();
		lblcountry.setBounds(250,390, 150, 25);
                lblcountry.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblcountry);
                
               JLabel  l4 = new JLabel("Total Price");
		l4.setBounds(40, 430, 150, 25);
                l4.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(l4);
                
                lbladdress = new JLabel();
		lbladdress.setBounds(250,430, 150, 25);
                lbladdress.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lbladdress);
                
  
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,400 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480,20,600,400);
        add(image);              
              
                try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                lbgender.setText(rs.getString("number"));
                lblname.setText(rs.getString("id"));
                lblcountry.setText(rs.getString("phone")); 
            }
                }catch(Exception e){
            e.printStackTrace();
        }
            checkprize= new JButton("Check Prize");
        checkprize.setBounds(60,490,120,25);
        checkprize.setBackground(Color.black);
        checkprize.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        checkprize.addActionListener(this);
        add(checkprize);
        
         bookpackage = new JButton("Book Hotel");
        bookpackage.setBounds(200,490,120,25);
        bookpackage.setBackground(Color.black);
        bookpackage.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        bookpackage.addActionListener(this);
        add(bookpackage);
        
         back = new JButton("Back");
        back.setBounds(340,490,120,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkprize){
            try{
                Conn c = new Conn();
                ResultSet rs =c.s.executeQuery("select * from bookhotel where name = '"+chotel.getSelectedItem()+"'");
                while(rs.next()){
                    int cost = Integer.parseInt(rs.getString("costperperson"));     
                    int ac = Integer.parseInt(rs.getString("acroom"));
                    int food = Integer.parseInt(rs.getString("food"));
                    
                     int person = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());
                    String acselected = chac.getSelectedItem();
                    String foodselected = chfood.getSelectedItem();
                    
                    if(person * days > 0){
                    int total = 0;
                    total += acselected.equals("AC")? ac : 0;
                    total += foodselected.equals("Yes")? food : 0;
                    total += cost;
                    total += total * person * days ;
                    lbladdress.setText("Rs" + total);
                }else{
                        JOptionPane.showInputDialog(null,"please enter a valid number");
                    }
                   

                }
           
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == bookpackage){
        
            
           try{
                Conn c = new Conn();
                 String username = labelusername.getText();
                 String pack = chotel.getSelectedItem();
                 String person = tfpersons.getText();
                 String days = tfdays.getText();
                 String ac = chac.getSelectedItem();
                 String food = chfood.getSelectedItem();
                 String id= lblname.getText();
                 String number = lbgender.getText();
                 String phone = lblcountry.getText();
                 String prize = lbladdress.getText();
                 
                
                String query = ("insert into hotel values('"+username+"', '"+pack+"', '"+person+"','"+days+"','"+ac+"','"+food+"', '"+id+"', '"+number+"', '"+phone+"', '"+prize+"')");
           
                c.s.executeUpdate(query);
           
                JOptionPane.showMessageDialog(null,"Hotel Booked successfully ");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == back){
            setVisible(false);
        }
        
    }
    public static void main(String[]args){
        new Bookhotel("jonty");
    }
    
}
