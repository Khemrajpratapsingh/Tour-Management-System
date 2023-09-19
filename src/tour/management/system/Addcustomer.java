
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Addcustomer extends JFrame implements ActionListener{
    
    JLabel lbusername , lbiid , lbnumber ,lblname , lbname , gender , country , address,email,phone,lblusername;
    JTextField tfnumber , tfcountry,tfaddress,tfemail,tfphone;
    JComboBox comboid;
    JRadioButton rmale,rfemale;
    JButton back,add;
 
    Addcustomer(String username){
        
        setBounds(450,200,850,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        lbusername = new JLabel("username");
        lbusername.setBounds(30,50,150,25);
        add(lbusername);
        
        lblusername = new JLabel();
        lblusername.setBounds(220,50,150,25);
        add(lblusername);
        
        lbiid = new JLabel("id");
        lbiid.setBounds(30,90,150,25);
        add(lbiid);
        
        comboid = new JComboBox(new String[] {"passport","Aadhar card","pan card","Ration card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);
        
         lbnumber = new JLabel("number");
        lbnumber.setBounds(30,130,150,25);
        //lbnumber.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(lbnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        //tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfnumber);
        
         lbname = new JLabel("name");
        lbname.setBounds(30,170,150,25);
        //lbname.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(lbname);
        
         lblname = new JLabel();
        lblname.setBounds(220,170,150,25);
       // lblname.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(lblname);
        
         gender = new JLabel("Gender");
         gender.setBounds(30,210,150,25);
       // gender.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(gender);
        
        rmale = new JRadioButton("male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        add(rmale);
        
        rfemale = new JRadioButton("female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.white);
        add(rfemale);
        
        ButtonGroup bg =new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
         country = new JLabel("country");
         country.setBounds(30,250,150,25);
       // gender.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(country);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        //tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfcountry);
        
        
         address = new JLabel("address");
         address.setBounds(30,290,150,25);
       // gender.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(address);
        
        tfaddress= new JTextField();
        tfaddress.setBounds(220,290,150,25);
        //tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfaddress);
        
         phone = new JLabel("phone");
         phone.setBounds(30,330,150,25);
       // gender.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(phone);
        
        tfphone= new JTextField();
        tfphone.setBounds(220,330,150,25);
        //tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfphone);
        
         email = new JLabel("Email");
         email.setBounds(30,370,150,25);
       // gender.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        add(email);
        
        tfemail= new JTextField();
        tfemail.setBounds(220,370,150,25);
        //tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfemail);
        
        add = new JButton("ADD");
        add.setBounds(70,430,100,25);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        //add.setBorder(new LineBorder(new Color(133,193,233)));
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        add(back);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,500 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,40,450,420);
        add(image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = 'jonty'");
            while(rs.next()){
                lblusername.setText(rs.getString("username"));
                lblname.setText(rs.getString("name"));
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
       
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username = lblusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = lblname.getText();
            String gender = null;
            if(rmale.isSelected()){
                gender = "Male";
            }else{
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                 c.s.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null,"customer detailed added sucessfully");
                 setVisible(false);
 
                
            }catch(Exception e){
                e.printStackTrace();
            }
           
            
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String[]args){
        new Addcustomer("");
    }
    
}
