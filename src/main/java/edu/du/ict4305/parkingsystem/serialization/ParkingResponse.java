package edu.du.ict4305.parkingsystem.serialization;

import com.google.gson.Gson;
import edu.du.ict4305.parkingsystem.Car;
import edu.du.ict4305.parkingsystem.Customer;

/**
 *
 * @author Ingrid
 */
public class ParkingResponse {
    
    //Status code indicates the success of the method
    //Message describes what is happening on the back-end
    private int statusCode;
    private String message;
    
    //Constructors
    public ParkingResponse() {
    }
    
    public ParkingResponse(Customer customer) {
    }
    
    public ParkingResponse(Car car) {
    }
    
    public ParkingResponse(String json) {
    }
    
    //I've created two use cases for the conversion: a Customer and a Car object
    public ParkingResponse convertCustomerToJSON(Customer customer) {
        Gson gson = new Gson();
        String customerToJSON = gson.toJson(customer);
        //Generates a ParkingResponse
        ParkingResponse response = new ParkingResponse(customerToJSON);
        response.setMessage("The Customer object has been converted into a JSON String!");
        //HTTP Status Code 200 means Success
        response.setStatusCode(200);
        System.out.println(response);
        return response;
    }
    
    public ParkingResponse convertCarToJSON(Car car) {
        Gson gson = new Gson();
        String carToJSON = gson.toJson(car);
        ParkingResponse response = new ParkingResponse(carToJSON);
        response.setMessage("The Car object has been converted into a JSON String!");
        response.setStatusCode(200);
        System.out.println(response);
        return response;
    }
    
    public ParkingResponse convertJSONToCustomer(String json) {
        Gson gson = new Gson();
        //Converts JSON into Customer object
        Customer customer = gson.fromJson(json, Customer.class);
        //Generates a ParkingResponse
        ParkingResponse response = new ParkingResponse(customer);
        response.setMessage("The JSON string has been converted into a Customer object!");
        response.setStatusCode(200);
        System.out.println(response);
        return response;
    }
    
    //Converts JSON Strings into Car objects
    public Car convertJSONToCar(String json) {
        Gson gson = new Gson();
        Car car = gson.fromJson(json, Car.class);
        ParkingResponse response = new ParkingResponse(car);
        response.setMessage("The JSON string has been converted into a Car object!");
        response.setStatusCode(200);
        System.out.println(car);
        return car;
    }

    //toString and setters and getters
    @Override
    public String toString() {
        return "ParkingResponse{" + "statusCode=" + statusCode + ", message=" + message + '}';
    }
    
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
