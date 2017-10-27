package mock;

import static org.mockito.Mockito.when;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;
import mock.CalcImplementation;
import mock.CalcInterface;

public class CalcImplementationTest extends TestCase {

	CalcImplementation calcImplementation;
	int a, b;
	protected void setUp() throws Exception {
		calcImplementation = new CalcImplementation();
		a = 10;
		b = 5;
		
		CalcInterface mockInterface = mock(CalcInterface.class);
		when(mockInterface.add(a, b)).thenReturn(a + b);
		when(mockInterface.subtract(a, b)).thenReturn(a-b);
		when(mockInterface.multiply(a, b)).thenReturn(a*b);
		when(mockInterface.divide(a, b)).thenReturn((double) (a/b));

		calcImplementation.setCalcInterface(mockInterface);	
	}

	protected void tearDown() throws Exception {
	}

	public void testAddTwoNums() {
		assertEquals(15, calcImplementation.addTwoNums(a, b));
	}
	
	public void testSubtractTwoNums() {
		assertEquals(5, calcImplementation.subtractTwoNums(a, b));
	}
	
	public void testDivideTwoNums() {
		assertEquals(2.0, calcImplementation.divideTwoNums(a, b));
	}
	
	public void testMultiplyTwoNums() {
		assertEquals(50, calcImplementation.multiplyTwoNums(a, b));
	}

}
