package edu.du.ict4305.parkingsystem.charges.decorator;

import edu.du.ict4305.parkingsystem.ParkingCharge;
import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;

/**
 *
 * @author Ingrid
 */
public abstract class ParkingChargeCalculatorDecorator extends ParkingChargeCalculator {
    
    private ParkingCharge charge;
    
    public ParkingChargeCalculatorDecorator() {
        
    }
    
    public ParkingCharge getParkingCharge(double hoursParked, ParkingLot lot, ParkingPermit permit) {
        return charge;
    }
    
}
