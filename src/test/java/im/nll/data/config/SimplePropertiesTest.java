package im.nll.data.config;

import org.junit.Test;

import java.util.Properties;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 2019/4/18 10:38 AM
 */
public class SimplePropertiesTest {
    @Test
    public void readConfTest() {
        SimpleProperties simpleProperties = SimpleProperties.readConfiguration("redis.properties");
        Properties configuration = simpleProperties.getUnderlyingProperties();
        System.out.println(configuration);
    }
}
