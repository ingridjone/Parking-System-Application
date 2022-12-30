package edu.du.ict4305.parkingsystem.charges.decorator;

import edu.du.ict4305.parkingsystem.Car;
import edu.du.ict4305.parkingsystem.ParkingCharge;
import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;

/**
 *
 * @author Ingrid
 */
public class CompactCarDiscountDecorator extends ParkingChargeCalculatorDecorator {
    
    public CompactCarDiscountDecorator() {
        
    }
    
    //Considering a normal parking lot with a $3/hr rate
    //Calculates the amount due, applying a 20% discount if the car is COMPACT type
    public ParkingCharge getParkingCharge(double hoursParked, ParkingLot lot, ParkingPermit permit) {
        
        int lotId = lot.getLotId();
        double discount = 20.00;
        //Stores the 20% discount rate
        double discountRate = 100.00-discount;
        double amount = hoursParked * 3.00;
        
        //First we store the carType variable into a String
        Car car = permit.getCar();
        String carType = car.getCarType().toString();
        
        //If statement that checks if the car is COMPACT
        if ("COMPACT".equals(carType)) {
            //If the condition is met, the discount is applied
            double discountedAmount = (discountRate*amount)/100.00;
            ParkingCharge discountedCharge = new ParkingCharge(permit, lotId, discountedAmount);
            System.out.println("The 20%  discounted rate is "+discountedCharge.getAmount());
            return discountedCharge;
        } else {
            ParkingCharge normalCharge = new ParkingCharge(permit, lotId, amount);
            System.out.println("The normal rate is "+normalCharge.getAmount());
            return normalCharge;
        }
    }
    
}
