/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagement.Controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import shopmanagement.Model.Customer;

/**
 *
 * @author HP
 */
public class register_controller {
    
   
   
     public void theQuery(String query){
      
      try{
       
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop_management","root","");
          Statement st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"Query Executed");
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex);
      }
  }
    
  public void insert(Customer customer){
      try
         {
             theQuery("INSERT INTO `registration_table`(`Id`, `personal id`, `First_Name`, `Last_Name`, `Phone`, `Credit_llimit`, `Billing_Address`, `Shipping_Address`)VALUES ('"+customer.getId()+"','"+customer.getPersonal_id()+"','"+customer.getFirst_name()+"','"+customer.getLast_name()+"','"+customer.getPhone()+"','"+customer.getCredit_limit()+"','"+customer.getBilling_adress()+"','"+customer.getShipping_adress()+"')"); 
         }
         catch(Exception ex)
         {
             System.out.print(""+ex);
         }
  } 
  
   public void update(Customer customer){
      try
         {//theQuery("UPDATE others SET Dept='"+box1.getSelectedItem()+"',Fees= '"+feebox.getSelectedItem()+"',Semister='"+semibox.getSelectedItem()+"',Receipt_No='"+JT_Receipt.getText()+"' WHERE Roll = "+JT_roll.getText());
             theQuery("UPDATE `registration_table` SET `personal id`='"+customer.getPersonal_id()+"',`First_Name`='"+customer.getFirst_name()+"',`Last_Name`='"+customer.getLast_name()+"',`Phone`='"+customer.getPhone()+"',`Credit_llimit`='"+customer.getCredit_limit()+"',`Billing_Address`='"+customer.getBilling_adress()+"',`Shipping_Address`='"+customer.getShipping_adress()+"' WHERE Id="+customer.getId());
         }
         catch(Exception ex)
         {
             System.out.print(""+ex);
         }
  } 

    public void delete(Customer customer) {
       theQuery("DELETE FROM `registration_table` WHERE Id="+customer.getId());
    }
  
}
