package edu.du.ict4305.parkingsystem.charges.factory;

import edu.du.ict4305.parkingsystem.charges.strategy.StrategyWeekDay;

/**
 *
 * @author Ingrid
 */
public class StrategyFactoryWeekDay {
    
        public StrategyWeekDay getStrategy() {
        StrategyWeekDay weekDay = new StrategyWeekDay();
        return weekDay;        
    }
    
}
