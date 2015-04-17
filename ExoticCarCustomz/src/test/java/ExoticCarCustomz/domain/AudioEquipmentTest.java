package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class AudioEquipmentTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testAudioEquipment() throws Exception {
        AudioEquipment equipment = new AudioEquipment.Builder("6x9's").Price(599.99).build();
        Assert.assertEquals("6x9's",equipment.getDescription());

    }
}
