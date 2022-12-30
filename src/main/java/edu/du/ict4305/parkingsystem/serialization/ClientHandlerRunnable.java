package edu.du.ict4305.parkingsystem.serialization;

/**
 *
 * @author Ingrid
 */
public class ClientHandlerRunnable implements Runnable {
    
    //Assignment prompt: Make the client-handler method a Runnable
    //Assignment prompt: Add code to measure and report client handling time to the application
    @Override
    public void run(){
        
        //Implementation of a timer using the nanoTime method
        //Start the timer
        long startTime = System.nanoTime();
        
        //Stop the timer
        long endTime = System.nanoTime();
        
         //Calculate the execution  time
         long executionTime = endTime - startTime;
         System.out.println("Excution time: "+executionTime+" nanoseconds.");
         System.out.println("Execution time: "+((double)executionTime/1_000_000_000)+" seconds.");
        
    }
}
