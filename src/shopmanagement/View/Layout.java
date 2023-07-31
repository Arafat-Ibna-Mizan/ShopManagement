
package shopmanagement.View;

import shopmanagement.Controller.PrintFormController;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import shopmanagement.Controller.order_controller;
import shopmanagement.Controller.product_controller;
import shopmanagement.Controller.register_controller;
import shopmanagement.Model.Customer;
import shopmanagement.Model.OrderedCustomer;
import shopmanagement.Model.OrdersProducts;
import shopmanagement.Model.Product;

public class Layout extends JFrame{
    Connection con=null;
   Statement st=null;
   ResultSet rs=null;
    
    register_controller  regcontroll  = new register_controller();
    Customer customer = new Customer();
    OrderedCustomer oc=new OrderedCustomer();
    
    Product product =new Product();
   product_controller procontroll =new product_controller();
   
   OrdersProducts order = new OrdersProducts();
   order_controller  ordercontroller = new order_controller();
    
    JPanel reg =new JPanel();
    
    JPanel pro=new JPanel();
    JTable reg_table;
    JTabbedPane tabbedpane=new JTabbedPane();
    private String[] col={ "Id","customer id","First_Name","last_Name","phone.","credit_Limit","Billing_Address","shipping_Address" };
private String[][] row={
    
};
private String[] pro_col={ "Id","Pdct_loc","Name","Vendor","Description.","Qnty_in_stk","W.S_price","Ret.proce","MRSP" };
private String[][] pro_row={
    
};

private String[] od_col={ "Invoice_Id","Pdct_Id","Name","Quantity","Price_Each","Discount","Total_Price","Customer_id"};
private String[][] od_row={
    
};
    public String id_txt;
    public String pid_txt;
    public String fname_txt;
    public String lname_txt;
                        
     public String phone_txt;
                        
     public String credit_txt;
                        
      public String bill_txt;
                        
     public String ship_txt;
                        
  
    public Layout()
    {
        try {
            initContentPane();
        } catch (SQLException ex) {
            Logger.getLogger(Layout.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void initContentPane() throws SQLException
    {
        
        //Register panel design
       
       reg.setBounds(0,0,1100, 600);
       reg.setLayout(null);
       tabbedpane.add("Register",reg);
       
         pro.setBounds(0,0,1100, 600);
       pro.setLayout(null);
        tabbedpane.add("Product",pro);
        add(tabbedpane);
        
        
        JLabel reg_head=new JLabel("Customer Register form");
        reg_head.setFont(new Font("Arial",Font.BOLD,18));
       reg_head.setBounds(450,5,250,20);
       reg.add(reg_head);
       
       JLabel reg_id=new JLabel("Id");
       reg_id.setBounds(20,50,20,20);
       reg.add(reg_id);
       
       JTextField reg_id_txt=new JTextField();
       reg_id_txt.setBounds(140,50,150,20);
       reg.add(reg_id_txt);
       
        JLabel reg_pid=new JLabel("Personal Id");
       reg_pid.setBounds(20,80,80,20);
       reg.add(reg_pid);
       
       JTextField reg_pid_txt=new JTextField();
       reg_pid_txt.setBounds(140,80,150,20);
       reg.add(reg_pid_txt);
       
       JLabel reg_fn=new JLabel("First Name");
       reg_fn.setBounds(20,110,80,20);
       reg.add(reg_fn);
       
       JTextField reg_fn_txt=new JTextField();
       reg_fn_txt.setBounds(140,110,150,20);
       reg.add(reg_fn_txt);
       
       JLabel reg_ln=new JLabel("Last Name");
       reg_ln.setBounds(20,140,80,20);
       reg.add(reg_ln);
       
       JTextField reg_ln_txt=new JTextField();
       reg_ln_txt.setBounds(140,140,150,20);
       reg.add(reg_ln_txt);
       
       JLabel reg_phn=new JLabel("Phone");
       reg_phn.setBounds(20,170,80,20);
       reg.add(reg_phn);
       
       JTextField reg_phn_txt=new JTextField();
       reg_phn_txt.setBounds(140,170,150,20);
       reg.add(reg_phn_txt);
       
       JLabel reg_cl=new JLabel("Credit Limit");
       reg_cl.setBounds(20,200,80,20);
       reg.add(reg_cl);
       
       JTextField reg_cl_txt=new JTextField();
       reg_cl_txt.setBounds(140,200,150,20);
       reg.add(reg_cl_txt);
       
       JLabel reg_billadd=new JLabel("Billing Address");
       reg_billadd.setBounds(20,230,100,20);
       reg.add(reg_billadd);
       
        JTextField reg_billadd_txt=new JTextField();
       reg_billadd_txt.setBounds(140,230,150,40);
       reg.add(reg_billadd_txt);
       
        JLabel reg_shipadd=new JLabel("Shipping Address");
       reg_shipadd.setBounds(20,280,110,20);
       reg.add(reg_shipadd);
       
     JTextField reg_shipadd_txt=new JTextField();
       reg_shipadd_txt.setBounds(140,280,150,40);
       reg.add(reg_shipadd_txt);
       
        reg_table = new JTable(row,col);
        JScrollPane jscrollpane = new JScrollPane(reg_table);
        jscrollpane.setBounds(315,50,760,270);
         reg.add(jscrollpane);
 
        JButton reg_insert = new JButton("Insert");
         reg_insert.setBounds(60, 380,80,20);
         reg.add( reg_insert);
         
         JButton reg_del = new JButton("Delete");
         reg_del.setBounds(250, 380,80,20);
         reg.add(reg_del);
         
         JButton reg_updt = new JButton("Update");
         reg_updt.setBounds(440, 380,80,20);
         reg.add(reg_updt);
         
          JButton reg_load = new JButton("Load Data");
         reg_load.setBounds(630, 380,120,20);
         reg.add(reg_load);
         
         
       
        reg_load.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
          theQuery("SELECT * FROM `registration_table` ");
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
        
        reg_insert.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
         customer.setId(reg_id_txt.getText()); 
        customer.setPersonal_id(reg_pid_txt.getText());
        customer.setFirst_name(reg_fn_txt.getText());
        customer.setLast_name(reg_ln_txt.getText());
        customer.setPhone(reg_phn_txt.getText());
        customer.setCredit_limit(reg_cl_txt.getText());
        customer.setBilling_adress(reg_billadd_txt.getText());
        customer.setShipping_adress(reg_shipadd_txt.getText());
        
        regcontroll.insert(customer);
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
    reg_updt.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
         customer.setId(reg_id_txt.getText()); 
        customer.setPersonal_id(reg_pid_txt.getText());
        customer.setFirst_name(reg_fn_txt.getText());
        customer.setLast_name(reg_ln_txt.getText());
        customer.setPhone(reg_phn_txt.getText());
        customer.setCredit_limit(reg_cl_txt.getText());
        customer.setBilling_adress(reg_billadd_txt.getText());
        customer.setShipping_adress(reg_shipadd_txt.getText());
        
        regcontroll.update(customer);
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
      
        reg_del.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
         customer.setId(reg_id_txt.getText()); 
        
        
        regcontroll.delete(customer);
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
        //Creating Product Panel
        JLabel pro_head=new JLabel("Product Information");
         pro_head.setFont(new Font("Arial",Font.BOLD,18));
       pro_head.setBounds(450,5,250,20);
        pro.add( pro_head);
       
       JLabel  pro_id=new JLabel("Id");
        pro_id.setBounds(20,50,20,20);
        pro.add( pro_id);
       
       JTextField pro_id_txt=new JTextField();
        pro_id_txt.setBounds(140,50,150,20);
        pro.add( pro_id_txt);
       
        JLabel  pro_loc=new JLabel("Product Location");
        pro_loc.setBounds(20,80,100,20);
        pro.add( pro_loc);
       
       JTextField  pro_loc_txt=new JTextField();
        pro_loc_txt.setBounds(140,80,150,20);
        pro.add( pro_loc_txt);
       
       JLabel  pro_nam=new JLabel("Name");
       pro_nam.setBounds(20,110,80,20);
        pro.add( pro_nam);
       
       JTextField  pro_nam_txt=new JTextField();
        pro_nam_txt.setBounds(140,110,150,20);
        pro.add( pro_nam_txt);
       
       JLabel pro_vendor=new JLabel("Vendor");
        pro_vendor.setBounds(20,140,80,20);
        pro.add( pro_vendor);
       
       JTextField  pro_vendor_txt=new JTextField();
        pro_vendor_txt.setBounds(140,140,150,20);
        pro.add( pro_vendor_txt);
       
       JLabel  pro_desc=new JLabel("Description");
        pro_desc.setBounds(20,170,80,20);
       pro.add( pro_desc);
       
       JTextField  pro_desc_txt=new JTextField();
        pro_desc_txt.setBounds(140,170,150,20);
        pro.add( pro_desc_txt);
       
       JLabel  pro_qnty=new JLabel("Qty IN Stock");
        pro_qnty.setBounds(20,200,80,20);
        pro.add( pro_qnty);
       
       JTextField  pro_qnty_txt=new JTextField();
        pro_qnty_txt.setBounds(140,200,150,20);
        pro.add( pro_qnty_txt);
       
       JLabel  pro_wsale=new JLabel("WholeSale Price");
        pro_wsale.setBounds(20,230,100,20);
        pro.add( pro_wsale);
       
        JTextField  pro_wsale_txt=new JTextField();
        pro_wsale_txt.setBounds(140,230,150,20);
        pro.add(pro_wsale_txt);
       
        JLabel  pro_retail=new JLabel("Retail Price");
        pro_retail.setBounds(20,260,110,20);
        pro.add( pro_retail);
       
     JTextField  pro_retail_txt=new JTextField();
       pro_retail_txt.setBounds(140,260,150,25);
       pro.add( pro_retail_txt);
       
       JLabel  pro_mrsp=new JLabel("MRSP");
        pro_mrsp.setBounds(20,290,110,20);
        pro.add( pro_mrsp);
       
     JTextField  pro_mrsp_txt=new JTextField();
       pro_mrsp_txt.setBounds(140,290,150,25);
       pro.add( pro_mrsp_txt);
       
        JTable pro_table = new JTable(pro_row,pro_col);
        JScrollPane pro_jscrollpane = new JScrollPane( pro_table);
        pro_jscrollpane.setBounds(315,50,760,270);
          pro.add( pro_jscrollpane);
 
        JButton  pro_insert = new JButton("Insert");
          pro_insert.setBounds(60, 380,80,20);
          pro.add(  pro_insert);
         
         JButton  pro_del = new JButton("Delete");
          pro_del.setBounds(250, 380,80,20);
          pro.add( pro_del);
         
         JButton  pro_updt = new JButton("Update");
          pro_updt.setBounds(440, 380,80,20);
          pro.add( pro_updt);
         
          JButton  pro_load = new JButton("Load Data");
         pro_load.setBounds(630, 380,120,20);
          pro.add( pro_load);
          
          pro_insert.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
        product.setId(pro_id_txt.getText());
        product.setLocation_product(pro_loc_txt.getText());
        product. setName(pro_nam_txt.getText());
        product.setVendor(pro_vendor_txt.getText());
        product.setDescription(pro_desc_txt.getText());
        product.setQty_in_stock(pro_qnty_txt.getText());
        product.setWholesale_price(pro_wsale_txt.getText());
        product.setRetail_price(pro_retail_txt.getText());
        product.setMsrp(pro_mrsp_txt.getText());
        
       procontroll.insert(product);
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
          
           pro_updt.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
        product.setId(pro_id_txt.getText());
        product.setLocation_product(pro_loc_txt.getText());
        product. setName(pro_nam_txt.getText());
        product.setVendor(pro_vendor_txt.getText());
        product.setDescription(pro_desc_txt.getText());
        product.setQty_in_stock(pro_qnty_txt.getText());
        product.setWholesale_price(pro_wsale_txt.getText());
        product.setRetail_price(pro_retail_txt.getText());
        product.setMsrp(pro_mrsp_txt.getText());
        
       procontroll.update(product);
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
           
            pro_del.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
        product.setId(pro_id_txt.getText());
        
       procontroll.Delete(product);
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
        
         });
          
             pro_load.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop_management","root","");
          Statement st = con.createStatement();
          st.executeQuery("SELECT * FROM `product_information`");
          ResultSet rs = st.executeQuery("SELECT * FROM `product_information`");
          pro_table.setModel(DbUtils.resultSetToTableModel(rs));
    
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
    }
        
             
        
         });
      
       //Order Panel
         JPanel od=new JPanel();
         od.setBounds(0,0,1100, 600);
       od.setLayout(null);
        tabbedpane.add("Order",od);
        add(tabbedpane);
        
        JLabel ord_head=new JLabel("Order Products");
         ord_head.setFont(new Font("Arial",Font.BOLD,18));
       ord_head.setBounds(450,5,250,20);
        od.add( ord_head);
       
       JLabel  od_invc=new JLabel("Invoice Id");
        od_invc.setBounds(20,50,80,20);
        od.add( od_invc);
       
       JTextField od_invc_txt=new JTextField();
        od_invc_txt.setBounds(140,50,150,20);
        od.add( od_invc_txt);
       
        JLabel  od_proid=new JLabel("Product Id");
       od_proid.setBounds(20,80,100,20);
        od.add( od_proid);
       
       JTextField  od_proid_txt=new JTextField();
        od_proid_txt.setBounds(140,80,150,20);
        od.add( od_proid_txt);
       
       JLabel  od_order_id=new JLabel("Order id");
       od_order_id.setBounds(20,110,80,20);
        od.add( od_order_id);
       
       JTextField  od_id_txt=new JTextField();
       od_id_txt.setBounds(140,110,150,20);
        od.add( od_id_txt);
       
       JLabel od_qnty=new JLabel("Quantity");
        od_qnty.setBounds(20,140,80,20);
       od.add( od_qnty);
       
       JTextField  od_qnty_txt=new JTextField();
        od_qnty_txt.setBounds(140,140,150,20);
        od.add( od_qnty_txt);
       
       JLabel  od_price=new JLabel("Price Each");
        od_price.setBounds(20,170,80,20);
       od.add( od_price);
       
       JTextField  od_price_txt=new JTextField();
        od_price_txt.setBounds(140,170,150,20);
        od.add( od_price_txt);
        
        JLabel  od_dscnt=new JLabel("Discount");
        od_dscnt.setBounds(20,200,80,20);
       od.add( od_dscnt);
       
       JTextField  od_dscnt_txt=new JTextField();
        od_dscnt_txt.setBounds(140,200,150,20);
        od.add(od_dscnt_txt);
        
        JLabel  od_customerid=new JLabel("Customer Id");
        od_customerid.setBounds(20,250,80,20);
       od.add( od_customerid);
       
       JTextField  od_customerid_txt=new JTextField();
        od_customerid_txt.setBounds(140,250,150,20);
        od.add(od_customerid_txt);
        
        JButton od_add = new JButton("Add");
         od_add.setBounds(60, 380,80,20);
         od.add( od_add);
         
         JButton od_clr = new JButton("Clear");
         od_clr.setBounds(250, 380,80,20);
         od.add(od_clr);
         
         JButton od_create_invoice = new JButton("Create Invoice");
         od_create_invoice.setBounds(540, 380,150,20);
         od.add(od_create_invoice);
         
          JButton od_load = new JButton("Load Data");
         od_load.setBounds(380, 380,100,20);
         od.add(od_load);
         
         JTable od_table = new JTable(od_row,od_col);
        JScrollPane od_jscrollpane = new JScrollPane( od_table);
        od_jscrollpane.setBounds(315,50,600,270);
          od.add( od_jscrollpane);
         
          od_add.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{

          double price = Double.parseDouble(od_price_txt.getText());
          double quantity = Double.parseDouble(od_qnty_txt.getText());
          double discount = Double.parseDouble(od_dscnt_txt.getText());

          double total = price*quantity - discount;

        order.setInvoice_id(od_invc_txt.getText());
        order.setProduct_id(od_proid_txt.getText());
        order.setId(od_id_txt.getText());
        order.setQuantity(od_qnty_txt.getText());
        order.setPrice_each(od_price_txt.getText());
        order.setDiscount(od_dscnt_txt.getText());
        order.setTotal_price(Double.toString(total));
        order.setCustomer_id(od_customerid_txt.getText());
       ordercontroller.insert(order);
       
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
             
          
    
          
      
        
         });
          
              od_clr.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

                        od_invc_txt.setText(" ");
                        od_proid_txt.setText("");
                        od_id_txt.setText("");
                        od_qnty_txt.setText("");
                        od_price_txt.setText("");
                        od_dscnt_txt.setText("");
                        od_customerid_txt.setText("");
                        
                        
                        
                        
        
             }
        
         });
          
           od_load.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {     

      try{
          
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop_management","root","");
          Statement st = con.createStatement();
          st.executeQuery("SELECT * FROM `ordered_products`");
          ResultSet rs = st.executeQuery("SELECT * FROM `ordered_products`");
          od_table.setModel(DbUtils.resultSetToTableModel(rs));
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
             
          
    
          
      
        
         });
         
         od_create_invoice.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e)
             {
                //accessing data
                 try{
          
          TheQuery("SELECT * FROM `registration_table` WHERE Id="+od_customerid_txt.getText());
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      } 
                
                 try {
                     while(rs.next())
                     {
                          id_txt=rs.getString("Id");
                          oc.setId1(id_txt);
                        
                          pid_txt=rs.getString("personal id");
                         
                         oc.setPersonal_id1(pid_txt);
                         
                          fname_txt=rs.getString("First_Name");
                        
                         oc.setFirst_name1(fname_txt);
                         
                          lname_txt=rs.getString("Last_Name");
                          oc.setLast_name1(lname_txt);
                        
                          phone_txt=rs.getString("Phone");
                          oc.setPhone1(phone_txt);
                        
                          credit_txt=rs.getString("Credit_llimit");
                          oc.setCredit_limit1(credit_txt);
                        
                          bill_txt=rs.getString("Billing_Address");
                          oc.setBilling_adress1(bill_txt);
                        
                         String ship_txt=rs.getString("Shipping_Address");
                         oc.setShipping_adress1(ship_txt);
                        
                         
                         
                         
                     }
                 } catch (SQLException ex) { 
                     Logger.getLogger(Layout.class.getName()).log(Level.SEVERE, null, ex);
                 }
             //Collecting Product data
             try{
          
          TheQuery("SELECT * FROM `product_information` WHERE Id="+od_proid_txt.getText());
       
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      } 
                
                 try {
                     while(rs.next())
                     {
                         
                          id_txt=rs.getString("Description");
                          product.setName(id_txt);
                        
                          
                         
                         
                         
                     }
                 } catch (SQLException ex) { 
                     Logger.getLogger(Layout.class.getName()).log(Level.SEVERE, null, ex);
                 }
             //end of collecting product data

      try{
          
       PrintFormController frame=new PrintFormController(order,oc,product);
        frame.setBounds(0,0,660,650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
 
      }
        
             }
             
          
    
          
      
        
         });
    }
    
      public void theQuery(String query){
      
      try{
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop_management","root","");
          Statement st = con.createStatement();
          st.executeQuery(query);
          ResultSet rs = st.executeQuery(query);
          reg_table.setModel(DbUtils.resultSetToTableModel(rs));
    
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
    }
      
      public ResultSet TheQuery(String query){
      
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost/shop_management","root","");
          st = con.createStatement();
          st.executeQuery(query);
          rs=st.executeQuery(query);
   
    return(rs);
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
        return null;
    }
       


    
}
