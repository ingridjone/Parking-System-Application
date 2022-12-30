package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Ingrid
 */
public class Car {
    
    //Declare private variables related to Car
    private String permitId;
    private String license;
    private CarType carType;
    private String customerId;
    ArrayList<Car> carList;

    //Constructors for Car
    public Car() {
        
    }
    
    public Car(String license, CarType carType, String customerId) {
        this.license = license;
        this.carType = carType;
        this.customerId = customerId;
    }
    
    //Checks if a car object is equal to another
    public boolean equals(Object car) {
        if (!(car instanceof Car)) {
            return false;
        }
        return true;
    }

    //Returns the hashcode of permitId, license and customerId
    @Override
    public int hashCode() {
        return Objects.hash(permitId, license, customerId);
    }

    //toString method
    @Override
    public String toString() {
        return "Car {" + "Permit ID = " + permitId + ", License = " + license + ", Car Type = " + carType + ", Customer ID = " + customerId + '}';
    }
        
    //Setters and Getters for all Car variables
    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPermitId() {
        return permitId;
    }

    public String getLicense() {
        return license;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getCustomerId() {
        return customerId;
    }
        
}