/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagement;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import shopmanagement.View.Layout;
/**
 *
 * @author HP
 */
class Main extends JFrame{
    public Container c;
 public Font f;
 public JLabel office;
 public JPasswordField pfof;
 public JButton login1,cancel1;
 public String s1;
 public String s2="1234";
 
 public JLabel vname,lname,mname,hname,hname2,pic;
   public Font m1;
    JPanel panel,panel2;
 


    Main()
    {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MATHEX.png")));
        initComponents();
        
    }
    public void initComponents()
    {
        
        c=this.getContentPane();
        c.setLayout(null);
         f=new Font("Arial",Font.ITALIC,24);
          m1=new Font("Arial",Font.ITALIC,12);
          pic=new JLabel();
         pic.setBounds(0,350,800,200);
         
         JLabel pic2=new JLabel();
         pic2.setBounds(0,0,800,100);
         
           ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("MATHEX.png")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(pic.getWidth(), pic.
                getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        pic.setIcon(i);
         c.add(pic);
         
         
//        Image img22=img1.getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon ii=new ImageIcon(img22);
//        pic2.setIcon(ii);
//         c.add(pic2);
         
         
         panel=new JPanel();
         panel.setBounds(250,100,300,40);
         panel.setBackground(new java.awt.Color(0, 102, 102));
         add(panel);
         
         hname=new JLabel();
         hname.setText("WELCOME TO");
         hname.setForeground(java.awt.Color.WHITE);
         hname.setFont(new Font("Arial",Font.BOLD, 24));
         hname.setBounds(250,100,300,40);
        
       panel.add(hname);
       
       panel2=new JPanel();
         panel2.setBounds(120,150,580,40);
         panel2.setBackground(new java.awt.Color(0, 102, 102));
         add(panel2);
         
         hname2=new JLabel();
         hname2.setText("Shop Management System");
         hname2.setForeground(java.awt.Color.WHITE);
         hname2.setFont(new Font("Arial",Font.ITALIC, 24));
         hname2.setBounds(250,100,300,40);
        
       panel2.add(hname2);
         
        office=new JLabel();
          f=new Font("Arial",Font.BOLD,24);
        office.setText("Vendor login");
        office.setFont(f);
        c.setLayout(null);
        office.setBounds(340, 230, 200, 40);
         c.add(office);
         
         pfof=new JPasswordField();
         pfof.setFont(f);
         pfof.setBounds(200,290,200,40);
         pfof.setEchoChar('*');
         c.add(pfof);
        
         
         login1=new JButton();
         login1.setText("Log in");
         login1.setBounds(420,290,80,40);
         login1.setFont(new Font("Arial",Font.BOLD,14));
         login1.setBackground(new java.awt.Color(0, 102, 102));
         login1.setForeground(java.awt.Color.WHITE);
         c.add(login1);
         
         login1.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e)
              {
                   s1=pfof.getText();
                  if(!(s2 == null ? s1 != null : !s2.equals(s1)))
                  {
                    
                  
                   Layout frame=new Layout();
        frame.setBounds(100,100,1100, 600);
        
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        

                  }  
                  else
                        JOptionPane.showMessageDialog(null, "Please!Re Enter your password");
              }
         });
         
         cancel1=new JButton();
         cancel1.setText("Clear");
         cancel1.setBounds(520,290,90,40);
         cancel1.setFont(new Font("Arial",Font.BOLD,14));
         cancel1.setBackground(new java.awt.Color(0, 102, 102));
         cancel1.setForeground(java.awt.Color.WHITE);
         c.add(cancel1);
         
          cancel1.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e)
              {
                 pfof.setText(null);
              }
         }); 
    }
    
    public void theQuery(String query){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost/shop_management","root","");
          st = con.createStatement();
          st.executeUpdate(query);
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
    
    public static void main(String[] args) {
       Main frame1=new Main();
       frame1.setBounds(800, 400, 800, 600);
     
       frame1.setLocationRelativeTo(null);
       frame1.setTitle("ShopManagement1 system");
        frame1.setVisible(true);
        frame1.setResizable(false);
         frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    
}
