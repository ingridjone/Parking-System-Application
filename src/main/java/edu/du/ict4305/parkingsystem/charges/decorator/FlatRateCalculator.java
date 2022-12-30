package edu.du.ict4305.parkingsystem.charges.decorator;

import edu.du.ict4305.parkingsystem.ParkingCharge;
import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;

/**
 *
 * @author Ingrid
 */
public class FlatRateCalculator extends ParkingChargeCalculator {
    
    public FlatRateCalculator() {
        
    }
    
    //Method that calculates the total charge of a parking lot flat rate of $3/hr
    public ParkingCharge getParkingCharge(double hoursParked, ParkingLot lot, ParkingPermit permit) {
        
        double amount = hoursParked * 3.00;
        
        int lotId = lot.getLotId();
        
        ParkingCharge charge = new ParkingCharge(permit, lotId, amount);
        
        //Printing the charge details to the console
        System.out.println("The original flat rate is "+charge.getAmount());
        return charge;
    }
    
}
