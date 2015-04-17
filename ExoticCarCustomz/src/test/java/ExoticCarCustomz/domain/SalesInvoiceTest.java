package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class SalesInvoiceTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSalesInvoice() throws Exception {
        SalesInvoice invoice = new SalesInvoice.Builder(2345545)
                .date("5 May 2015").CarID(2576015).customerID(0505154544).totalPrice(12599.99).build();
        Assert.assertEquals(2576015, invoice.getCarID());

    }
}
