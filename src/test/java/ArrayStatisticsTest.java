/**
 * Created by al on 24.11.2015.
 */
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayStatisticsTest {

    private ArrayStatistic st = new ArrayStatistic();

    @Test
    public void testGetAverage() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        assertEquals((Integer)50, st.getAverage(list));
    }

    @Test
    public void testGetMax() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(-4);
        list.add(6);
        list.add(0);
        assertEquals((Integer)6, st.getMax(list));
    }

    @Test
    public void testGetMin() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(-4);
        list.add(6);
        list.add(0);
        assertEquals((Integer)(-4), st.getMin(list));
    }

    @Test
    public void testGetMinMockito() throws Exception {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayStatistic mock = mock(ArrayStatistic.class);
        when(mock.getMin(anyList())).thenReturn((Integer)42);
        assertEquals((Integer)42, mock.getMin(l));
    }
}
