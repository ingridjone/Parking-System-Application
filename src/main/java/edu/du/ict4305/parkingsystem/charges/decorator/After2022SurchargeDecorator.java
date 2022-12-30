package edu.du.ict4305.parkingsystem.charges.decorator;

import edu.du.ict4305.parkingsystem.ParkingCharge;
import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;
import java.time.LocalDate;

/**
 *
 * @author Ingrid
 */
public class After2022SurchargeDecorator extends ParkingChargeCalculatorDecorator {
    
    public After2022SurchargeDecorator() {
        
    }
    
    //The idea is to apply a 9% surcharge to any car that has been registered in or after Jan 1st 2022
    public ParkingCharge getParkingCharge(double hoursParked, ParkingLot lot, ParkingPermit permit) {
        
        int lotId = lot.getLotId();
        double surcharge = 09.00;
        //Calculates the surcharge rate of 9%
        double surchargeRate = 100.00+surcharge;
        double amount = hoursParked * 3.00;
        //Stores the "deadline" date
        LocalDate after2022 = LocalDate.of(2022, 01, 01);
        
        //First we store the Registration Date variable
        LocalDate registrationDate = permit.getRegistrationDate();
        
        //If statement that checks if the resgistration date happened after or in 2022
        if (registrationDate.isAfter(after2022) || registrationDate.isEqual(after2022)) {
            //If any of the conditions are met, the surcharge is calculated
            double surchargeAmount = (surchargeRate*amount)/100.00;
            ParkingCharge surchargeCharge = new ParkingCharge(permit, lotId, surchargeAmount);
            System.out.println("The car was registered in or after Jan 1st, 2022, thus the rate will be "+surchargeCharge.getAmount());
            return surchargeCharge;
        } else {
            ParkingCharge normalCharge = new ParkingCharge(permit, lotId, amount);
            System.out.println("The normal rate is "+normalCharge.getAmount());
            return normalCharge;
        }
    }
    
}
