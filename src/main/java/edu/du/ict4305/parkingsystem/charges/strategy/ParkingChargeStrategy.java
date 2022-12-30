package edu.du.ict4305.parkingsystem.charges.strategy;

import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;
import java.time.LocalDate;

/**
 *
 * @author Ingrid
 */
public interface ParkingChargeStrategy {
    
    //Method that returns the rate due, depending on which strategy is implemented
    public double calculateRate(ParkingLot parkingLot, LocalDate dateParked, double hoursParked, ParkingPermit parkingPermit);
            
}
