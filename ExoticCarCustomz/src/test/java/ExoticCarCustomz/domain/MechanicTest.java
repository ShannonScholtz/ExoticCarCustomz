package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class MechanicTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMechanic() throws Exception {
        Mechanic mech = new Mechanic.Builder("Rama").FirstName("Ethon").build();
        Assert.assertEquals("Ethon", mech.getFirstName());

    }
}
