package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class CustomerTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCustomer() throws Exception {
        Customer cust = new Customer.Builder("0612323276").LastName("Simons").FirstName("Edmund").Address("5 Petersburg drive Chicago").build();
        Assert.assertEquals("5 Petersburg drive Chicago",cust.getAddress());

    }
}
