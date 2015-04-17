package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class MechanicalPartsTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMechanicalParts() throws Exception {
        MechanicalParts mechparts = new MechanicalParts.Builder("Positive camber").Price(8099.99).build();
        Assert.assertEquals("Positive camber", mechparts.getDescription());

    }
}
