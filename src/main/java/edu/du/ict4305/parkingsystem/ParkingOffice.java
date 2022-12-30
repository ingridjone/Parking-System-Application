package edu.du.ict4305.parkingsystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class ParkingOffice {

    private String customerId;
    private CarType carType;
    private String license;
    private String parkingOfficeCompany;
    private Address parkingOfficeAddress;
    private LocalDate registrationDate;
    
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();
    ArrayList<ParkingCharge> parkingChargeList = new ArrayList<>();
    ArrayList<ParkingLot> parkingLotList = new ArrayList<>();
    ArrayList<ParkingPermit> parkingPermitList = new ArrayList<>();
    ArrayList<ParkingTransaction> parkingTransactions = new ArrayList<>();
    
    //Constructors for Parking Office
    public ParkingOffice() {
        
    }
    
    public ParkingOffice(String parkingOfficeCompany, Address parkingOfficeAddress) {
        this.parkingOfficeCompany = parkingOfficeCompany;
        this.parkingOfficeAddress = parkingOfficeAddress;
    }
    
    //Registering customer into the customer list
    public Customer register(String name, Address address, String phoneNumber, String customerId) {
        Customer cust = new Customer();
        //Added the customerIds ArrayList to the method itself so it cannot be modified
        ArrayList<String> customerIds = new ArrayList<>();
        customerList.add(cust);
        customerIds.add(customerId);
        return cust;
    }
    
    //Customer registering a car
    public Car register(Customer c, String license, CarType carType, String permitId) {
        Car car = new Car(license, carType, c.getCustomerId());
        carList.add(car);
        //Adds the permit ID to the list
        ArrayList<String> permitIds = new ArrayList<>();
        permitIds.add(permitId);
        //Generating a parking permit
        ParkingPermit pp = new ParkingPermit("PID001", car, LocalDate.now());
        car.setPermitId(pp.getPermitId());
        //Adds the new permit to the list
        parkingPermitList.add(pp);
        return car;
    }
    
    //Returns all customers Ids that have been registered in the system
    public ArrayList getCustomerIds() {
        ArrayList<String> customerIds = new ArrayList<>();
        return customerIds;
    }
    
    //Returns all parking permits registered in the system
    public ArrayList getPermitIds() {
        ArrayList<String> permitIds = new ArrayList<>();
        return permitIds;
    }
    
    //Returns permit Id information if customer is in the system
    public ArrayList getPermitIds(Customer cust) {
        if (customerList.contains(cust)) {
            ArrayList<String> permitIds = new ArrayList<>();
            return permitIds;
        }
        System.out.println("The system could not find the given customer...");
        return null;
    }
    
    //Method to look up a customer's name on the system
    public Customer getCustomer(String searchName) {
        Customer cust = new Customer("John", "ID001", "+1512839572", new Address("2075", "S University Blvd" , "Denver", "CO", "80210" ));
            if ( searchName.equals(cust.getName())) {
                return cust;
            }
        return null;
    }
    
    //Adds a new charge to the list of parking charges
    public void addCharge(ParkingCharge pc){
        parkingChargeList.add(pc);
    }
    
    //Adds a new parking lot
    public void addParkingLot(ParkingLot pl) {
        parkingLotList.add(pl);
    }
    
    //This method simulates a car entering a parking lot and creating a parking transaction
    public ParkingTransaction park(LocalDate date, ParkingPermit pp, ParkingLot pl, Money feeCharged){
        ParkingTransaction pt = new ParkingTransaction(date, pp, pl, feeCharged);
        parkingTransactions.add(pt);
        return pt;
    }
    
    //This method returns all parking transactions
    public ArrayList getParkingTransactions(){
        return parkingTransactions;
    }
    
    //This method returns all parking charges
    public ArrayList getParkingCharges(){
        return parkingChargeList;
    }
    
    //Setters and Getters for all ParkingOffice variables
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public void setParkingChargeList(ArrayList<ParkingCharge> parkingChargeList) {
        this.parkingChargeList = parkingChargeList;
    }

    public void setParkingOfficeCompany(String parkingOfficeCompany) {
        this.parkingOfficeCompany = parkingOfficeCompany;
    }

    public void setParkingOfficeAddress(Address parkingOfficeAddress) {
        this.parkingOfficeAddress = parkingOfficeAddress;
    }
    
    public String getCustomerId() {
        return customerId;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getLicense() {
        return license;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getParkingOfficeCompany() {
        return parkingOfficeCompany;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public ArrayList<ParkingCharge> getParkingChargeList() {
        return parkingChargeList;
    }

    public Address getParkingOfficeAddress() {
        return parkingOfficeAddress;
    }
    
        //toString method
    @Override
    public String toString() {
        return "ParkingOffice {" + "Customer ID = " + customerId + ", Car Type = " + carType + ", Registration Date = " + registrationDate + ", Customers' List = " + customerList + ", Cars' List = " + carList + ", Parking Charges = " + parkingChargeList + '}';
    }
    
}
 
    
