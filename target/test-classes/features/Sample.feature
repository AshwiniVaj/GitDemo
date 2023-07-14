Feature: Amazon Sign in page scenario

  Scenario: Log_in to the account
    Given I am on the Sign in page
    When Sign in to the account with "ashwinijeganathan94@gmail.com"
    And click the continue button
    When password is "Ashwini@2010" click on Sign in button
    Then sign in the account