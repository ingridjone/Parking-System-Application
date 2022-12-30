package edu.du.ict4305.parkingsystem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Ingrid
 */
public class ParkingCharge {
    
    //Declare private variables related to ParkingCharge
    private ParkingPermit permit;
    private int lotId;
    private Instant incurred;
    private double amount;
    ArrayList<ParkingCharge> parkingChargeList;
    
    //Constructors for Parking Charge
    public ParkingCharge() {
        
    }
    
    public ParkingCharge(ParkingPermit permit, int lotId, double amount) {
        this.permit = permit;
        this.lotId = lotId;
        //Records the time of the transaction
        this.amount = amount;
    }
    
    //Checks if a parking charge object is equal to another
    @Override
    public boolean equals(Object parkingCharge) {
        if (!(parkingCharge instanceof ParkingCharge)) {
            return false;
        }
        return true;
    }

    //Returns the hashcode of permitId, lotId and incurred
    @Override
    public int hashCode() {
        return Objects.hash(permit, lotId, incurred);
    }
    
    //toString method
    @Override
    public String toString() {
        return "ParkingCharge{" + "permit=" + permit + ", lotId=" + lotId + ", incurred=" + incurred + ", amount=" + amount + '}';
    }
    
    //Setters and Getters for all ParkingCharge variables
    public void setPermit(ParkingPermit permit) {
        this.permit = permit;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public void setIncurred(Instant incurred) {
        this.incurred = incurred;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public int getLotId() {
        return lotId;
    }

    public Instant getIncurred() {
        return incurred;
    }

    public double getAmount() {
        return amount;
    }
    
}
