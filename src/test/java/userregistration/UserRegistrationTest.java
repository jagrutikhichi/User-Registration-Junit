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
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
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
	    public void givenEmailId_WhenProper_ShouldReturnTrue(){
	        boolean result = userRegistration.valudateEmailId("abc.syz@bl.co.in");
	        Assert.assertTrue(result);
	    }

}