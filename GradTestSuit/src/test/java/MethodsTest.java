import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MethodsTest {

    Methods methods;

    @Before
    public void instantiateMethods() {
        methods = new Methods();
    }

    @Test
    public void testGetString() {
        assertEquals("Hello!", Methods.getString());
    }
    @Test
    public void TestMin(){
        assertEquals((Object)40, Methods.min());
    }
    @Test
    public void TestMax(){
        assertEquals((Object)50, Methods.max());
    }
    @Test
    public void testHomework(){
        assertEquals("result", methods.homeWork());
    }
}

