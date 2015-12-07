//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

/**
 * Created by al on 23.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        org.apache.logging.log4j.Logger logger = LogManager.getLogger(Main.class);
//        Logger logger2 = LogManager.getLogger(Main.class);
        logger.error("Imaginary Error");
        System.out.println("end");
    }
}
