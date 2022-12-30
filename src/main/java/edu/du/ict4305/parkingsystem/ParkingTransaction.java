package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;

/**
 *
 * @author Ingrid
 */
public class ParkingTransaction {
    
    private LocalDate transactionDate;
    private ParkingPermit permit;
    private ParkingLot parkingLot;
    private Money feeCharged;
    
    //Constructors for ParkingTransaction
    public ParkingTransaction(LocalDate td, ParkingPermit p, ParkingLot pl, Money fc) {
        this.transactionDate = td;
        this.permit = p;
        this.parkingLot = pl;
        this.feeCharged = fc;
    }
    
    //Setters and Getters
    public void setPermit(ParkingPermit permit) {
        this.permit = permit;
    }

    public void setDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void setFeeCharged(Money feeCharged) {
        this.feeCharged = feeCharged;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public Money getFeeCharged() {
        return feeCharged;
    }

    @Override
    public String toString() {
        return "ParkingTransaction{" + "Transaction Date = " + transactionDate + ", Permit = " + permit.getPermitId() + ", Parking Lot ID = " + parkingLot.getLotId() + ", Fee Charged = " + feeCharged + '}';
    }
}
