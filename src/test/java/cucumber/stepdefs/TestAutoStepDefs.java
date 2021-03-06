package cucumber.stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAutoStepDefs {
 
	BaseStepDefs stepDef;
	
	public TestAutoStepDefs(BaseStepDefs stepDef) {
		this.stepDef=stepDef;
	}
	
	@When("^I click on \"([^\"]*)\" link$")
	public void clickTestAutomationEngineer(String link) {
		stepDef.currentPage.clickMenuItem(link);
	}
	
	@Then("^I should verify that \"([^\"]*)\" skills of Automation Engineer are displayed$")
	public void verifyAutomationSkills(String count) {
		int AutoTestSkillsCount=stepDef.currentPage.AutomationSkillsCount();
		Assert.assertEquals(Integer. parseInt(count) , AutoTestSkillsCount);
	}
}
