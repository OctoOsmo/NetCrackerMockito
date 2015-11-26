import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by al on 25.11.2015.
 */
public class FibGeneratorTest {

    private FibGenerator fb;
    private org.apache.logging.log4j.Logger logger;

    @Before
    public void beforeTest() {
        this.fb = new FibGenerator();
        logger = LogManager.getLogger(FibGeneratorTest.class);
    }

    @Test
    public void testGetFib0() throws Exception {
        logger.info("Entering method");
        assertEquals((Integer)0, fb.getFibNum(0));
        logger.info("Leaving method");
    }

    @Test
    public void testGetFib1() throws Exception {
        assertEquals((Integer)1, fb.getFibNum(1));
    }

    @Test
    public void testGetFib5() throws Exception {
        assertEquals((Integer)5, fb.getFibNum(5));
    }

    @Test
    public void testGetFib19() throws Exception {
        assertEquals((Integer)4181, fb.getFibNum(19));
    }

    @Test
    public void testGetFib30() throws Exception {
        assertEquals((Integer)832040, fb.getFibNum(30));
    }

    @Test
    public void testGetFib38() throws Exception {
        assertEquals((Integer)39088169, fb.getFibNum(38));
    }

    @Test
    public void testGetFibSeq() throws Exception {
        logger.info("Entering method");
        ArrayList<Integer> f1 = new ArrayList<>();
        f1.add(0);
        f1.add(1);
        f1.add(1);
        f1.add(2);
        f1.add(3);
        f1.add(5);
        f1.add(8);
        f1.add(13);
        f1.add(21);
        ArrayList<Integer> f2 = fb.getFibSeq(8);
        assertArrayEquals(f1.toArray(), f2.toArray());
        logger.info("Leaving method");
    }

    @Test
    public void testFibNumSeqMockito() throws Exception {
        ArrayList<Integer> l = new ArrayList<>();
        FibGenerator mockFib = mock(FibGenerator.class);
        for (int i = 0; i < 30; i++) {

        }
        assertEquals(1,1);
    }

    @Test
    public void testGetNextNum() throws Exception {
        ArrayList<Integer> l = new ArrayList<>();
        FibGenerator Gen = new FibGenerator();
        for (int i = 0; i <= 42; i++) {
            l.add(Gen.getNextNum());
        }
        assertArrayEquals(l.toArray(), Gen.getFibSeq(42).toArray());
    }

    @Test
    public void testGetNextNumMockito() throws Exception {
        logger.debug("Entering method");
        ArrayList<Integer> l = new ArrayList<>();
        FibGenerator MockGen = mock(FibGenerator.class);
        FibGenerator FibGen = new FibGenerator();
        when(MockGen.getNextNum()).thenReturn(0).thenReturn(1).thenReturn(1).thenReturn(2).thenReturn(3);
        for (int i = 0; i <= 4; i++) {
            l.add(MockGen.getNextNum());
            String msg = "Mock generated num = " + l.get(l.size() - 1);
            logger.debug(msg);
        }
        assertArrayEquals(l.toArray(), FibGen.getFibSeq(4).toArray());
        logger.debug("Leaving method");
    }
}