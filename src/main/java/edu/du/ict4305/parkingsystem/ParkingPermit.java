package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Ingrid
 */
public class ParkingPermit {
    
    private String permitId;
    private Car car;
    private LocalDate expirationDate;
    private LocalDate registrationDate;
    ArrayList<ParkingPermit> parkingPermitList;
    
    //Constructor for Parking Permit
    public ParkingPermit(String permitId, Car car, LocalDate registrationDate){
        this.permitId = permitId;
        this.car = car;
        //The permit expires a year after it is registered
        expirationDate = registrationDate.plusMonths(12);
    }
    
    //Checks if a parking permit is equal to another
    @Override
    public boolean equals(Object parkingPermit) {
        if (!(parkingPermit instanceof ParkingPermit)) {
            return false;
        }
        return true;
    }

    //Returns the hashcode of permitId and car
    @Override
    public int hashCode() {
        return Objects.hash(permitId, car);
    }
    
    //Setters and Getters
    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPermitId() {
        return permitId;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return "ParkingPermit{" + "permitId=" + permitId + ", car=" + car + ", expirationDate=" + expirationDate + ", registrationDate=" + registrationDate + ", parkingPermitList=" + parkingPermitList + '}';
    }
    
    
   
}
