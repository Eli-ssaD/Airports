package Airports.src;

public class Plane {

    Passenger[][] seats = {
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null},
    };

            public Boolean isSeatEmpty(BoardingPass bPass) {
                int row = bPass.getSeat()[0];
                int seat = bPass.getSeat()[1];
                return this.seats[row][seat] == null;
            }
            public void boardPassenger(Passenger passenger) {
                int row = passenger.getBoardingPass().getSeat()[0];
                int seat = passenger.getBoardingPass().getSeat()[1];
                this.seats[row][seat] = passenger;

            }
        }

