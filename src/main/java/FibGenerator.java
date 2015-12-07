import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.ArrayList;

/**
 * Created by al on 24.11.2015.
 */
public class FibGenerator {

    final Logger logger = LogManager.getLogger(FibGenerator.class);
    final Marker mainLog = MarkerManager.getMarker("main_log");

    Integer prev = 1, prev2 = 0, iter = 0;

    public void reset(){
        prev = 1;
        prev2 = 0;
        iter = 0;
    }

    public Integer getNextNum() {
        Integer result = 0;
        if (0 == iter)
            result = 0;
        else if (1 == iter)
            result = 1;
        else {
            result = prev + prev2;
            prev2 = prev;
            prev = result;
        }
        String msg = "current iter = " + iter + " fibNum = " + result;
        logger.debug(mainLog, msg);
        iter++;
        return result;
    }

    public Integer getFibNum(Integer n) {
        logger.debug(mainLog, "Entering method");
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
        logger.debug(mainLog, "Leaving method");
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
