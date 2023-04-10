@US02
  Feature: User should not be possible to login with invalid credentials
  Scenario Outline: User should not be possible to login with invalid username oder password
    Given user is on the campus homepage
    And user enters valid oder invalid "<username>"
    And user enters invalid oder valid "<password>"
    And user clicks Loginbutton
    Then The Homepage should not be opened
    And close the driver


    Examples: Test data for username und password
    |   username    |    password    |
    |admin_intern   |    password    |
    |   123456      |admin12345      |
    |               |    password    |
    |   username    |                |
    |               |                |
    |   username1   |    password    |