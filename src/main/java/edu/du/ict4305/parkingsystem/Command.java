package edu.du.ict4305.parkingsystem;

/**
 *
 * @author Ingrid
 */
public interface Command {
    
    public String getCommandName();
    public String getDisplayName();
    public String execute(String[] parameters);
    
}
