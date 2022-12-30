package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class PermitManager {

    ArrayList<ParkingPermit> parkingPermitList;

// This method will create an object of ParkingPermit class and will add it to the permits collection.
    public ParkingPermit register(String permitId, Car car, LocalDate registrationDate) {
        ParkingPermit pp = new ParkingPermit(permitId, car, registrationDate);
        pp.setExpirationDate(registrationDate.plusYears(1L));
        parkingPermitList.add(pp);
        return pp;
    }
}
