Feature: Home screen feature

  Background: 
    Given User has opened Simplilearn Application
    When User enter correct username "<UserName>"
    And User enters correct password "<Password>"
    And User click login button

  Scenario: verify that user can see product deatails
    Given user landed on homescreen
    When user can search anything
    Then user can see the searched item
