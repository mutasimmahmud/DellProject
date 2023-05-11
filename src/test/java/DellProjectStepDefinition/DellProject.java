package DellProjectStepDefinition;

import DellProjectUtility.DellProjectBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DellProject extends DellProjectBase{
	@Given("^Open Dell<\"([^\"]*)\"> Application$")
	public void open_Dell_Application(String URL) throws Throwable {
		DellProjectURL(URL);	
	    
	}

	@Then("^Click Search Field$")
	public void click_Search_Field() throws Throwable {
	    
	}

	@Then("^Enter Product in Search Field$")
	public void enter_Product_in_Search_Field() throws Throwable {
	    
	}

	@Then("^Click Search button$")
	public void click_Search_button() throws Throwable {
	   
	}

	@Then("^Verify Search Field is Working as Expected$")
	public void verify_Search_Field_is_Working_as_Expected() throws Throwable {
	    
	}


}
