Feature: This feature will help to do the calculator functionality

  Background: Given the calculator is open

  Scenario: Add two numbers
    When i add two numbers "2" and"5"
    Then i get the result as "7"

  Scenario: Multiply two numbers
    When i multiply two numbers "2" and"5"
    Then i get the result as "10"
