package session43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
@Test
void test_hardassertions() {
	System.out.println("testting...");
	System.out.println("testing....");
	
	Assert.assertEquals(1, 2); //Hard Assertion
	
	System.out.println("testing....");
	System.out.println("testing....");
	
}


@Test
void test_softassertions() {
	System.out.println("testting...");
	System.out.println("testing....");
SoftAssert sa = new SoftAssert();

     sa.assertEquals(1, 2); //Hard Assertion
	
	System.out.println("testing....");
	System.out.println("testing....");
	
	
	sa.assertAll();
	
}
}
