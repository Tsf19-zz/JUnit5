/**
 * 
 */
package Scorable2;

//import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Tousif
 *
 */
public class ScoreCollectionTest {

	@Test
//	@Ignore("Don't forget me")
	public void answersArithmeticMeanOfTwoNumbers() {
	
		ScoreCollection collection = new ScoreCollection();
		
		// Arrange
		collection.add(() -> 5);
		collection.add(() -> 7);

		//Act
		int actualResult = collection.arithmeticMean();
		
		//Assert
		/**
		 * To use the equalTo matcher, make sure you use a
		 * static import for org.ham-crest.CoreMatchers 
		 */
		assertThat(actualResult, equalTo(6));
		
	}

}
