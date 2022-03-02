package Airports.src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsSeat {
    @Test
    public void aPersonCanBeAllocatedASeatNumber(){
        SeatNumber seatNumber = new SeatNumber();
        assertEquals(seatNumber.getSeatNumber(), seatNumber);
    
    }
}
    