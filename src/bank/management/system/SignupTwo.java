package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    SignupTwo(String formno){
        
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APLICATION FORM_PAGE2");
        
        
        
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(240,70,400,30);
        add(additionalDetails);
        
        
        JLabel nreligion=new JLabel("Religion:");
        nreligion.setFont(new Font("Raleway",Font.BOLD,20));
        nreligion.setBounds(100,140,100,30);
        add(nreligion);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(260,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[]={"Genral","SC","ST","OBC"};
        category=new JComboBox(valCategory);
        category.setFont(new Font("Raleway",Font.CENTER_BASELINE,12));
        category.setBounds(260,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel inc=new JLabel("Income:");
        inc.setFont(new Font("Raleway",Font.BOLD,20));
        inc.setBounds(100,240,200,30);
        add(inc);
        
        String incomeCategory[]={"NULL","<150000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income=new JComboBox(incomeCategory);
        income.setFont(new Font("Raleway",Font.CENTER_BASELINE,12));
        income.setBounds(260,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
      
        
        
        JLabel gender=new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
 
        JLabel email=new JLabel("Qualification");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[]={"Non Graduation","Graduate","BTech","Post Graduation","Doctrate"};
        education=new JComboBox(educationValues);
        education.setBounds(260,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
       
        
    
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationValues[]={"Salaried","Self Employee","Businessmen","Student","Others"};
        occupation=new JComboBox(occupationValues);
        occupation.setBounds(260,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
       
       
        JLabel address=new JLabel("Pan No:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.ITALIC,13));
        pan.setBounds(260,440,400,30);
        add(pan);
        
        
        JLabel city=new JLabel("Aadhar NO:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.ITALIC,12));
        aadhar.setBounds(260,490,400,30);
        add(aadhar);
        
        
        JLabel seniorCitizen=new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorCitizen.setBounds(100,540,200,30);
        add(seniorCitizen);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(260,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        
        sno=new JRadioButton("No");
        sno.setBounds(410,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        
        JLabel existingAcc=new JLabel("Existing Account:");
        existingAcc.setFont(new Font("Raleway",Font.BOLD,20));
        existingAcc.setBounds(100,590,200,30);
        add(existingAcc);
        
        eyes=new JRadioButton("YES");
        eyes.setBounds(260,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        
        eno=new JRadioButton("No");
        eno.setBounds(410,590,400,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountgroup=new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);
        
        
        next= new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(580,630,80,25);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(750,710);
        setLocation(300,3);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="YES";
        }else if(sno.isSelected()){
            seniorcitizen="NO";
        }
       
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="YES";
        }else if(eno.isSelected()){
            existingaccount="No";
        }
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        try{
             Conn c=new Conn();
             String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
             c.s.executeUpdate(query);     
             
             //Signup3 object
             setVisible(false);
             new SignupThree(formno).setVisible(true);
             
             
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}

