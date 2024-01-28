
package tour.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Paytm extends JFrame implements ActionListener{
    JButton back;
    Paytm(){
        setBounds(500,200,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        try{
            pane.setPage("https://paytm.com/rent-payment");
        }catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>could not load, Error 404</html>");
            
        }
        
        JScrollPane sp =new JScrollPane(pane);
        getContentPane().add(sp);
        
         back = new JButton("Back");
        back.setBounds(10,20,100,40);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        //back.setBorder(new LineBorder(new Color(133,193,233)));
        back.addActionListener(this);
        pane.add(back);
        setVisible(true);
        
    }
    public void  actionPerformed(ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
            new Payment();
        }
    }
    public static void main(String[]args){
        new Paytm();
    }
    
}
