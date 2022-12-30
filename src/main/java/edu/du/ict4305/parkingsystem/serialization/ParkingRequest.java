package edu.du.ict4305.parkingsystem.serialization;

import com.google.gson.Gson;
import edu.du.ict4305.parkingsystem.Car;
import edu.du.ict4305.parkingsystem.Customer;

/**
 *
 * @author Ingrid
 */
public class ParkingRequest {
    
    //Command name decribes what happens in the back-end
    //Json stores JSON Strings
    private String commandName;
    private String json;
    
    //Constructors
    public ParkingRequest() {
    }
    
    public ParkingRequest(String json) {
    }
    
    public ParkingRequest(Customer customer) {
    }
    
    public ParkingRequest(Car car) {
    }
    
    //I've created two use cases for the conversion: a Customer and a Car object
    public ParkingRequest convertCustomerToJSON(Customer customer) {
        Gson gson = new Gson();
        String customerToJSON = gson.toJson(customer);
        //Generates a ParkingRequest object
        ParkingRequest request = new ParkingRequest(customerToJSON);
        request.setCommandName("Convert Customer to JSON");
        request.setJson(customerToJSON);
        System.out.println(request);
        return request;
    }
    
        public ParkingRequest convertCarToJSON(Car car) {
        Gson gson = new Gson();
        String carToJSON = gson.toJson(car);
        ParkingRequest request = new ParkingRequest(carToJSON);
        request.setCommandName("Convert Car to JSON");
        request.setJson(carToJSON);
        System.out.println(request);
        return request;
    }
    
    //This method converts a JSON string into a Customer object
    public Customer convertJSONToCustomer(String json) {
        Gson gson = new Gson();
        Customer customer = gson.fromJson(json, Customer.class);
        ParkingRequest request = new ParkingRequest(customer);
        request.setCommandName("Convert JSON to Customer");
        System.out.println(customer);
        return customer;
    }
    
    //This method converts a JSON string into a Car object
    public Car convertJSONToCar(String json) {
        Gson gson = new Gson();
        Car car = gson.fromJson(json, Car.class);
        ParkingRequest request = new ParkingRequest(car);
        request.setCommandName("Convert JSON to Car");
        System.out.println(car); 
        return car;
    }
    
    //toString and setters and getters
    @Override
    public String toString() {
        return "ParkingRequest{" + "commandName=" + commandName + ", json=" + json + '}';
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
    
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

}
