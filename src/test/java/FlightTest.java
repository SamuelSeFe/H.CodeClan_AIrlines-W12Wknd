import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Plane plane1;
    Plane plane2;


    @Before
    public void setUp(){
        pilot1 = new Pilot("Alana", CrewMemberRank.CAPTAIN, "012345");
        pilot2 = new Pilot("Mattia", CrewMemberRank.FIRST_OFFICER, "067890");
        ArrayList<Pilot> testPilotList = new ArrayList<>();
        testPilotList.add(pilot1);
        testPilotList.add(pilot2);


        cabinCrew1 = new CabinCrew("Emilia", CrewMemberRank.CAPTAIN);
        cabinCrew2 = new CabinCrew("Juan", CrewMemberRank.FIRST_OFFICER);
        cabinCrew3 = new CabinCrew("Alana", CrewMemberRank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrew> testCabinCrewList = new ArrayList<>();
        testCabinCrewList.add(cabinCrew1);
        testCabinCrewList.add(cabinCrew2);
        testCabinCrewList.add(cabinCrew3);


        passenger1 = new Passenger("Keith", 2);
        passenger2 = new Passenger("Mar", 2);
        passenger3 = new Passenger("James", 1);
        passenger4 = new Passenger("Colette", 1);
        passenger5 = new Passenger("Ben", 2);
        passenger6 = new Passenger("Bruno", 1);
        passenger7 = new Passenger("Tony", 1);
        ArrayList<Passenger> testPassengerList = new ArrayList<>();
        testPassengerList.add(passenger1);
        testPassengerList.add(passenger2);
        testPassengerList.add(passenger3);
        testPassengerList.add(passenger4);
        testPassengerList.add(passenger5);
        testPassengerList.add(passenger6);


        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUS350);
        ArrayList<Plane> testPlaneList = new ArrayList<>();
        testPlaneList.add(plane1);


        flight1 = new Flight(testPilotList, testCabinCrewList, testPassengerList, testPlaneList, "FR666", "EDI", "CIA", "06:00");

    }

    @Test
    public void canGetNumOfFlightMembers(){
        assertEquals(2, flight1.hasNumberOfPilots());
        assertEquals(3, flight1.hasNumberOfCabinCrew());
        assertEquals(6, flight1.hasNumberOfPassengers());
        assertEquals(1, flight1.hasNumberOfPlanes());
    }

    @Test
    public void canGetAllMembersOfFlightAtIndex(){
        assertEquals(pilot1, flight1.hasPilotAtIndex(0));
        assertEquals(pilot2, flight1.hasPilotAtIndex(1));
        assertEquals(cabinCrew1, flight1.hasCabinCrewAtIndex(0));
        assertEquals(cabinCrew2, flight1.hasCabinCrewAtIndex(1));
        assertEquals(cabinCrew3, flight1.hasCabinCrewAtIndex(2));
        assertEquals(passenger1, flight1.hasPassengerAtIndex(0));
        assertEquals(passenger2, flight1.hasPassengerAtIndex(1));
        assertEquals(passenger3, flight1.hasPassengerAtIndex(2));
        assertEquals(passenger4, flight1.hasPassengerAtIndex(3));
        assertEquals(passenger5, flight1.hasPassengerAtIndex(4));
        assertEquals(passenger6, flight1.hasPassengerAtIndex(5));
        assertEquals(plane1, flight1.hasPlaneAtIndex(0));
    }

    @Test
    public void canGetFlightDetails(){
        assertEquals("FR666", flight1.hasFlightNumber());
        assertEquals("EDI", flight1.hasDepartureLocation());
        assertEquals("CIA", flight1.hasDestinationLocation());
        assertEquals("06:00", flight1.hasDepartureTime());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(44, flight1.hasAvailableSeats());
    }

    @Test
    public void canAddPassengerIfSeatsAvailable(){
        flight1.bookPassengerIfAvailableSeats(passenger7);
        assertEquals(7, flight1.hasNumberOfPassengers());
    }

}
