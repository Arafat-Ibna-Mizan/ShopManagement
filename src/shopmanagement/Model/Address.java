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
public class Address {
    
    private int id;
    private String address1;
    private String address2;
    private String city;
    private String provinces;
    private String state;
    private String postal_code;

    public Address() {
    }

    public Address(int id, String address1, String address2, String city, String provinces, String state, String postal_code) {
        this.id = id;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.provinces = provinces;
        this.state = state;
        this.postal_code = postal_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    
    
}
