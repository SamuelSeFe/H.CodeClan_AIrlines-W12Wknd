import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Samuel", 2);
        passenger2 = new Passenger("Mattia", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Samuel", passenger1.getName());
        assertEquals("Mattia", passenger2.getName());
    }

    @Test
    public void hasNumOfBags(){
        assertEquals(2, passenger1.getNumOfBags());
        assertEquals(1, passenger2.getNumOfBags());
    }

}
