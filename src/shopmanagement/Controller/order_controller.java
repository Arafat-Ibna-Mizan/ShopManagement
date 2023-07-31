/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagement.Controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import shopmanagement.Model.OrdersProducts;
import shopmanagement.Model.Product;

/**
 *
 * @author HP
 */
public class order_controller {
    
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
     
     public void insert(OrdersProducts order){
      try
         {
             theQuery("INSERT INTO `ordered_products`(`Invoice_id`, `Product_id`, `Order_id`, `Quantity`, `Price_each`, `Discount`, `Total_Price`,`Customer_Id`)VALUES ('"+order.getInvoice_id()+"','"+order.getProduct_id()+"','"+order.getId()+"','"+order.getQuantity()+"','"+order.getPrice_each()+"','"+order.getDiscount()+"','"+order.getTotal_price()+"','"+order.getCustomer_id()+"')"); 
         }
         catch(Exception ex)
         {
             System.out.print(""+ex);
         }
  }
}
