package edu.du.ict4305.parkingsystem.charges.factory;

import com.google.inject.Inject;
import edu.du.ict4305.parkingsystem.charges.strategy.StrategyProximity;

/**
 *
 * @author Ingrid
 */
public class StrategyFactoryProximity implements FactoryInterface {
    
    private final FactoryInterface factory;
    
    @Inject
    public StrategyFactoryProximity(FactoryInterface factory) {
        this.factory = factory;
    }
    
    public StrategyProximity getStrategy() {
        StrategyProximity proximity = new StrategyProximity();
        return proximity;
    }
    
    public void printTest(){
        System.out.println("Success");
    }

    
    
}
