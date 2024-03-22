@wip_maya
Feature: Talk Module Functionality (Automation)

  Agile story:
  As a user, I should be able to create a new conversation, add participant under the Talk module
#
#  Background: As i user  login to the dashboard
#    Given as a user i should be able to login with valid credentials


  Scenario: User can create a new conversation by adding any selected participant

    Given as a user i should be able to login with valid credentials
    When user navigates and clicks on Talk Module icon
    And user clicks the plus button and inters a "Employee10"
    Then user checks a checkbox to allow guests to join
    Then user clicks to the Add participants button
    Then user selects a participant from the list and clicks into Create conversation button
    Then user clicks into Close button
    Then user should be able to see  "Employee10" name newly created conversation list



  Scenario: User can delete a conversation

    When as a user i should be able to login with valid credentials
    When user navigates and clicks on Talk Module icon
    Then user clicks into three dots of the newly create conversation
    Then user clicks to delete conversation and user clicks Yes button then verify if conversation had been deleted
