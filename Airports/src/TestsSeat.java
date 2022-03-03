package Airports.src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsSeat {
    @Test
    public void aPersonCanBeAllocatedASeatNumber(){
        seatNumber seatNumber = new seatNumber();
        assertEquals(seatNumber.getSeatNumber(), seatNumber);
    
    }
}
    