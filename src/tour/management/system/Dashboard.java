
package tour.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton details,updatedetails,viewdetails,bookhotel,viewhotels,deletedetails,checkpakages,about,calculator,payment,viewpakages,bookpakages,destination,viewbookhotel,notepad;
    String username;
    Dashboard(String username){
        this.username=username;
        //setBounds(0,0,2400,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setBackground(Color.white);
        
         JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,1600,65);
        p1.setLayout(null);
        
        add(p1);
         
       /* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons"));
        Image i2 = i1.getImage().getScaledInstance(200,200 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(0,0,15,90);
        p1.add(icon);
        */
         JLabel heading = new JLabel("Dashboard");
          heading.setBounds(80,10,300,40);
          heading.setFont(new Font("Tohamo",Font.BOLD,30));
              p1.add(heading);
              
               JPanel p2 = new JPanel();
        p2.setBackground(new Color(131,193,233));
        p2.setBounds(0,65,360,900);
        p2.setLayout(null);
        add(p2);
        
         details = new JButton("Add Personal Details");
             details .setBounds(0,0,300,50);
              details.setBackground(new Color(131,193,233));
              details.setForeground(Color.black);
              details.setFont(new Font("Tohoma",Font.PLAIN,14));
              details.setMargin(new Insets(0,0,0,60));
              details.addActionListener(this);
              p2.add(details);
              
                 updatedetails = new JButton("Update Personal Details");
             updatedetails .setBounds(0,50,300,50);
              updatedetails.setBackground(new Color(131,193,233));
              updatedetails.setForeground(Color.black);
              updatedetails.setFont(new Font("Tohoma",Font.PLAIN,14));
              updatedetails.setMargin(new Insets(0,0,0,50));
             updatedetails.addActionListener(this);
              p2.add(updatedetails);
              
                 viewdetails = new JButton("View Personal Details");
             viewdetails .setBounds(0,100,300,50);
              viewdetails.setBackground(new Color(131,193,233));
              viewdetails.setForeground(Color.black);
              viewdetails.setFont(new Font("Tohoma",Font.PLAIN,14));
              viewdetails.setMargin(new Insets(0,0,0,60));
             viewdetails.addActionListener(this);
              p2.add(viewdetails);
              
                 deletedetails = new JButton("Delete Personal Details");
             deletedetails .setBounds(0,150,300,50);
              deletedetails.setBackground(new Color(131,193,233));
              deletedetails.setForeground(Color.black);
              deletedetails.setFont(new Font("Tohoma",Font.PLAIN,14));
              deletedetails.setMargin(new Insets(0,0,0,60));
              deletedetails.addActionListener(this);
              p2.add(deletedetails);
              
                 checkpakages = new JButton("Check Package");
               checkpakages.setBounds(0,200,300,50);
              checkpakages.setBackground(new Color(131,193,233));
              checkpakages.setForeground(Color.black);
              checkpakages.setFont(new Font("Tohoma",Font.PLAIN,14));
              checkpakages.setMargin(new Insets(0,0,0,110));
             checkpakages.addActionListener(this);
              p2.add(checkpakages);
              
               bookpakages = new JButton("Book Package");
               bookpakages.setBounds(0,250,300,50);
              bookpakages.setBackground(new Color(131,193,233));
              bookpakages.setForeground(Color.black);
              bookpakages.setFont(new Font("Tohoma",Font.PLAIN,14));
              bookpakages.setMargin(new Insets(0,0,0,110));
              bookpakages.addActionListener(this);
              p2.add(bookpakages);
              
              viewpakages = new JButton("View Package");
               viewpakages.setBounds(0,300,300,50);
              viewpakages.setBackground(new Color(131,193,233));
              viewpakages.setForeground(Color.black);
              viewpakages.setFont(new Font("Tohoma",Font.PLAIN,14));
              viewpakages.setMargin(new Insets(0,0,0,110));
             viewpakages.addActionListener(this);
              p2.add(viewpakages);
              
               viewhotels = new JButton("View Hotels");
               viewhotels.setBounds(0,350,300,50);
              viewhotels.setBackground(new Color(131,193,233));
              viewhotels.setForeground(Color.black);
              viewhotels.setFont(new Font("Tohoma",Font.PLAIN,14));
              viewhotels.setMargin(new Insets(0,0,0,120));
             viewhotels.addActionListener(this);
              p2.add(viewhotels);
              
              bookhotel = new JButton("Book Hotel");
               bookhotel.setBounds(0,400,300,50);
              bookhotel.setBackground(new Color(131,193,233));
              bookhotel.setForeground(Color.black);
              bookhotel.setFont(new Font("Tohoma",Font.PLAIN,14));
              bookhotel.setMargin(new Insets(0,0,0,140));
             bookhotel.addActionListener(this);
              p2.add(bookhotel);
              
               viewbookhotel = new JButton("View Booked Hotel");
               viewbookhotel.setBounds(0,450,300,50);
              viewbookhotel.setBackground(new Color(131,193,233));
              viewbookhotel.setForeground(Color.black);
              viewbookhotel.setFont(new Font("Tohoma",Font.PLAIN,14));
              viewbookhotel.setMargin(new Insets(0,0,0,100));
             viewbookhotel.addActionListener(this);
              p2.add(viewbookhotel);
              
              
               destination = new JButton("Destination");
               destination.setBounds(0,500,300,50);
              destination.setBackground(new Color(131,193,233));
              destination.setForeground(Color.black);
              destination.setFont(new Font("Tohoma",Font.PLAIN,14));
              destination.setMargin(new Insets(0,0,0,150));
             destination.addActionListener(this);
              p2.add(destination);
              
                payment = new JButton("payments");
               payment.setBounds(0,550,300,50);
              payment.setBackground(new Color(131,193,233));
              payment.setForeground(Color.black);
              payment.setFont(new Font("Tohoma",Font.PLAIN,14));
              payment.setMargin(new Insets(0,0,0,165));
              payment.addActionListener(this);
              p2.add(payment);
              
                calculator = new JButton("Calculator");
               calculator.setBounds(0,600,300,50);
              calculator.setBackground(new Color(131,193,233));
              calculator.setForeground(Color.black);
              calculator.setFont(new Font("Tohoma",Font.PLAIN,14));
              calculator.setMargin(new Insets(0,0,0,165));
             calculator.addActionListener(this);
              p2.add(calculator);
              
               notepad = new JButton("Notepad");
               notepad.setBounds(0,650,300,50);
              notepad.setBackground(new Color(131,193,233));
              notepad.setForeground(Color.black);
              notepad.setFont(new Font("Tohoma",Font.PLAIN,14));
              notepad.setMargin(new Insets(0,0,0,165));
             notepad.addActionListener(this);
              p2.add(notepad);
              
               about = new JButton("About");
               about.setBounds(0,700,300,50);
              about.setBackground(new Color(131,193,233));
              about.setForeground(Color.black);
              about.setFont(new Font("Tohoma",Font.PLAIN,14));
              about.setMargin(new Insets(0,0,0,185));
             about.addActionListener(this);
              p2.add(about);
              
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1650,1000 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(0,0,1650,1000);
        add(icon);
        
        JLabel text = new JLabel("Tour Management System");
              text.setBounds(400,70,1000,70);
              text.setFont(new Font("Tohamo",Font.BOLD,50));
              icon.add(text);
              
              
              
              
        
               
        
        setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==details){
            new Addcustomer(username);
            
        }else if(ae.getSource()==viewdetails){
        new Viewcustomer(username);
    }else if(ae.getSource()==updatedetails){
        new Updatecustomer(username);   
    }else if(ae.getSource()==checkpakages){
        new Viewpackages();
    }else if(ae.getSource()== bookpakages){
        new BookPackage(username);
    }else if(ae.getSource()== viewpakages){
        new Viewbookpackage(username);
    }else if(ae.getSource() == about){
        new About();
    }else if(ae.getSource()==viewhotels){
        new Checkhotels();
    }else if(ae.getSource() == destination){
        new Destination();
    }else if(ae.getSource() == bookhotel){
        new Bookhotel(username);
    }else if(ae.getSource()== viewbookhotel){
        new Viewbookedhotel(username);
    }else if(ae.getSource()== payment){
        new Payment();
    }else if(ae.getSource()==deletedetails){
        new Deletedetails(username);
    }else if(ae.getSource()==calculator){
        try{
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }else if(ae.getSource()==notepad){
        try{
            Runtime.getRuntime().exec("notepad.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
    public static void main(String[]args){
        new Dashboard("jonty");
    }

    }
    

