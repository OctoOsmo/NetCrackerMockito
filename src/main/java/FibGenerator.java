import java.util.ArrayList;

/**
 * Created by al on 24.11.2015.
 */
public class FibGenerator {

    public Integer getFibNum(Integer n) {
        Integer result = null;
        if (0 == n)
            result = 0;
        else if (1 == n)
            result = 1;
        else
        {
            Integer pp = 0, p = 1, curr = null;
            for (int i = 2; i <= n; i++) {
                curr = p + pp;
                pp = p;
                p = curr;
            }
            result = curr;
        }
        return result;
    }

    public ArrayList<Integer> getFibSeq(Integer n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i = 2; i <= n; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }
        return result;
    }
}
