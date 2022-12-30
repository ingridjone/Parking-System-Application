package edu.du.ict4305.parkingsystem.charges.strategy;

import edu.du.ict4305.parkingsystem.ParkingLot;
import edu.du.ict4305.parkingsystem.ParkingPermit;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Ingrid
 */
public class StrategyWeekDay implements ParkingChargeStrategy {
    
    public ParkingLot parkingLot;
    public LocalDate dateParked;
    public double hoursParked;
    public ParkingPermit parkingPermit;
    
    public StrategyWeekDay() {
        
    }
    
    //The idea of the Week Day Strategy is to charge more during the weekends
    //On Saturday and Sunday, the rate is going to be $5 per hour parked
    //During a week day, the rate will be $3 per hour
    public double calculateRate(ParkingLot parkingLot, LocalDate dateParked, double hoursParked, ParkingPermit parkingPermit) {
        DayOfWeek dayOfTheWeek = dateParked.getDayOfWeek();
        
        //If the day of the week of the date provided is equal to a weekend day, apply weekendRate
        if ("SATURDAY".equals(dayOfTheWeek.name()) || "SUNDAY".equals(dayOfTheWeek.name()) ) {
            double weekendRate = hoursParked * 5;
            return weekendRate;
        }
        
        //If not, apply normal rate
        else {
            double weekDayRate = hoursParked * 3;
            return weekDayRate;
        }
    }
}
