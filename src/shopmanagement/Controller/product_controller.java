
package shopmanagement.Controller;



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import shopmanagement.Model.Customer;
import shopmanagement.Model.Product;

public class product_controller {
    
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
    
  public void insert(Product product){
      try
         {
             theQuery("INSERT INTO `product_information`(`Id`, `Product_location`, `Name`, `Vendor`, `Description`, `Qnt_in_stk`, `WholeSale_Price`, `Retail_Price`,`MRSP`)VALUES ('"+product.getId()+"','"+product.getLocation_product()+"','"+product.getName()+"','"+product.getVendor()+"','"+product.getDescription()+"','"+product.getQty_in_stock()+"','"+product.getWholesale_price()+"','"+product.getRetail_price()+"','"+product.getMsrp()+"')"); 
         }
         catch(Exception ex)
         {
             System.out.print(""+ex);
         }
  }

    public void update(Product product) {
       theQuery("UPDATE `product_information` SET `Product_location`='"+product.getLocation_product()+"',`Name`='"+product.getName()+"',`Vendor`='"+product.getVendor()+"',`Description`='"+product.getDescription()+"',`Qnt_in_stk`='"+product.getQty_in_stock()+"',`WholeSale_Price`='"+product.getWholesale_price()+"',`Retail_Price`='"+product.getRetail_price()+"' ,`MRSP`='"+product.getMsrp()+"'WHERE Id="+product.getId());
    }

    public void Delete(Product product) {
       theQuery("DELETE FROM `product_information` WHERE ="+product.getId());
    }

  
}
