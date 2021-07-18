@LoginFeature
Feature: Login Feature
  Description: This feature will be used to login to Simplilearn Application

  @PositiveLogin @Sanity
  Scenario Outline: Verify thet when user enters the correct user name and password to login successfull
    Given User has opened Simplilearn Application
    When User click on the Login Button
    And User enters correct username "<UserName>"
    And User enters correct password "<Password>"
    And User click login button
    Then User should be loged in to the home page
    And User can see the Successfull login message

    Examples: 
      | UserName            | Password |
      | abdc@bgy.com        | abv432   |

  @NegativeLogin @Sanity
  Scenario Outline: Verify thet when user enters the correct user name and password to login successfull
    Given User has opened Simplilearn Application
    When User click on the Login Button
    And User enters correct username "<UserName>"
    And User enters correct password "<Password>"
    And User click login button
    Then User should be loged in to the home page
    And User can see the Successfull login message

    Examples: 
      | UserName            | Password |
      | abdc@bgy.com        | abv432   |
