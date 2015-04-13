package atm;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class ATM extends JFrame{

   public JPasswordField password;
   public JPanel panel;
   
   public static int correctPin=1234;
   
   public int numOfTrials=3;
   public ATM()   {
       panel=new JPanel();
       GridLayout grid=new GridLayout(4,3);
       panel.setLayout(grid);
       JButton button1=new JButton("1");  
       JButton button2=new JButton("2");  
       JButton button3=new JButton("3");  
       JButton button4=new JButton("4");  
       JButton button5=new JButton("5");  
       JButton button6=new JButton("6");  
       JButton button7=new JButton("7");  
       JButton button8=new JButton("8");  
       JButton button9=new JButton("9");
       JButton button0=new JButton("0");  
       JButton buttonEnter=new JButton("Enter");
       JButton buttonClear=new JButton("Clear");
       
       panel.add(button1);
       panel.add(button2);
       panel.add(button3);
       panel.add(button4);
       panel.add(button5);
       panel.add(button6);
       panel.add(button7);
       panel.add(button8);
       panel.add(button9);
       panel.add(buttonClear);
       panel.add(button0);
       panel.add(buttonEnter);
      
       //Add buttonPanel to the bottom(or south)of JFrame using BorderLayout
       BorderLayout border=new BorderLayout();
        setLayout(border);
       add(panel,BorderLayout.SOUTH);
       //set frame title to ATM PIN AUTHENTICATION
       setTitle("ATM PIN AUTHENTICATION");
       //Add an instance of JPasswordField to the north of JFrame.
       password=new JPasswordField(20);
      add(password,BorderLayout.NORTH);
        ActionListener buttonActionListener = new ButtonAction();
       button1.addActionListener(buttonActionListener);
       button2.addActionListener(buttonActionListener);
       button3.addActionListener(buttonActionListener);
       button4.addActionListener(buttonActionListener);
       button5.addActionListener(buttonActionListener);
       button6.addActionListener(buttonActionListener);
       button7.addActionListener(buttonActionListener);
       button8.addActionListener(buttonActionListener);
       button9.addActionListener(buttonActionListener);
       button0.addActionListener(buttonActionListener);
       ActionListener clearActionListener = new ClearAction();
       buttonClear.addActionListener(clearActionListener);
       ActionListener enterActionListener = new EnterAction();
       buttonEnter.addActionListener(enterActionListener);
      
   }
   //Create an inner listener class named buttonAction to register action to each number button.
   private class ButtonAction implements ActionListener {
   public void actionPerformed(ActionEvent e)
   {
       String pwd=new String(password.getPassword());
       if(pwd.length()<4)
           {
               password.setText(pwd+e.getActionCommand());
           }
   }
   }
   //Create an inner listener class named clearAction to register action to clear button.
   private class ClearAction implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
       password.setText("");
   }
   }
   
   private class EnterAction implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
       String pwd=new String(password.getPassword());
       if(!pwd.equals(""))
       {
       int enterdpin=Integer.parseInt(pwd);
       if(correctPin==enterdpin)
           {
               
               JOptionPane.showMessageDialog(null, "Welcome to Bank of America ATM ");
               panel.setVisible(true);
               password.setVisible(true);
               JLabel jl=new JLabel("Welcome to Bank of America ATM");
               add(jl,BorderLayout.NORTH);
           }
       else
           {
               if(numOfTrials>0)
               {
                   
                   JOptionPane.showMessageDialog(null, "Incorrect Pin.You have "+numOfTrials+" trails left");
                   numOfTrials--;
               }
               else
                   {
                      
                       JOptionPane.showMessageDialog(null, " Contact Bank Administartor to reset Pin");
                       panel.setVisible(false);
                   password.setVisible(false);
                   JLabel jl=new JLabel("Please Contact Bank Administartor to reset Pin");
                   add(jl,BorderLayout.NORTH);
                   }
           }
       }
   }
   }
   public static void main(String[] args)
   {
	   
       ATM atm=new ATM();
       
           atm.setSize(800, 600);
           atm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           atm.setVisible(true);  
          
   }
}