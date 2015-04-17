package ExoticCarCustomz.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class AudioTechnicianTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testAudioTechnician() throws Exception {
        AudioTechnician technician = new AudioTechnician.Builder("Scholtz").FirstName("Shannon").build();
        Assert.assertEquals("Scholtz", technician.getLastName());

    }
}
