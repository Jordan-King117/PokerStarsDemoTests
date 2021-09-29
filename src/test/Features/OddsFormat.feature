Feature: Odds Format Feature

  Scenario: Changing the odds format from fractional to decimal

    Given I have launched the browser
    Then Navigated to the URL
    And I take the fractional odds value of a bet
    And I check decimal and american formats are available
    When I change the odds format to decimal
    Then I take the decimal odds value of a bet
    And I assert the fractional and decimal value are different
    Then I close the browser


  Scenario: Changing the odds format from fractional to american

    Given I have launched the browser
    Then Navigated to the URL
    And I take the fractional odds value of a bet
    When I change the odds format to american
    Then I take the american odds value of a bet
    And I assert the fractional and american value are different
    Then I close the browser
