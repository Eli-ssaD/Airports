package Airports.src;

public class Seat {
    private String seatNumber = "seatNumber";
    private String person = "person";

    //public Seat (Person, seatNumber){

       // this.seatNumber = seatNumber;
    //}
    
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getseatNumber() {
        return seatNumber;
    }

    public void addPerson(Person person) {
    }

    public boolean isEmpty(int i) {
        return false;
    }
}
    