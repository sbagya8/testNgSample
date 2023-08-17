package TestScript;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups="feature1")
  public void testOne() {
	  System.out.println("Sample test one ");
  }
  @Test
  public void testTwo() {
	  System.out.println("Sample test Two ");
  }
  @Test
  public void testThree() {
	  System.out.println("Sample test Three ");
  }
  @Test
  public void testFour() {
	  System.out.println("Sample test Four ");
  }
  
}
