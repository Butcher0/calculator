package cucumber.examples.java.helloworld;

import static org.junit.Assert.assertEquals;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefs {

	Calculator calc = new Calculator();

	@Given("^enter number \"([^\"]*)\"$")
	public void enter_number(int number) throws Throwable {
		calc.setNumbers(number);
	}

	@Given("^press add button$")
	public void press_add_button() throws Throwable {
		calc.setCommand(Operand.ADD);
	}

	@When("^pressing equals button$")
	public void pressing_equals_button() throws Throwable {
		calc.calcresult();
	}

	@Then("^result should be \"([^\"]*)\"$")
	public void result_should_be(int ans) throws Throwable {
		// Express the Regexp above with the code you wish you had
		assertEquals(ans, calc.calcresult());
	}
	
	@Given("^press subtract button$")
	public void press_subtract_button() throws Throwable {
		calc.setCommand(Operand.SUBTRACT);
	}
}
