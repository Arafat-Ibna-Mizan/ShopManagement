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
public class OrderedCustomer {
    private String id1;
    private String personal_id1;
    private String first_name1;
    private String last_name1;
    private String phone1;
    private String credit_limit1;
    private String billing_adress1;
    private String shipping_adress1;

    public OrderedCustomer(String id1, String personal_id1, String first_name1, String last_name1, String phone1, String credit_limit1, String billing_adress1, String shipping_adress1) {
        this.id1 = id1;
        this.personal_id1 = personal_id1;
        this.first_name1 = first_name1;
        this.last_name1 = last_name1;
        this.phone1 = phone1;
        this.credit_limit1 = credit_limit1;
        this.billing_adress1 = billing_adress1;
        this.shipping_adress1 = shipping_adress1;
        
    }

    public OrderedCustomer() {
        
       
    }

    public String getId1() {
        return id1;
    }

    public String getPersonal_id1() {
        return personal_id1;
    }

    public String getFirst_name1() {
        System.out.print(first_name1);
        return first_name1;
    }

    public String getLast_name1() {
        return last_name1;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getCredit_limit1() {
        return credit_limit1;
    }

    public String getBilling_adress1() {
        return billing_adress1;
    }

    public String getShipping_adress1() {
        return shipping_adress1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public void setPersonal_id1(String personal_id1) {
        this.personal_id1 = personal_id1;
    }

    public void setFirst_name1(String first_name1) {
        this.first_name1 = first_name1;
    }

    public void setLast_name1(String last_name1) {
        this.last_name1 = last_name1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setCredit_limit1(String credit_limit1) {
        this.credit_limit1 = credit_limit1;
    }

    public void setBilling_adress1(String billing_adress1) {
        this.billing_adress1 = billing_adress1;
    }

    public void setShipping_adress1(String shipping_adress1) {
        this.shipping_adress1 = shipping_adress1;
    }
    
    public static void main(String[] args) {
        
    }
}
