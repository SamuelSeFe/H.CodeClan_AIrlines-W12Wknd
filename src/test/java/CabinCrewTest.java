import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;

    @Before
    public void setUp(){
        cabinCrew1 = new CabinCrew("Emilia", CrewMemberRank.CAPTAIN);
        cabinCrew2 = new CabinCrew("Juan", CrewMemberRank.FIRST_OFFICER);
        cabinCrew3 = new CabinCrew("Alana", CrewMemberRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Emilia", cabinCrew1.getName());
        assertEquals("Juan", cabinCrew2.getName());
        assertEquals("Alana", cabinCrew3.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewMemberRank.CAPTAIN, cabinCrew1.getRank());
        assertEquals(CrewMemberRank.FIRST_OFFICER, cabinCrew2.getRank());
        assertEquals(CrewMemberRank.FLIGHT_ATTENDANT, cabinCrew3.getRank());
    }

    @Test
    public void canCabinCrewTalk(){
        assertEquals("Good evening, I will be your FLIGHT_ATTENDANT. We hope you have a pleasant flight.", cabinCrew3.cabinCrewTalks());
    }
}
