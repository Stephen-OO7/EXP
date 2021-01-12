package StepDefinitionFiles;

import Utilities.Base;
import io.cucumber.java.en.Given;

public class Login extends Base{
	
	@Given("user logs in.")
	public void user_logs_in() {
		login();
	}

}
