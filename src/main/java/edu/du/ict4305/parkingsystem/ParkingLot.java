package edu.du.ict4305.parkingsystem;

import edu.du.ict4305.parkingsystem.charges.observer.ParkingEvent;
import edu.du.ict4305.parkingsystem.charges.observer.ParkingObserver;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Ingrid
 */
public class ParkingLot {
    
    //Declare private variables for ParkingLot
    private int lotId;
    private String name;
    private Address address;
    private LocalDate timeIn;
    private LocalDate timeOut;
    private ParkingLot lot;
    private ParkingEvent event;
    
    //List that stores all our observers
    private ArrayList<ParkingObserver> observers = new ArrayList<>();
    
    //The method addParkingLot from the ParkingOffice, utilizes this ArrayList
    ArrayList<ParkingLot> parkingLotList;
     
     //Constructors for ParkingLot
     public ParkingLot() {
         
         observers = new ArrayList<ParkingObserver>();
         
     }
     
     public ParkingLot(int lotId, Address address) {
         this.lotId = lotId;
         this.address = address;
     }
     
     //Notifies the parking observer about a parking event (entry of a car, for ex.)
     public void notify(ParkingEvent event) {
         this.event = event;
         for (ParkingObserver observer: this.observers) {
             observer.update(this.event);
         }
     }
     
     public void register(ParkingObserver newObserver) {
         //Adds the observer to the list of observers
         this.observers.add(newObserver);
     }
     
     public void unregister(ParkingObserver deleteObserver) {
         //Stores the index of the observer we want to delete
         int observerIndex = observers.indexOf(deleteObserver);
         //Deletes the observer from the list of observers
         observers.remove(observerIndex);
     }
     
     //Checks if a parking lot object is equal to another
    @Override
    public boolean equals(Object parkingLot) {
        if (!(parkingLot instanceof ParkingLot)) {
            return false;
        }
        return true;
    }

    //Returns the hashcode of lotId, address and rate
    @Override
    public int hashCode() {
        return Objects.hash(lotId, address);
    }
          
    //Car enters a parking lot
    public void entry(Car car, ParkingLot lot) {
        //Updates the observer
        ParkingEvent event = new ParkingEvent(lot.getLotId(), timeIn, car.getPermitId());
        ParkingObserver observer = new ParkingObserver();
        observer.update(event);
        
        String license = car.getLicense();
        System.out.println("The car with license: "+license+" has entered the Parking Lot number: "+lotId);
    }
    
    //Car enters and exits a parking lot
    public void exit(Car car, ParkingLot lot) {
        //Updates the observer
        ParkingEvent event = new ParkingEvent(lot.getLotId(), timeIn, timeOut, car.getPermitId());
        ParkingObserver observer = new ParkingObserver();
        observer.update(event);
        
        String license = car.getLicense();
        System.out.println("The car with license: "+license+" has entered the "+lotId);
    }
    
    //Setters and Getters for ParkingLot variables
    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getLotId() {
        return lotId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ParkingLot{" + "lotId=" + lotId + ", name=" + name + ", address=" + address + ", parkingLotList=" + parkingLotList + '}';
    }
}
