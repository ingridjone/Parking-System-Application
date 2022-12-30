package edu.du.ict4305.parkingsystem;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Ingrid
 */
public class Customer {
    
    //Declare priavate variables related to Customer
    private String name;
    private String customerId;
    private String phoneNumber;
    private Address address;
    
    //The customerList stores all customer IDs and can be returned by the parkingOffice with the getCustomerIds method
    ArrayList<Customer> customerList;
    
    //Builder for Customer
    public static class Builder {
        
        //Required parameters
        private String name;
        private String customerId;
        
        //Optional parameters (initialize them to default values)
        private String phoneNumber = "";
        private Address address = null;
                
        //Constructor for required parameters
        public Builder(String name, String customerId) {
            this.name = name;
            this.customerId = customerId;
        }
        
        //Constructor for optional parameters
        public Builder phoneNumber(String val) {
            phoneNumber = val;
            return this;
        }
        
        public Builder address(Address val) {
            address = val;
            return this;
        }
        
        public Customer build(){
            return new Customer(this);
        }
    }
    
    private Customer(Builder builder) {
        name = builder.name;
        customerId = builder.customerId;
        phoneNumber = builder.phoneNumber;
        address = builder.address;
    }
    
    //Constructors for Customer
    public Customer() {
        
    }

    public Customer(String name, String customerId, String phoneNumber, Address address) {
        this.name = name;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    //Checks if a customer object is equal to another
    @Override
    public boolean equals(Object customer) {
        if (!(customer instanceof Customer)) {
            return false;
        }
        return true;
    }

    //Returns the hashcode of customerId and name
    @Override
    public int hashCode() {
        return Objects.hash(customerId, name);
    }

    //Return string results for all variables
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(customerId);
        sb.append(name);
        sb.append(address);
        sb.append(phoneNumber);
        return "Customer {" + "Customer ID = " + customerId + ", Name = " + name + ", Address = " + address + ", Phone Number = " + phoneNumber  + '}';
    }

    //Setters and Getters for Customer variables
    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

}
