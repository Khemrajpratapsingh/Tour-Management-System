
package tour.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create,back;
    JTextField tfusername,tfname,tfpassword,tfanswer;
    Choice chsecurity;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,500,400);
        p1.setBackground(new Color(133,193,233));
        p1.setLayout(null);
        add(p1);
        
        JLabel lbusername = new JLabel("username");
        lbusername.setFont(new Font("Tahoaa",Font.BOLD,14));
        lbusername.setBounds(50,20,125,25);
        p1.add(lbusername);
        
        tfusername= new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
         JLabel name = new JLabel("name");
         name.setFont(new Font("Tahoaa",Font.BOLD,14));
         name.setBounds(50,60,125,25);
         p1.add(name);
        
         tfname= new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
         JLabel password = new JLabel("password");
         password.setFont(new Font("Tahoaa",Font.BOLD,14));
         password.setBounds(50,100,125,25);
         p1.add(password);
        
        
        tfpassword= new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

         JLabel security = new JLabel("security question");
         security.setFont(new Font("Tahoaa",Font.BOLD,14));
         security.setBounds(50,140,125,25);
         p1.add(security);
         
         chsecurity = new Choice();
         chsecurity.add("favourite caharacter from the boys");
         chsecurity.add("favrouite marvel superheroes");
         chsecurity.add("your lucky number");
         chsecurity.add("your pet name");
         chsecurity.setBounds(190,140,180,25);
         p1.add(chsecurity);
         
         
        JLabel lbanswer = new JLabel("answer");
        lbanswer.setFont(new Font("Tahoaa",Font.BOLD,14));
        lbanswer.setBounds(50,180,125,25);
        p1.add(lbanswer);
        
        tfanswer= new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        create = new JButton("create");
        create.setBounds(80,240,100,30);
        create.setBackground( Color.white);
        create.setForeground(new Color(133,193,233));
        //create.setBorder(new LineBorder(new Color(133,193,233)));
        create.setFont(new Font("Tahoaa",Font.BOLD,14));
        create.addActionListener(this);
        p1.add(create);
        
        
        back = new JButton("back");
        back.setBounds(250,240,100,30);
        back.setBackground( Color.white);
        back.setForeground(new Color(133,193,233));
       // back.setBorder(new LineBorder(new Color(133,193,233)));
        back.setFont(new Font("Tahoaa",Font.BOLD,14));
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);
       
        
         
       

        
        setVisible(true);
        
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = chsecurity.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account created successfully");
                setVisible(false);
                new Login();
                
            } catch(Exception e){
                e.printStackTrace();
            }
            
            
                    
            
            
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
            
        }
        
    }
    public static void main (String[]args){
        new Signup();
    }
    
}
