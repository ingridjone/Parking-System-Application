
package edu.du.ict4305.parkingsystem.charges.factory;

import edu.du.ict4305.parkingsystem.charges.strategy.StrategyProximity;

/**
 *
 * @author Ingrid
 */
public interface FactoryInterface {
    
    StrategyProximity getStrategy();
    
}
