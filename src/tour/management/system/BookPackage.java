
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener {
    
    Choice cpackage;
    JTextField tfpersons;
    JLabel labelusername,lbgender,lblname,lblcountry,lbladdress;
    JButton back,bookpackage,checkprize;
    String username;
  
    BookPackage(String username){
        this.username = username;
        setBounds(450,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text  = new JLabel("Book Package");
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
		
		JLabel lblCleanStatus = new JLabel("Select Package");
		lblCleanStatus.setBounds(40,110, 200, 20);
                lblCleanStatus.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblCleanStatus);
                
               cpackage = new Choice();
               cpackage.add("GOLD PACKAGE");
               cpackage.add("SILVER PACKAGE");
               cpackage.add("BRONZE PACKAGE");
               cpackage.setBounds(250,110,200,20);
               add(cpackage);
                
                 JLabel lblnumber = new JLabel("Total Persons");
		lblnumber.setBounds(40,150, 100, 25);
                lblnumber.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblnumber);
		
	        tfpersons = new JTextField("");
		tfpersons.setBounds(250, 150, 200, 25);
                tfpersons.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(tfpersons);
		
		 JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setBounds(40, 190, 100, 25);
                lblNewLabel_1.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblNewLabel_1);
                
                  lblname = new JLabel();
		lblname.setBounds(250,190, 150, 25);
                lblname.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblname);

		
		 JLabel lblgender = new JLabel("Number");
		lblgender.setBounds(40, 230, 100, 25);
                lblgender.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblgender);
                
                 lbgender = new JLabel();
		lbgender.setBounds(250,230, 150, 25);
                lbgender.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lbgender);
                
                
               JLabel  l3 = new JLabel("Phone");
		l3.setBounds(40, 270, 100, 25);
                l3.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(l3);
                
                lblcountry = new JLabel();
		lblcountry.setBounds(250,270, 150, 25);
                lblcountry.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lblcountry);
                
               JLabel  l4 = new JLabel("Total Price");
		l4.setBounds(40, 310, 150, 25);
                l4.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(l4);
                
                lbladdress = new JLabel();
		lbladdress.setBounds(250,310, 150, 25);
                lbladdress.setFont(new Font("Tohamo",Font.PLAIN,16));
		add(lbladdress);
                
  
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550,400 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480,20,550,400);
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
        checkprize.setBounds(60,380,120,25);
        checkprize.setBackground(Color.black);
        checkprize.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        checkprize.addActionListener(this);
        add(checkprize);
        
         bookpackage = new JButton("Book Package");
        bookpackage.setBounds(200,380,120,25);
        bookpackage.setBackground(Color.black);
        bookpackage.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        bookpackage.addActionListener(this);
        add(bookpackage);
        
         back = new JButton("Back");
        back.setBounds(340,380,120,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkprize){
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("Gold Package")){
                cost += 12000;
            }else if(pack.equals("Silver Package")){
                cost += 25000;
            }else{
                cost += 32000;
            }
            
            int persons = Integer.parseInt(tfpersons.getText());
            cost *= persons;
            lbladdress.setText("Rs" +cost);
        }else if(ae.getSource() == bookpackage){
        
            
           try{
                Conn c = new Conn();
                 String username = labelusername.getText();
                 String pack = cpackage.getSelectedItem();
                 String person = tfpersons.getText();
                 String id= lblname.getText();
                 String number = lbgender.getText();
                 String phone = lblcountry.getText();
                 String prize = lbladdress.getText();
                 
                 
                String query = ("insert into bookpackage values('"+username+"', '"+pack+"', '"+person+"', '"+id+"', '"+number+"', '"+phone+"', '"+prize+"')");
           
                c.s.executeUpdate(query);
           
                JOptionPane.showMessageDialog(null,"book packages successfully ");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[]args){
        new BookPackage("jonty");
    }
    
}
