$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Features/OddsFormat.feature");
formatter.feature({
  "name": "Odds Format Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Changing the odds format from fractional to decimal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have launched the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "BetslipDefinitions.i_have_launched_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "BetslipDefinitions.navigated_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take the fractional odds value of a bet",
  "keyword": "And "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_take_the_fractional_odds_value_of_a_bet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check decimal and american formats are available",
  "keyword": "And "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_check_decimal_and_american_formats_are_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the odds format to decimal",
  "keyword": "When "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_change_the_odds_format_to_decimal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take the decimal odds value of a bet",
  "keyword": "Then "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_take_the_decimal_odds_value_of_a_bet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert the fractional and decimal value are different",
  "keyword": "And "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_assert_the_fractional_and_decimal_value_are_different()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BetslipDefinitions.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Changing the odds format from fractional to american",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have launched the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "BetslipDefinitions.i_have_launched_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "BetslipDefinitions.navigated_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take the fractional odds value of a bet",
  "keyword": "And "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_take_the_fractional_odds_value_of_a_bet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change the odds format to american",
  "keyword": "When "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_change_the_odds_format_to_american()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I take the american odds value of a bet",
  "keyword": "Then "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_take_the_american_odds_value_of_a_bet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert the fractional and american value are different",
  "keyword": "And "
});
formatter.match({
  "location": "OddsFormatDefinitions.i_assert_the_fractional_and_american_value_are_different()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BetslipDefinitions.i_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});