package Airports.src;

public class Seat {
    private String seatNumber = "seatNumber";
    private String passenger = "passenger";

    public Seat (Passenger, seatNumber) {

        this.seatNumber = seatNumber;
    }
        
    public String getPassenger() {
        return passenger;
    }

    public void setPerson(String passenger) {
        this.passenger = passenger;
    }

    public String getseatNumber() {
        return seatNumber;
    }

    public void addPassenger(Passenger passenger) {
    }

    //public boolean isEmpty(int i) {
        //return false;
    }
//}
    