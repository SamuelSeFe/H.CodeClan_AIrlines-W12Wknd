public class Pilot extends Person{

    private CrewMemberRank rank;
    private String pilotLicence;
    Plane plane;

    public Pilot(String name, CrewMemberRank rank, String pilotLicence){
        super(name);
        this.rank = rank;
        this.pilotLicence = pilotLicence;
    }

    public CrewMemberRank getRank(){
        return this.rank;
    }

    public String getPilotLicence(){
        return this.pilotLicence;
    }

    public String canFlyPlane(Plane plane){
        PlaneType planeType = plane.getType();
        return String.format("Good evening and welcome aboard this %s. This your %s speaking.", planeType, this.rank);
    }

}
