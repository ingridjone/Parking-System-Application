package edu.du.ict4305.parkingsystem;

/**
 *
 * @author Ingrid
 */
public class RegisterCustomerCommand implements Command {
    
    private ParkingOffice parkingOffice = new ParkingOffice();
    
    public RegisterCustomerCommand(){
        
    }
    
    public String getCommandName() {
        String commandName = "registerCustomer";
        System.out.println(commandName);
        return commandName;
    }

    public String getDisplayName() {
        String displayName = "Register Customer";
        System.out.println(displayName);
        return displayName;
    }

    //The method takes 8 parameters and breaks them down into the different variables that the Parking Office stores
    public String execute(String[] parameters) {
        String name = parameters[0];
        Address address = new Address(parameters[1], parameters[2], parameters[3], parameters[4], parameters [5]);
        String phoneNumber = parameters[6];
        String customerId = parameters[7];
        parkingOffice.register(name, address, phoneNumber, customerId);
        String execute = "The customer "+name+" has been registered!";
        System.out.println(execute);
        return execute;
    }
    
}
