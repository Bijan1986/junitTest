import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	private Demo demo;
	
	
	@Before
	public void setUp() throws Exception {
		demo = new Demo("test", "case");
		System.out.println("initializing before each"); 
		
	}
	
	@BeforeClass 
	public static void beforeVal() {
		System.out.println("initializing before all...");
	}
	@After
	public void afterVal() {
		System.out.println("initializing after each ...");
	}
	@AfterClass
	public static void afterAll() {
		System.out.println("initializing after all...");
	}

	

	@Test
	public void testLength() {
		assertEquals(8, demo.lengthOfString());
		assertNotNull(demo.getS1(),"value is not null");
	}
	
	@Test
	public void testFalseAndTrue() {
		assertFalse(demo.getS1().length()<1);
	}
	
	@Test
	public void testArgs() {
		assertTrue(demo.getS1().length()>0);
		assertTrue(demo.getS2().length()>0);
	}
	
//	@ParameterizedTest
//	public void testArgs2() {
//		assertTrue(demo.getS1().length()>0);
//		assertTrue(demo.getS2().length()>0);
//	}
	
	

}
