package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class TransactionManager {
    
    private ArrayList<ParkingTransaction> transactions;

// This method will create a parking transaction and will add it to the transactions list.
    public ParkingTransaction park(LocalDate date, ParkingPermit permit, ParkingLot lot, Money feeCharged) {
        ParkingTransaction pt= new ParkingTransaction(date, permit, lot, feeCharged);
        transactions.add(pt);
        return pt;
    }
}
