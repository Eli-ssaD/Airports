package Airports.src;
import static org.junit.Assert.*;

import org.junit.Test;

public class BagTests {
  @Test 
  public void test_weight() {
      Bag bag = new Bag(13);
      assertEquals(bag.getWeight(), 13);
  } 
  @Test
  public void test_weight_errors() {
    Bag bag = new Bag(12);
    assertTrue(bag instanceof Bag);
  } 
}
