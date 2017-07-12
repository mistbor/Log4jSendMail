import org.apache.log4j.Logger;

/**
 * Created by ${MiaoYing} on 2017/7/12.
 */
public class TestLog4jSendMail2 {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(TestLog4jSendMail2.class);
        int i=0;
        while (i<6){
            i+=1;
            logger.error("Do you received message?");
        }
    }
}
