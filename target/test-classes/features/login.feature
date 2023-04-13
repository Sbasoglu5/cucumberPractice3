Feature: Login Functionalities

  @Login1
  Scenario: Valid Admin Login
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully

