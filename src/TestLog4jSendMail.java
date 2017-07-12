import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.net.SMTPAppender;

public class TestLog4jSendMail {
    static Logger logger=Logger.getLogger(TestLog4jSendMail.class);
    SMTPAppender appender=new SMTPAppender();

    public TestLog4jSendMail() {
        try{
            appender.setSMTPUsername("projectutil@163.com");
            appender.setSMTPPassword("my123456");
            appender.setTo("projectutil@163.com");
            appender.setFrom("projectutil@163.com");
            appender.setSMTPHost("smtp.163.com");
            appender.setLocationInfo(true);
            appender.setSubject("Test Mail From Log4j");
            appender.setLayout(new PatternLayout());
            appender.activateOptions();
            logger.addAppender(appender);
            logger.error("测试");
        }catch (Exception e){
            e.printStackTrace();
        }    }

    public static void main(String[] args) {
        new TestLog4jSendMail();
    }
}
