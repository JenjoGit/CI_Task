//Zusammenarbeit zwischen Phil Drexler, Robin Bisanz, Jens Herdtfelder

import org.junit.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertTrue(PrimeCheck.isPrime(3));
    assertTrue(PrimeCheck.isPrime(5));
    assertTrue(PrimeCheck.isPrime(7));
    assertTrue(PrimeCheck.isPrime(11));
    assertTrue(PrimeCheck.isPrime(13));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertFalse(PrimeCheck.isPrime(4));
    assertFalse(PrimeCheck.isPrime(6));
    assertFalse(PrimeCheck.isPrime(120));
    assertFalse(PrimeCheck.isPrime(36));
    assertFalse(PrimeCheck.isPrime(15));
    assertFalse(PrimeCheck.isPrime(25));
    assertFalse(PrimeCheck.isPrime(49));
  }
}
