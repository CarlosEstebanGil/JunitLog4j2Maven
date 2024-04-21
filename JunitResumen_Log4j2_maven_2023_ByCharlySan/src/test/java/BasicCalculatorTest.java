import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testJunit() {
		//fail("Not yet implemented");
		assertEquals(87.91622222222225d, 87.91622222222225d, 0.00000000001d);
	}
	@Test
	void testSumDoubleDouble() {
		
		BasicCalculator calc = new BasicCalculator();
		double x=0.0;
		try { 
			x = calc.sum(1.5d, 2.5d); 
		} 
		catch (Exception e) {	}
		
		assertEquals(4.0d, x);
	}

	@Test
	void testSumDouble() {
		fail("Not yet implemented");
	}

}
