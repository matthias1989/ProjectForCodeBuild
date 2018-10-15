package nl.cavero;

import org.junit.Before;
import org.junit.Test;



import org.junit.Assert;


public class HelloAppTest {

	@Before
	public void beforeMethod() {
		
	}
	
	@Test
	public void testMethod() {
		Integer result = HelloApp.sum(2, 3);
		Assert.assertEquals(new Integer(5), result);
	}
}
