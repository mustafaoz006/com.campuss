@US01
  Feature: User should be possible to login with valid credentials
    Scenario: User logins with valid credentials
      Given user is on the campus homepage
      And user accepts the cookies
      And user enters valid username
      And user enters valid password
      When user clicks Login button
      Then The Homepage should be opened
      And close the driver
