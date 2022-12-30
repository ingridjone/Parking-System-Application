package edu.du.ict4305.parkingsystem.charges.observer;

/**
 *
 * @author Ingrid
 */
public interface ParkingAction {
    
    //Interface for Observers
    public void update(ParkingEvent event);
    
}
