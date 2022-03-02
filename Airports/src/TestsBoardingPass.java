package Airports.src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestsBoardingPass {
    @Test
    public void hasSeatNumber() {
        BoardingPass pass = new BoardingPass(1,1);
        int row = pass.getSeat()[0];
        assertEquals(row, 1);

    }
    
}
