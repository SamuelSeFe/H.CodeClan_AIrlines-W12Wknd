public class CabinCrew extends Person{

    private CrewMemberRank rank;

    public CabinCrew(String name, CrewMemberRank rank){
        super(name);
        this.rank = rank;
    }

    public CrewMemberRank getRank() {
        return this.rank;
    }

    public String cabinCrewTalks(){
        return String.format("Good evening, I will be your %s. We hope you have a pleasant flight.", this.rank);
    }

}
