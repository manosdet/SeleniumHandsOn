package session43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
@Test
void test() {
//	Assert.assertEquals("xyz", "xyz");
	//Assert.assertEquals("abc",123);
	
	Assert.assertNotEquals(123, 123);  //fail
	Assert.assertNotEquals(123, 232); //pass
	
	
}
}
