/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanagement.Model;

/**
 *
 * @author HP
 */
public class OrdersProducts {
    
    private String id;
    private String quantity;
    private String price_each;
    private String discount;
    private String invoice_id;
    private String product_id;
    private String total_price;
    private String customer_id;

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public OrdersProducts() {
    }

    public OrdersProducts(String id, String quantity, String price_each, String discount, String invoice_id, String product_id, String total_price, String customer_id) {
        this.id = id;
        this.quantity = quantity;
        this.price_each = price_each;
        this.discount = discount;
        this.invoice_id = invoice_id;
        this.product_id = product_id;
        this.total_price = total_price;
        this.customer_id=customer_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice_each() {
        return price_each;
    }

    public void setPrice_each(String price_each) {
        this.price_each = price_each;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    
    
    
}
