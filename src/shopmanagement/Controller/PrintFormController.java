/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagement.Controller;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.*;

import shopmanagement.Model.Customer;
import shopmanagement.Model.OrderedCustomer;
import shopmanagement.Model.OrdersProducts;
import shopmanagement.Model.Product;
import shopmanagement.View.Layout;


public class PrintFormController extends JFrame{
    
   JButton jbt_print;
     public Container c;
 
   Layout layout;
   
  OrdersProducts order;

  Customer customer;
  
  Product productInfo;
  OrderedCustomer oc;
    
  public  PrintFormController(OrdersProducts order,OrderedCustomer oc,Product product)
    {
        
            this.order = order;
            this.oc =  oc;
            this.productInfo=product;
        
            initComponents()    ;

    }

    

   
  
  public void initComponents()
  {
      c=this.getContentPane();
      c.setLayout(null);
      JTextArea area=new JTextArea();
       
       area.setBounds(0,0,660,550);
      //area.setBackground(new java.awt.Color(150, 196, 240));
        c.add(area);
        
        
        
       area.setLayout(null);
       area.setVisible(true);
       Date obj =new Date();
       String date =obj.toString();
       area.setFont(new Font("Monospaced",Font.BOLD, 12));
       
      
           area.setText("*******************************************************\n");
       
       area.setText(area.getText()+"**************Invoice Generator************************\n\n");
    
     area.setText(area.getText()+"           Date: "+date+"\n\n");
    area.setText(area.getText()+"           Invoice id:            "+order.getInvoice_id()+"\n");
    area.setText(area.getText()+"           Product id:            "+order.getProduct_id()+"\n");
     area.setText(area.getText()+"           Product Name:          "+productInfo.getName()+"\n");
    area.setText(area.getText()+"           Order id:              "+order.getId()+"\n");
    area.setText(area.getText()+"           Quantity:              "+order.getQuantity()+"\n");
    area.setText(area.getText()+"           Price each:            "+order.getPrice_each()+"\n");
    area.setText(area.getText()+"           Discount:              "+order.getDiscount()+"\n");
    area.setText(area.getText()+"*******************************************************\n");
    area.setText(area.getText()+"           Total Price:           "+order.getTotal_price()+"\n\n\n");
    area.setText(area.getText()+"           Customer's Information\n");
     area.setText(area.getText()+"*******************************************************\n");
    area.setText(area.getText()+"           Id:                    "+oc.getId1()+"\n");
   area.setText(area.getText()+"           Personal Id:           "+oc.getPersonal_id1()+"\n");     
    area.setText(area.getText()+"           First Name:            "+oc.getFirst_name1()+" \n");
   area.setText(area.getText()+"           Last Name:             "+oc.getLast_name1()+"\n");
   area.setText(area.getText()+"           Phone No:              "+oc.getPhone1()+"\n");
   area.setText(area.getText()+"           Billing Address:       "+oc.getBilling_adress1()+"\n");
   area.setText(area.getText()+"           Shipping Address:      "+oc.getShipping_adress1()+"\n\n");
   area.setText(area.getText()+"           Thank You  \n");
        
         
       
        
           
         
         jbt_print=new JButton();
         jbt_print.setText("Print");
         jbt_print.setBounds(560, 580,70,20);
         jbt_print.setFont(new Font("Arial",Font.BOLD,16));
        jbt_print.setForeground(new java.awt.Color(0, 102, 102));
         add(jbt_print);
         
         jbt_print.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
                 PrinterJob job=PrinterJob.getPrinterJob();
job.setJobName("Print Data");
job.setPrintable(new Printable(){
    public int print(Graphics gp,PageFormat pf,int pageno)
    {
        if(pageno>0)
        {
            return Printable.NO_SUCH_PAGE;
        }
        Graphics2D g2=(Graphics2D)gp;
        g2.translate(pf.getImageableX(), pf.getImageableY());
        g2.scale(0.3, 0.3);
      area.paint(g2);
        return Printable.PAGE_EXISTS;
        
    }
            
        
    
    
});
boolean ok=job.printDialog();
if(ok)
{
    try
    {
        job.print();
    }
    catch( Exception ex)
    {
        
    }
}
             }
         });
         
         
       
  }
 
    
   

      
    

   
    
}


