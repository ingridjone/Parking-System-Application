package edu.du.ict4305.parkingsystem.charges.strategy;

import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;
import java.time.LocalDate;

/**
 *
 * @author Ingrid
 */
public class StrategyProximity implements ParkingChargeStrategy {
    
    public ParkingLot parkingLot;
    public LocalDate dateParked;
    public double hoursParked;
    public ParkingPermit parkingPermit;
    
    public StrategyProximity() {
        
    }
    
    //The idea of the Proximity Strategy is to charge more if the parking lot is located near the entry of the parking garage
    //To calculate the proximity of the parking lot, I will use the parking lot ID:
    //Parking Lots 1-20 will be the nearest ones from the exit since they are the first ones built, with a rate of $4 per hour parked
    //Parking Lots with an ID greater than 20, will have a rate of $2 per hour
    public double calculateRate(ParkingLot parkingLot, LocalDate dateParked, double hoursParked, ParkingPermit parkingPermit) {
        
        //First, store the parking lot ID into a variable
        int lotId = parkingLot.getLotId();
        
            //If the parking lot ID is smaller or equal to 20, apply nearRate of $4/hour
            if (lotId <= 20) {
                double nearRate = hoursParked * 4;
                return nearRate;
                }
            
            //If not, apply farRate of $2/hour
            else {
                double farRate = hoursParked * 2;
                return farRate;
                }
    }
    
}
