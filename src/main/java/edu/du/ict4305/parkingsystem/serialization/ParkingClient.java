package edu.du.ict4305.parkingsystem.serialization;

import edu.du.ict4305.parkingsystem.Car;
import edu.du.ict4305.parkingsystem.Customer;

/**
 *
 * @author Ingrid
 */
public class ParkingClient {
    
    //Constructor
    public ParkingClient() {
        
    }
    
    public ParkingResponse generateParkingResponse(ParkingRequest request, Customer customer, Car car) {
        
        //Generates a ParkingRequest object
        ParkingRequest json = request.convertCustomerToJSON(customer);
        
        //Stores JSON String into a ParkingResponse object
        ParkingResponse response = new ParkingResponse(json.toString());
        response.convertCustomerToJSON(customer);
        
        return response;
    }
}
