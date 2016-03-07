package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

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

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void testgetPerimeter() {
		Triangle instance = new Triangle(2.0, 2.0, 2.0);
		double expectedresult = 6.0;
		double actualResult = instance.getPerimeter();
		assertEquals(expectedresult, actualResult, .05);
	}

	@Test
	public void testgetPerimeter2() {
		Triangle instance = new Triangle();
		double expectedresult = 3.0;
		double actualResult = instance.getPerimeter();
		assertEquals(expectedresult, actualResult, .05);
	}
	@Test
	public void testgetArea() {
		Triangle instance = new Triangle(5.0, 3.0, 7.0);
		double expectedresult = 6.4952;
		double actualResult = instance.getArea();
		assertEquals(expectedresult, actualResult, .05);
	}
	@Test
	public void testgetArea2() {
		Triangle instance = new Triangle();
		double expectedresult = .433;
		double actualResult = instance.getArea();
		assertEquals(expectedresult, actualResult, .05);
	}
}