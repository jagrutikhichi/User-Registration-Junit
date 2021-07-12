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

	@Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
		boolean result = userRegistration.validateLastName("Khichi");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() {
		boolean result = userRegistration.validateLastName("Kh");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Khichi1");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
		boolean result = userRegistration.validateFirstName("Kh!ch!");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.validateEmailId("abc.syz@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue() {
		boolean result = userRegistration.validateMobileNum("91 9960077482");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
		boolean result = userRegistration.validateMobileNum("919960077482");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
		boolean result = userRegistration.validateMobileNum("9960077482");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
		boolean result = userRegistration.validateMobileNum("1234507748");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
		boolean result = userRegistration.validatePassword("nDj1k2*jf");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
		boolean result = userRegistration.validatePassword("3Rmdg*nK");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
		boolean result = userRegistration.validatePassword("Mas1bt&Bx");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
		boolean result = userRegistration.validatePassword("mDkk%fDB");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
		boolean result = userRegistration.validatePassword("mDkk%fD1");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
		boolean result = userRegistration.validatePassword("mDkkfD12");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
		boolean result = userRegistration.validatePassword("mDkk%f#D1");
		Assert.assertTrue(result);
	}

}