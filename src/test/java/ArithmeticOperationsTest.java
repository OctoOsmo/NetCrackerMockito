import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by al on 24.11.2015.
 */
public class ArithmeticOperationsTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAddValue() throws Exception {
        Integer b = ArithmeticOperations.addValue(2, 3);
        assertEquals((Integer)5, b);
    }
}