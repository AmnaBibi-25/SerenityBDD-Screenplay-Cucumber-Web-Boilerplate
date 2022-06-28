Feature: Login
  Scenario Outline: Login the Sauce Demo webapp
    Given user is on Sauce Demo webapp page
    When user enters credentials using <parameters>
    Then user should be successfully logged into the app
    @login
    Examples:
    | parameters |
    | Login Parameters |