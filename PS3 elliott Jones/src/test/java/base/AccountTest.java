package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import basepackage.Account;
import basepackage.InsufficientFundsException;

public class AccountTest {
	
	Account a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
			
	@Test(expected=InsufficientFundsException.class)
	public void testwithdraw() throws InsufficientFundsException {
		Account a = new Account(1122,20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		assertEquals((long)a.getBalance(),(long)0.00);
		a.deposit(3000);
		System.out.println(a.getBalance());
	}

}
