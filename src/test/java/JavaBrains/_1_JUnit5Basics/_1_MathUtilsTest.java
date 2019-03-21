/**
 * 
 */
package JavaBrains._1_JUnit5Basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Tousif
 *
 */
class _1_MathUtilsTest {

	/**
	 * Test method for {@link JavaBrains._1_JUnit5Basics._1_MathUtils#add(int, int)}.
	 */
	@Test
	void testAdd() {
		_1_MathUtils mathUtils = new _1_MathUtils();
		int expected = 14;
		int actual = mathUtils.add(7, 7);

//		assertEquals(expected, actual);
		/** Adding 3rd argument i.e, message :
		 *  Messgae will be thrown when assertEquals() fails */ 
		assertEquals(expected, actual, "The add() method should add two numbers");
		
	}

}
