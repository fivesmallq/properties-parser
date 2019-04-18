package im.nll.data.config;

import org.junit.Assert;
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
        SimpleProperties props = SimpleProperties.readConfiguration("system.properties");
        Properties configuration = props.getUnderlyingProperties();
        System.out.println(configuration);
        Assert.assertEquals("https://github.com/fivesmallq/simple-properties", props.getStringProperty("base_url"));
        Assert.assertEquals("UTF-8", props.getStringProperty("MYSQL_CHARSET"));
        Assert.assertEquals("中文测试", props.getStringProperty("test.zh"));
    }
}
