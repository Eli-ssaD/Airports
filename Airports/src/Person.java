package Airports.src;

public class Person {
    private String name;
    private BoardingPass boardingPass;

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setBoardingPass(BoardingPass pass) {
        this.boardingPass = pass;
    }
    public BoardingPass getBoardingPass() {
        return boardingPass;
    }
}
