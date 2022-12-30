package edu.du.ict4305.parkingsystem;

/**
 *
 * @author Ingrid
 */
public class Address {
    
    //Declare private variables related to Address
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String zipCode;
    
    //Builder for Address
    //To initialize: Address address = new Address.Builder("1920 S University Blvd", "Denver", "CO", "80210").streetAddress2("Apt 657");
    public static class Builder {
        
        //Required parameters
        private String streetAddress1;
        private String city;
        private String state;
        private String zipCode;
        
        //Optional parameters (initialize them to default values)
        private String streetAddress2 = "";
        
        //Constructor for required parameters
        public Builder(String streetAddress1, String city, String state, String zipCode) {
            this.streetAddress1 = streetAddress1;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }
        
        //Constructor for optional parameters
        public Builder streetAdress2(String val) {
            streetAddress2 = val;
            return this;
        }
        
        public Address build(){
            return new Address(this);
        }
    }
    
    private Address(Builder builder) {
        streetAddress1 = builder.streetAddress1;
        streetAddress2 = builder.streetAddress2;
        city = builder.city;
        state = builder.state;
        zipCode = builder.zipCode;
    }
    
    //Constructors for Address
    public Address() {
        
    }
    
    public Address(String streetAddress1, String streetAddress2, String city, String state, String zipCode) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Address {" + "Street 1 = " + streetAddress1 + ", Street 2 = " + streetAddress2 + ", City = " + city + ", State = " + state + ", Zip Code = " + zipCode + '}';
    }
    
    //Setters and Getters for Address variables
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
    
}
