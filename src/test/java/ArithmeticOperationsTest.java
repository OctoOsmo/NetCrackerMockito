import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by al on 24.11.2015.
 */
public class ArithmeticOperationsTest {

    Logger logger = LogManager.getLogger(ArithmeticOperationsTest.class);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddValue() throws Exception {
        logger.info("Adding one number to another");
        Integer b = ArithmeticOperations.addValue(2, 3);
        assertEquals((Integer)5, b);
    }
}