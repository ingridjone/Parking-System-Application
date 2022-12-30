package edu.du.ict4305.parkingsystem;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Ingrid
 */
public class ParkingService {
    
    private ParkingOffice parkingOffice = new ParkingOffice();
    
    private Map<String, Command> commands = new TreeMap<>();
    
    
    public ParkingService() {
        
    }
    
    //Method that takes a command as parameter and adds it to the map of commands
    public void register(Command command){
        commands.put(command.getCommandName(), command);
        System.out.println("The command "+command.getCommandName()+" has been registered!");
    }
    
    //Method that takes the command name given, and extracts the command object from the Map, and calls for that command to be executed
    public String performCommand(String commandName, String[] parameters){
        Command c = commands.get(commandName);
        c.execute(parameters);
        String performCommand = "The command "+commandName+" has been performed!";
        return performCommand;
    }
    
}
