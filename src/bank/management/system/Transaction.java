
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {
    
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquery,exit;
    String pinnumber;
    
    Transaction(String pinnumber){
        
        this.pinnumber=pinnumber;
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);
        
        JLabel text=new JLabel("Please Select Your Transactions");
        text.setBounds(210,230,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);
        
        
        deposit=new JButton("Deposit");
        deposit.setBounds(170,325,150,23);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,325,150,23);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,350,150,23);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        
        ministatement=new JButton("mini Statement");
        ministatement.setBounds(355,350,150,23);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,375,150,23);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquery=new JButton("Balance Enquery");
        balanceenquery.setBounds(355,375,150,23);
        balanceenquery.addActionListener(this);
        image.add(balanceenquery);
        
        exit=new JButton("Exit");
        exit.setBounds(355,405,150,23);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(900,700);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()== withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquery){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        
        
    }
    
    public static void main(String args[]){
        new Transaction("");
    }
}
