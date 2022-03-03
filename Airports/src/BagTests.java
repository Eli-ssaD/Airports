package Airports.src;
import static org.junit.Assert.*;

import org.junit.Test;

public class BagTests {
  @Test 
  public void test_weight() {
    try {
        Bag bag = new Bag(13);
      assertEquals(bag.getWeight(), 13);
  } catch (Exception err) {

  }
  }
  
  @Test
  public void test_weight_errors() throws Exception {
    Bag bag = new Bag(15);
    assertTrue(bag instanceof Bag);
  } 
  @Test
  public void test_with_no_weight_throws() throws Exception {
    assertThrows(Exception.class, () -> new Bag(0));
  }
  @Test
  public void test_error_message() throws Exception {
    try {
      new Bag(0);
    } catch(Exception error) {
      assertEquals(error.getMessage(), "Bag must have a positive weight");
    }
    }
  }
