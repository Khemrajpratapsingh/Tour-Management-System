
package tour.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,password;
    JTextField tfusername,tfpassword;
    
    Login(){
        setLocation(350,200);
        setSize(900,400);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        
        add(p1);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
       
         
        JPanel p2 = new JPanel();
        p2.setBounds(400,30,450,350);
        p2.setLayout(null);
        add(p2); 
        
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
         JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SEN_SERIF" , Font.PLAIN,20));
        p2.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        login.addActionListener(this);
        p2.add(login);
        
         
        signup = new JButton("SIGNUP");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        signup.addActionListener(this);
        p2.add(signup);
        
         
        password = new JButton("forgot password");
        password.setBounds(135,250,130,30);
        password.setBackground(new Color(133,193,233));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(133,193,233)));
        password.addActionListener(this);
        p2.add(password);
        
        JLabel text = new JLabel("Trouble in login. . . ");
        text.setBounds(280,250,130,30);
        p2.add(text );
        
        
        
        setVisible(true);
         
        
    }
    
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == login){ 
               String username = tfusername.getText();
               String pass = tfpassword.getText();
                try{
                    String query = "select * from account where username = '"+username+"' AND password ='"+pass+"'" ;

                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                setVisible(false);
                new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");
                }
                }catch (Exception e){
                    e.printStackTrace();
                }
                
                
                
            }else if(ae.getSource() == password){
                setVisible(false);
                new Forgotpassword();
                
            }else if(ae.getSource() == signup){
                setVisible(false);
                new Signup();
            }

        
    }
    public static void main(String[]args){
        new Login();
        
    }
    
}
