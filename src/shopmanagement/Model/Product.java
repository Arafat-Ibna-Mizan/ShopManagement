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
public class Product {
    
    private String id;
    private String location_product;
    private  String name;
    private  String vendor;
    private  String description;
    private  String qty_in_stock;
    private  String wholesale_price;
    private  String retail_price;
    private  String msrp;

    public Product() {
    }

    public Product(String id, String location_product, String name, String vendor, String description, String qty_in_stock, String wholesale_price, String retail_price, String msrp) {
        this.id = id;
        this.location_product = location_product;
        this.name = name;
        this.vendor = vendor;
        this.description = description;
        this.qty_in_stock = qty_in_stock;
        this.wholesale_price = wholesale_price;
        this.retail_price = retail_price;
        this.msrp = msrp;
    }

    public String getId() {
        return id;
    }

    public String getLocation_product() {
        return location_product;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getDescription() {
        return description;
    }

    public String getQty_in_stock() {
        return qty_in_stock;
    }

    public String getWholesale_price() {
        return wholesale_price;
    }

    public String getRetail_price() {
        return retail_price;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLocation_product(String location_product) {
        this.location_product = location_product;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQty_in_stock(String qty_in_stock) {
        this.qty_in_stock = qty_in_stock;
    }

    public void setWholesale_price(String wholesale_price) {
        this.wholesale_price = wholesale_price;
    }

    public void setRetail_price(String retail_price) {
        this.retail_price = retail_price;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

  

    

   
            
    
}
