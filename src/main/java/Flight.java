import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger> passengerList;
    private ArrayList<Plane> planeList;
    private String flightNumber;
    private String destinationLocation;
    private String departureLocation;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilotList, ArrayList<CabinCrew> cabinCrewList, ArrayList<Passenger> passengerList, ArrayList<Plane> planeList, String flightNumber, String departureLocation, String destinationLocation, String departureTime){
        this.pilotList = pilotList;
        this.cabinCrewList = cabinCrewList;
        this.passengerList = passengerList;
        this.planeList = planeList;
        this.flightNumber = flightNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureTime = departureTime;
    }

    public int hasNumberOfPilots(){
        return this.pilotList.size();
    }

    public int hasNumberOfCabinCrew(){
        return this.cabinCrewList.size();
    }

    public int hasNumberOfPassengers(){
        return this.passengerList.size();
    }

    public int hasNumberOfPlanes(){
        return this.planeList.size();
    }

    public Pilot hasPilotAtIndex(int index){
        return this.pilotList.get(index);
    }

    public CabinCrew hasCabinCrewAtIndex(int index){
        return this.cabinCrewList.get(index);
    }

    public Passenger hasPassengerAtIndex(int index){
        return this.passengerList.get(index);
    }

    public Plane hasPlaneAtIndex(int index){
        return this.planeList.get(index);
    }

    public String hasFlightNumber(){
        return this.flightNumber;
    }

    public String hasDestinationLocation(){
        return this.destinationLocation;
    }

    public String hasDepartureTime(){
        return this.departureTime;
    }

    public String hasDepartureLocation(){
        return this.departureLocation;
    }

    public int hasNumOfSeats(PlaneType planeType){
        return planeType.getCapacity();
    }

    public int hasAvailableSeats() {
        int availableSeats = 0;
        int seatsOfPlane = planeList.get(0).getType().getCapacity();
        if (this.hasNumberOfPassengers() < seatsOfPlane) {
            availableSeats = seatsOfPlane - this.hasNumberOfPassengers();
        }
        return availableSeats;
    }

    public void bookPassengerIfAvailableSeats(Passenger passenger){
        if (hasAvailableSeats() > 0){
            this.passengerList.add(passenger);
        }
    }

}
