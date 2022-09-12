import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;
    Plane plane;

    @Before
    public void setUp() {
        pilot1 = new Pilot("Alana", CrewMemberRank.CAPTAIN, "012345");
        pilot2 = new Pilot("Mattia", CrewMemberRank.FIRST_OFFICER, "067890");
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasName(){
        assertEquals("Alana", pilot1.getName());
        assertEquals("Mattia", pilot2.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewMemberRank.CAPTAIN, pilot1.getRank());
        assertEquals(CrewMemberRank.FIRST_OFFICER, pilot2.getRank());
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("012345", pilot1.getPilotLicence());
        assertEquals("067890", pilot2.getPilotLicence());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Good evening and welcome aboard this BOEING747. This your CAPTAIN speaking.", pilot1.canFlyPlane(plane));
    }
}
