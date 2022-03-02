package Airports.src;

public class Plane {
    //private String type;
    private Seat[] seats;

    public Plane(String type) {
        //this.type = type;
        this.seats = new Seat[10];
        this.seats[0] = new Seat();
        this.seats[1] = new Seat();
        this.seats[2] = new Seat();
        this.seats[3] = new Seat();
        this.seats[4] = new Seat();
        this.seats[5] = new Seat();
        this.seats[6] = new Seat();
        this.seats[7] = new Seat();
        this.seats[8] = new Seat();
        this.seats[9] = new Seat();
    }

    public Seat[] getSeat() {
        return this.seats;
    }

    public void checkIn(Person person) {
        for (Seat seats : this.seats) {
            if (seats.isEmpty(0)) {
                seats.addPerson(person);
                break;
            }
        }
    }

}
