package Airports.src;

public class BoardingPass {
    private int row;
    private int seat;

    public BoardingPass(int row, int seat) {

        this.row = row;
        this.seat = seat;
    }

    public int[] getSeat() {
        return new int[] { row, seat };
    }
}
