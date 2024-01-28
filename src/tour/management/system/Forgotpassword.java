 
package tour.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Forgotpassword extends JFrame implements ActionListener{
    
    
    JTextField tfusername,tfname,tfquestion,tfanswer,tfpassword;
    JButton search,retrieve,back;
   
    Forgotpassword(){
              setBounds(350,200,850,380);
              getContentPane().setBackground(Color.WHITE);
              setLayout(null);
              
              ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
              Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
              ImageIcon i3 = new ImageIcon(i2);
              JLabel image = new JLabel(i3);
              image.setBounds(580,70,200,200);
              add(image);
              
              
              JPanel p1 = new JPanel();
              p1.setLayout(null);
              p1.setBounds(30,30,500,280);
              add(p1);
              
              JLabel lbusername = new JLabel("username");
              lbusername.setBounds(40,20,100,25);
              lbusername.setFont(new Font("Tohamo",Font.BOLD,14));
              p1.add(lbusername);
              
              tfusername = new JTextField();
              tfusername.setBounds(220,20,100,25);
              tfusername.setBorder(BorderFactory.createEmptyBorder());
              p1.add(tfusername);
              
            search = new JButton("search");
            search.setBounds(380,20,100,25);
            search.setBackground( Color.white);
            search.setForeground(new Color(133,193,233));
        //create.setBorder(new LineBorder(new Color(133,193,233)));
            search.setFont(new Font("Tahoaa",Font.BOLD,14));
           search.addActionListener(this);
            p1.add(search);
            
              JLabel lbname = new JLabel("name");
              lbname.setBounds(40,60,100,25);
              lbname.setFont(new Font("Tohamo",Font.BOLD,14));
              p1.add(lbname);
              
              tfname = new JTextField();
              tfname.setBounds(220,60,100,25);
              tfname.setBorder(BorderFactory.createEmptyBorder());
              p1.add(tfname);
              
               JLabel lbsecurity = new JLabel("security question");
              lbsecurity.setBounds(40,100,100,25);
              lbsecurity.setFont(new Font("Tohamo",Font.BOLD,14));
              p1.add(lbsecurity);
              
              tfquestion = new JTextField();
              tfquestion.setBounds(220,100,150,25);
              tfquestion.setBorder(BorderFactory.createEmptyBorder());
              p1.add(tfquestion);
              
               JLabel lbanswer = new JLabel("answer");
              lbanswer.setBounds(40,140,100,25);
              lbanswer.setFont(new Font("Tohamo",Font.BOLD,14));
              p1.add(lbanswer);
              
               tfanswer = new JTextField();
              tfanswer.setBounds(220,140,100,25);
              tfanswer.setBorder(BorderFactory.createEmptyBorder());
              p1.add(tfanswer);
              
              retrieve = new JButton("retrive");
              retrieve.setBounds(380,140,100,25);
              retrieve.setBackground(Color.white);
              retrieve.setForeground(new Color(133,193,233));
              retrieve.setFont(new Font("Tohoma",Font.BOLD,14));
              retrieve.addActionListener(this);
              p1.add(retrieve);
              
               JLabel lbpassword = new JLabel("new password");
              lbpassword.setBounds(40,180,100,25);
              lbpassword.setFont(new Font("Tohamo",Font.BOLD,14));
              p1.add(lbpassword);
              
               tfpassword = new JTextField();
              tfpassword.setBounds(220,180,100,25);
              tfpassword.setBorder(BorderFactory.createEmptyBorder());
              p1.add(tfpassword);
              
              back = new JButton("Back");
              back.setBounds(140,220,100,25);
              back.setBackground(Color.white);
              back.setForeground(new Color(133,193,233));
              back.setFont(new Font("Tohoma",Font.BOLD,14));
              back.addActionListener(this);
              p1.add(back);
              
              setVisible(true);
              
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){

            try{
            String query = "select * from account where username = '"+tfusername.getText() +"'";
            
                Conn c = new Conn();
                ResultSet ra = c.s.executeQuery(query);
                while(ra.next()){
                    tfname.setText(ra.getString("name"));
                    tfquestion.setText(ra.getString("security"));
                }
               
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else if(ae.getSource() == retrieve){
            try{
                String query = "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'";
                Conn c =  new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfpassword.setText(rs.getString("password"));
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if (ae.getSource() == back){
           setVisible(false);
           new Login();
        }
    }
    
    
    public static void main(String[]args){
        new Forgotpassword();
    }
    
}
