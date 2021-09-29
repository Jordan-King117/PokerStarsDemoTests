package StepDefs;

import PageObjects.Betslip;
import Utils.Xpaths;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;


import static PageObjects.Betslip.driver;


public class BetslipDefinitions {


    @Given("^I have launched the browser$")
    public void i_have_launched_the_browser() throws Exception {
        //set the browser and launch
        Betslip.setupDriver("chrome");
        driver.manage().window().maximize();
       }

    @Then("^Navigated to the URL$")
    public void navigated_to_the_URL() throws Exception {
        driver.get("https://www.pokerstarssports.uk");
        Thread.sleep(5000);
    }

    @When("^I click a bet to add it to the betslip$")
    public void i_click_to_add_it_to_the_betslip() throws Exception {
        //navigate to a bet and click to add it
        selectNewBet(Xpaths.SELECT_FIRST_BET);
    }

    @Then("^The selected bet is added to the betslip$")
    public void the_selected_bet_is_added_to_the_betslip() throws Exception {
        //assert selected bet is added to the betslip
        assertBetNameMatchesBetslip(Xpaths.GET_BET_NAME, Xpaths.BET_NAME_IN_BETSLIP);
    }

    @Then("^I click to delete a bet$")
    public void i_click_to_delete_a_bet() throws Exception {
        //click the delete bet button on the betslip
        Betslip clickDeleteButton = new Betslip();
        clickDeleteButton.clickButton("XPATH", Xpaths.BETSLIP_DELETE_BUTTON);
    }

    @Then("^The bet is removed from the betslip$")
    public void the_bet_is_removed_from_the_betslip() throws Exception {
        //assert the bet is no longer available in the bet slip
        betsRemovedFromTheBetslip(Xpaths.BET_NAME_IN_BETSLIP);
    }


    @When("^I click on multiple bets and add them to the betslip$")
    public void i_click_on_multiple_bets_and_add_them_to_the_betslip() throws Exception {
        //select multiple bets to add to the betslip
        i_click_to_add_it_to_the_betslip();
        selectNewBet("(" + Xpaths.SELECT_FIRST_BET + ")[2]");
        selectNewBet("(" + Xpaths.SELECT_FIRST_BET + ")[3]");
    }

    @When("^The selected bets are all added to the betslip$")
    public void the_selected_bets_are_all_added_to_the_betslip() throws Exception {
        //assert all the selected bets are visible in the betslip
        the_selected_bet_is_added_to_the_betslip();
        assertBetNameMatchesBetslip("(" + Xpaths.GET_BET_NAME + ")[2]", "(" + Xpaths.BET_NAME_IN_BETSLIP + ")[2]");
        assertBetNameMatchesBetslip("(" + Xpaths.GET_BET_NAME + ")[3]", "(" + Xpaths.BET_NAME_IN_BETSLIP + ")[3]");
    }

    @Then("^The bet is removed but the others remain$")
    public void the_bet_is_removed_but_the_others_remain() throws Exception {
        //the first bet added is removed from the betslip
        betsRemovedFromTheBetslip("(" + Xpaths.BET_NAME_IN_BETSLIP + ")[3]");
        assertBetNameMatchesBetslip("(" + Xpaths.GET_BET_NAME + ")[2]", Xpaths.BET_NAME_IN_BETSLIP);
        assertBetNameMatchesBetslip("(" + Xpaths.GET_BET_NAME + ")[3]", "(" + Xpaths.BET_NAME_IN_BETSLIP + ")[2]");
    }

    @Then("^Two bets are removed and only a single bet remains$")
    public void two_bets_are_removed_and_only_a_single_bet_remains() throws Exception {
        //the first 2 selected bets are removed from the betslip
        betsRemovedFromTheBetslip("(" + Xpaths.BET_NAME_IN_BETSLIP + ")[3]");
        betsRemovedFromTheBetslip("(" + Xpaths.BET_NAME_IN_BETSLIP + ")[2]");
        assertBetNameMatchesBetslip("(" + Xpaths.GET_BET_NAME + ")[3]", Xpaths.BET_NAME_IN_BETSLIP);
    }

    @Then("^I click to delete all bets at once$")
    public void i_click_to_delete_all_bets_at_once() throws Exception {
        //click the delete all selected bets button
        Betslip newBetSelection = new Betslip();
        newBetSelection.clickButton("XPATH", Xpaths.DELETE_ALL_BUTTON);
    }

    @Then("^I click agree to delete all bets$")
    public void i_click_agree_to_delete_all_bets() throws Exception {
        //click to agree to delete all bets
        Betslip removeAllSelections = new Betslip();
        removeAllSelections.clickButton("XPATH", Xpaths.DELETE_ALL_BUTTON_YES);
    }

    @Then("^I close the browser$")
    public void i_close_the_browser() throws Exception {
        driver.quit();
    }



    public void selectNewBet(String pathToBet){
        Betslip findRequiredElement = new Betslip();
        findRequiredElement.bringElementIntoView();

        Betslip newBetSelection = new Betslip();
        newBetSelection.clickButton("XPATH", pathToBet);
    }

    public static void assertBetNameMatchesBetslip(String betNameOnSportsbook, String betNameInBetslip){
        String placedBetName = driver.findElement(By.xpath(betNameOnSportsbook)).getText();

        Betslip selectedBetMatchesBetslip = new Betslip();
        selectedBetMatchesBetslip.verifyText(betNameInBetslip, placedBetName);
    }

    public void betsRemovedFromTheBetslip(String betName) throws Exception {
        Betslip verifyBetRemoved = new Betslip();
        verifyBetRemoved.verifyElementAbsent(betName);
    }

}
