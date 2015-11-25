import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by al on 25.11.2015.
 */
public class FibGeneratorTest {

    private FibGenerator fb;

    @Before
    public void beforeTest(){
        this.fb = new FibGenerator();
    }

    @Test
    public void testGetFibNum() throws Exception {
        assertEquals((Integer)0, fb.getFibNum(0));
        assertEquals((Integer)1, fb.getFibNum(1));
        assertEquals((Integer)5, fb.getFibNum(5));
        assertEquals((Integer)4181, fb.getFibNum(19));
        assertEquals((Integer)832040, fb.getFibNum(30));
        assertEquals((Integer)39088169, fb.getFibNum(38));
    }

    @Test
    public void testGetFibSeq() throws Exception {
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
    }
}