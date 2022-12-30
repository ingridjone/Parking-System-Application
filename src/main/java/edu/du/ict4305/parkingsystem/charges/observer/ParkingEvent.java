package edu.du.ict4305.parkingsystem.charges.observer;

import java.time.LocalDate;

/**
 *
 * @author Ingrid
 */
public class ParkingEvent {
    
    private int lotId;
    private LocalDate timeIn;
    private LocalDate timeOut;
    private String permit;
    
    public ParkingEvent() {
        
    }
    
    //Constructor for the ParkingEvent (entry and exit)
    public ParkingEvent(int lotId, LocalDate timeIn, LocalDate timeOut, String permit) {
        
    }
    
    //Constructor for the ParkingEvent (entry only)
    public ParkingEvent(int lotId, LocalDate timeOut, String permit) {
        
    }

    public int getLotId() {
        return lotId;
    }

    public LocalDate getTimeIn() {
        return timeIn;
    }

    public LocalDate getTimeOut() {
        return timeOut;
    }

    public String getPermit() {
        return permit;
    }

    public void setLot(int lotId) {
        this.lotId = lotId;
    }

    public void setTimeIn(LocalDate timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOut(LocalDate timeOut) {
        this.timeOut = timeOut;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    @Override
    public String toString() {
        return "ParkingEvent{" + "lotId=" + lotId + ", timeIn=" + timeIn + ", timeOut=" + timeOut + ", permit=" + permit + '}';
    }
    
    
    
}
