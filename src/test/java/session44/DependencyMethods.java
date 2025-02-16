package session44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {


		
	@Test(priority=2)
	void openapp() {
		
		Assert.assertTrue(true);
	}

	@Test(priority=3, dependsOnMethods= {"openapp"})
	void login() {
		
		Assert.assertTrue(false);
		
	}

	@Test(priority=4,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(true);

		
	}

	@Test(priority=5,dependsOnMethods= {"login","search"})
	void advsearch() {
		Assert.assertTrue(true);

		
	}
	@Test(priority=6,dependsOnMethods= {"login"})

	void logout() {
		Assert.assertTrue(true);

		
	}


}
