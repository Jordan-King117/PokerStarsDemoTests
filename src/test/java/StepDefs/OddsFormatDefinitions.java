package StepDefs;

import PageObjects.Betslip;
import Utils.Var;
import Utils.Xpaths;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;

import static PageObjects.Betslip.driver;

public class OddsFormatDefinitions {


    public static String oddsSetToFractional = null;
    public static String oddsSetToDecimal    = null;
    public static String oddsSetToAmerican   = null;


    @Then("^I take the fractional odds value of a bet$")
    public void i_take_the_fractional_odds_value_of_a_bet() throws Exception {
        //get the odds from a bet while it is set to fractional
        oddsSetToFractional = driver.findElement(By.xpath(Xpaths.SELECT_FIRST_BET)).getText();
    }

    @When("^I change the odds format to decimal$")
    public void i_change_the_odds_format_to_decimal() throws Exception {
        //click on odds format dropdown
        Betslip newBetSelection = new Betslip();
        newBetSelection.clickButton("ID", Var.ODDS_FORMAT_FRACTIONAL_ID);

        //click on decimal option
        newBetSelection.clickButton("ID", Var.ODDS_FORMAT_DECIMAL);
    }

    @Then("^I take the decimal odds value of a bet$")
    public void i_take_the_decimal_odds_value_of_a_bet() throws Exception {
        //get the odds from a bet while it is set to decimal
        oddsSetToDecimal = driver.findElement(By.xpath(Xpaths.SELECT_FIRST_BET)).getText();
    }

    @Then("^I assert the fractional and decimal value are different$")
    public void i_assert_the_fractional_and_decimal_value_are_different() throws Exception {
        //compare the 2 values taken and ensure the are not the same after the format change
        Betslip valuesDoNotMatchAfterChange = new Betslip();
        valuesDoNotMatchAfterChange.textDoesNotEqual(oddsSetToFractional, oddsSetToDecimal);
    }

    @Then("^I check decimal and american formats are available$")
    public void i_check_decimal_and_american_formats_are_available() throws Exception {
        //ensure both the path options for both decimal and american formats exists
        Betslip oddsFormatOption = new Betslip();
        oddsFormatOption.verifyPathExists(Var.ODDS_FORMAT_DECIMAL, "Decimal option cant be found");
        oddsFormatOption.verifyPathExists(Var.ODDS_FORMAT_AMERICAN, "American option cant be found");
    }

    @When("^I change the odds format to american$")
    public void i_change_the_odds_format_to_american() throws Exception {
        //click on odds format dropdown
        Betslip newBetSelection = new Betslip();
        newBetSelection.clickButton("ID", Var.ODDS_FORMAT_FRACTIONAL_ID);

        //click on american option
        newBetSelection.clickButton("ID", Var.ODDS_FORMAT_AMERICAN);
    }


    @Then("^I take the american odds value of a bet$")
    public void i_take_the_american_odds_value_of_a_bet() throws Exception {
        //get the odds from a bet while it is set to American
        oddsSetToAmerican = driver.findElement(By.xpath(Xpaths.SELECT_FIRST_BET)).getText();
    }

    @Then("^I assert the fractional and american value are different$")
    public void i_assert_the_fractional_and_american_value_are_different() throws Exception {
        //compare the 2 values taken and ensure they are not the same after the format change
        Betslip valuesDoNotMatchAfterChangeToAmerican = new Betslip();
        valuesDoNotMatchAfterChangeToAmerican.textDoesNotEqual(oddsSetToFractional, oddsSetToAmerican);
    }

}
