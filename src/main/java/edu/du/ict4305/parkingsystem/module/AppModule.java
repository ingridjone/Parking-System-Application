package edu.du.ict4305.parkingsystem.module;

import com.google.inject.AbstractModule;
import edu.du.ict4305.parkingsystem.charges.factory.FactoryInterface;
import edu.du.ict4305.parkingsystem.charges.factory.StrategyFactoryProximity;

/**
 *
 * @author Ingrid
 */
public class AppModule extends AbstractModule {
        
   @Override
    protected void configure(){
        bind(FactoryInterface.class ).to(StrategyFactoryProximity.class);
    }
    
}
