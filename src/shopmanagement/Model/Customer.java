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
public class Customer {
    
    private String id;
    private String personal_id;
    private String first_name;
    private String last_name;
    private String phone;
    private String credit_limit;
    private String billing_adress;
    private String shipping_adress;

    public Customer() {
    }

    public Customer(String id, String personal_id, String first_name, String last_name, String phone, String credit_limit, String billing_adress, String shipping_adress) {
        this.id = id;
        this.personal_id = personal_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.credit_limit = credit_limit;
        this.billing_adress = billing_adress;
        this.shipping_adress = shipping_adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(String personal_id) {
        this.personal_id = personal_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(String credit_limit) {
        this.credit_limit = credit_limit;
    }

    public String getBilling_adress() {
        return billing_adress;
    }

    public void setBilling_adress(String billing_adress) {
        this.billing_adress = billing_adress;
    }

    public String getShipping_adress() {
        return shipping_adress;
    }

    public void setShipping_adress(String shipping_adress) {
        this.shipping_adress = shipping_adress;
    }

   
    
}
