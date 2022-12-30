package edu.du.ict4305.parkingsystem.serialization;

import edu.du.ict4305.parkingsystem.Car;
import edu.du.ict4305.parkingsystem.Customer;

/**
 *
 * @author Ingrid
 */
public class ParkingServer {
    
    //Constructor
    public ParkingServer(){
        
    }
    
    //This is the client-handler method
    public ParkingResponse generateJSONResponse(String instructions, Customer customer, Car car) {
        
        //Assingment prompt: Make the Server create a new thread for each request using the Runnable 
        ClientHandlerRunnable runnable = new ClientHandlerRunnable();
        Thread t = new Thread(runnable);
        t.start();
        
        //Constructs a ParkingRequest
        ParkingRequest request = new ParkingRequest();
        
        //Method reads any of the two available instructions:
        //1. Convert Customer to JSON
        //2. Convert Car to JSON
        if (instructions.equalsIgnoreCase("Convert Customer to JSON")) {
            request.convertCustomerToJSON(customer);
            ParkingResponse response = new ParkingResponse(customer);
            
            //Returns a ParkingResponse object as a JSON String
            return response;
        }
        
        if (instructions.equalsIgnoreCase("Convert Car to JSON")) {
            request.convertCarToJSON(car);
            ParkingResponse response = new ParkingResponse(car);
            
            //Returns a ParkingResponse object as a JSON String
            return response;
            
        } else {
            System.out.println("Command not recognized.");
            ParkingResponse response = new ParkingResponse();
            
            //Returns "null" ParkingResponse
            return response;
        }
    }
}
