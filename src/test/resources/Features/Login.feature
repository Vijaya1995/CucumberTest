Feature: Validate Login Functionality

  Scenario: Login with valid credentials
    Given User open browser and enter url
    When user click on login
    Then user should see login page
    When user entered a valid username and password
    And user click on login button
    Then I should be logged in successfully
























