import java.util.ArrayList;
import java.util.List;

/**
 * Created by al on 24.11.2015.
 */
public class ArrayStatistic {

    public static Integer getAverage(List<Integer> l){
        Integer sum = 0;
        for (Integer i : l) {
            sum += i;
        }
        return sum / l.size();
    }

    public static Integer getMax(List<Integer> l){
        Integer max = Integer.MIN_VALUE;
        for (Integer i : l) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static Integer getMin(List<Integer> l)
    {
        Integer min= Integer.MAX_VALUE;
        for (Integer i : l) {
            if (i < min)
                min = i;
        }
        return min;

    }
}
