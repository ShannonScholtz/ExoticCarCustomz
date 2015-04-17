package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class SalespersonTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSalesperson() throws Exception {
        Salesperson salesperson = new Salesperson.Builder("Daries").FirstName("Beatrix").build();
        Assert.assertEquals("Beatrix", salesperson.getFirstName());

    }
}
