Feature: Betslip Feature

Scenario: Adding and removing a single bet to the betslip

    Given I have launched the browser
    Then Navigated to the URL
    When I click a bet to add it to the betslip
    And The selected bet is added to the betslip
    Then I click to delete a bet
    And The bet is removed from the betslip
    Then I close the browser


    Scenario: Adding and removing multiple bets bet to the betslip

        Given I have launched the browser
        Then Navigated to the URL
        When I click on multiple bets and add them to the betslip
        And The selected bets are all added to the betslip
        Then I click to delete a bet
        And The bet is removed but the others remain
        Then I click to delete a bet
        And Two bets are removed and only a single bet remains
        Then I click to delete a bet
        And The bet is removed from the betslip
        Then I close the browser


    Scenario: Adding multiple bets to the bet slip and click remove all

        Given I have launched the browser
        Then Navigated to the URL
        When I click on multiple bets and add them to the betslip
        And The selected bets are all added to the betslip
        Then I click to delete all bets at once
        And I click agree to delete all bets
        And The bet is removed from the betslip
        Then I close the browser