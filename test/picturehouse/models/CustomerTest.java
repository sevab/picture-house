package picturehouse.models;

//import picturehouse.models.Customer;
import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.javalite.test.jspec.JSpec.the;

/**
 *
 * @author sevabaskin
 */
public class CustomerTest {

	@Before
	public void before() {
		Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/picturehouse_test", "testuser", "testuserpassword");
		Base.openTransaction();
	}

	@After
	public void after() {
		Base.rollbackTransaction();
		Base.close();
	}

	public CustomerTest() {
	}

	@Test
	public void shouldValidateMandatoryFields() {
		Customer customer = new Customer();

		//check errors
		the(customer).shouldNotBe("valid");
		the(customer.errors().get("username")).shouldBeEqual("Please, provide your username");
		the(customer.errors().get("credit_card_number")).shouldBeEqual("Please, provide your credit card number");
		the(customer.errors().get("password")).shouldBeEqual("Please, provide a password");

		//set missing values
		customer.set("username", "johnDoe", "credit_card_number", "1111222233334444", "password", "Passw0rdA1b");
		//all is good:
		customer = new Customer();
		customer.set("username", "johnDoe", "credit_card_number", "1111222233334444", "password", "Passw0rdA1b");
		the(customer).shouldBe("valid");

	}

	@Test
	public void shouldValidateUniqueUsername() {
	}

	@Test
	public void shouldValidatePasswordIsSecure() {
		Customer customer = new Customer();
		// should not allow to set a password that is less than 8 characters
		customer.set("username", "johnDoe", "credit_card_number", "1111222233334444", "password", "Pa$$");
		the(customer).shouldNotBe("valid");
		the(customer.errors().get("password")).shouldBeEqual("Password must be at least 8 characters long");

		// should not allow to set a password that doesn't have an uppercase character
		customer.set("username", "johnDoe", "credit_card_number", "1111222233334444", "password", "password");
		the(customer).shouldNotBe("valid");
		the(customer.errors().get("password")).shouldBeEqual("Password must contain at least one uppercase, lowercase character and a digit");

		// set correct password
		customer.set("username", "johnDoe", "credit_card_number", "1111222233334444", "password", "Pa$$w0rd");
		the(customer).shouldBe("valid");

	}

	@Test
	public void shouldValidateCreditCardNumber() {
		Customer customer = new Customer();
		// should not allow to set a creditcard with characters other than digits
		customer.set("username", "johnDoe", "credit_card_number", "c1112222333344ab", "password", "Passw0rd");
		the(customer).shouldNotBe("valid");
		the(customer.errors().get("credit_card_number")).shouldBeEqual("Credit card number can only contain 16 digits");
        
        // should not allow to input less than 16 digist
		customer.set("username", "johnDoe", "credit_card_number", "11112222333344", "password", "Passw0rd");
		the(customer).shouldNotBe("valid");
		the(customer.errors().get("credit_card_number")).shouldBeEqual("Credit card number can only contain 16 digits");
        
		// set correct password
		customer.set("username", "johnDoe", "credit_card_number", "1111222233334444", "password", "Pa$$w0rd");
		the(customer).shouldBe("valid");

	}
}
