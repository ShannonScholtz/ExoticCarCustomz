package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class CarTest {

        @Before
        public void setUp() throws Exception {


        }

        @Test
        public void testCar() throws Exception {
            Car car = new Car.Builder("23445VWGTI6").make("VW").model("Golf 6").year("2014").build();
            Assert.assertEquals("2014", car.getYear());

        }
}

