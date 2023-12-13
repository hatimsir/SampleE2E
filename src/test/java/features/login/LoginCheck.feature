Feature: Login to Google

  @Regression @smoke
  Scenario: To open browser and check google page
    Given User navigate to google page
    When User see google page is opened
    Then User check text box and close the browser

  @Regression @smoke
  Scenario: To open browser and check google page
    Given User navigate to google page
    When User see google page is opened
    Then User check text box and close the browser

  @smoke
  Scenario: To open browser and check google page
    Given User navigate to google page
    When User see google page is opened
    Then User check text box and close the browser
    And User see the page
