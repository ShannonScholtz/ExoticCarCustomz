package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class SprayPainterTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSprayPainter() throws Exception {
        SprayPainter painter = new SprayPainter.Builder("Zeeman").FirstName("Rudy").build();
        Assert.assertEquals("Zeeman", painter.getLastName());

    }
}
