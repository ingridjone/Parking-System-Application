package edu.du.ict4305.parkingsystem;

/**
 *
 * @author Ingrid
 */
public class RegisterCarCommand implements Command {
    
    private ParkingOffice parkingOffice = new ParkingOffice();
    
    public RegisterCarCommand(){
        
    }
    
    public String getCommandName() {
        String commandName = "registerCar";
        System.out.println(commandName);
        return commandName;
    }

    public String getDisplayName() {
        String displayName = "Register Car";
        System.out.println(displayName);
        return displayName;
    }

    //The method takes 10 parameters and breaks them down into the different variables that the Parking Office stores
    public String execute(String[] parameters) {
        Customer customer = new Customer(parameters[0], parameters[1], parameters[2], new Address(parameters[3], parameters[4], parameters[5], parameters[6], parameters [7]));
        String license = parameters[8];
        CarType carType = CarType.COMPACT;
        String permitId = parameters[9];
        parkingOffice.register(customer, license, carType, permitId);
        String execute = "The car with the license "+license+" has been registered!";
        System.out.println(execute);
        return execute;
    }
}
