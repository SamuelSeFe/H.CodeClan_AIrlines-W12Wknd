import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUS350);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane1.getType());
        assertEquals(PlaneType.AIRBUS350, plane2.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, PlaneType.BOEING747.getCapacity());
        assertEquals(30, PlaneType.AIRBUS350.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(1000, PlaneType.BOEING747.getTotalWeight());
        assertEquals(500, PlaneType.AIRBUS350.getTotalWeight());
    }

}
