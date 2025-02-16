package session43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
	void testTitle() {
		String exp_title = "Opencart";
		String act_title ="Openshop";
		
	/*	if(exp_title.equals(act_title)) {
			System.out.println("tets Paases");
		}else {
			System.out.println("test failed");
		
*/
		
		Assert.assertEquals(exp_title, act_title);
	}
}
