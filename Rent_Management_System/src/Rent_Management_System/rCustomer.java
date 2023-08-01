/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rent_Management_System;

/**
 *
 * @author Dilack
 */
public class rCustomer {
    
    //Data Members
    
    private String CustomerID;
    private String Firstname;
    private String Surename;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProveofID;
    private Double Deposit;
    private Double DownPayment;

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurename() {
        return Surename;
    }

    public void setSurename(String Surename) {
        this.Surename = Surename;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProveofID() {
        return ProveofID;
    }

    public void setProveofID(String ProveofID) {
        this.ProveofID = ProveofID;
    }

    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double Deposit) {
        this.Deposit = Deposit;
    }

    public Double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(Double DownPayment) {
        this.DownPayment = DownPayment;
    }
    
    
    
}
