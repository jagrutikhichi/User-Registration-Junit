package userregistration;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();
	
	@Test
	public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
		 boolean result = userRegistration.validateFirstName("Jagruti");
		 Assert.assertTrue(result);
		}
	@Test
	public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Ja");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Jagr1");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("J@gruti");
		Assert.assertFalse(result);
	}
}