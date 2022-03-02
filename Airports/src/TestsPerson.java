package Airports.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsPerson {
    @Test
    public void aPersonHasAName() {
        Person person = new Person("Bob");
        assertEquals(person.getName(), "Bob");
    }
    @Test
    public void aPersonCanHaveABoardingPass() {
        Person person = new Person("Bob");
        BoardingPass pass = new BoardingPass(1,1);
        assertNull(person.getBoardingPass());
        person.setBoardingPass(pass);
        assertSame(person.getBoardingPass(), pass);
    }
}
