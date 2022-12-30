

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.du.ict4305.parkingsystem.charges.factory.StrategyFactoryProximity;
import edu.du.ict4305.parkingsystem.module.AppModule;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ingrid
 */
public class GuiceTest {

    @Test
    public void test() {
        
        Injector guice = Guice.createInjector(new AppModule());
        StrategyFactoryProximity strategy = guice.getInstance(StrategyFactoryProximity.class);
        
        strategy.getStrategy();   
     }
    
}
