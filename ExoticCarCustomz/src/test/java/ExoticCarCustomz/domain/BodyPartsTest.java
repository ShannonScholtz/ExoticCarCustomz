package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class BodyPartsTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testBodyParts() throws Exception {
        BodyParts body = new BodyParts.Builder("Side-Skirts").Colour("Ferrari Red").Price(10999.99).build();
        Assert.assertEquals("Ferrari Red", body.getColour());

    }
}
