package session44;

import org.testng.annotations.Test;

public class PaymentTest {


	@Test(priority=1,groups={"regression","sanity","functional"})
	void paymentinRupees() {
		System.out.println("payment in rupees...");
	}

	@Test(priority=1,groups={"regression","sanity"})
	void paymentinDollars() {
		System.out.println("payment in rupees...");
	}
}

