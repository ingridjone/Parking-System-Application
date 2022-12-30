package edu.du.ict4305.parkingsystem.charges.observer;

import edu.du.ict4305.parkingsystem.ParkingLot;
import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class ParkingObserver implements ParkingAction {
    
    private ParkingEvent event;
    ArrayList<ParkingEvent> parkingTransactions = new ArrayList<>();
    
    //List of subjects
    private ParkingLot lot;
    
    
    public ParkingObserver() {
        
    }
    
    //Constructor that takes the Subject as a parameter
    public ParkingObserver(ParkingLot lot) {
        this.lot = lot;
        //Adds the new observer to the list of observers
        lot.register(this);
    }
    
    @Override
    public void update(ParkingEvent event) {
        this.event = event;
        //Adds the transaction to a collection
        parkingTransactions.add(event);
    }
    
    //Prints all parking events recorded to the console
    public void printTransactions() {
        System.out.println(parkingTransactions.toString());
    }
    
}
