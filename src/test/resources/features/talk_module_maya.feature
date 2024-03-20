@wip_maya
Feature: Talk Module Functionality (Automation)

  Agile story:
  As a user, I should be able to create a new conversation, add participant under the Talk module

  Background: User is already in the log in page
    Given the user is on the login page
    Then the user logged in with username as "User22" and password as "Userpass123"


  Scenario: User can create a new conversation by adding any selected participant
    When user navigates and clicks on Talk Module icon
    Then talk module page opens
    When user inters a participant and clicks the add button
    Then conversation content pops-up with searched participant's name on it
    Then user checks a checkbox to allow guests to join
    Then user clicks to the Add participants button
    Then all participants list pups-up
    Then user selects a participant from the list and clicks into Create conversation button
    Then copy the conversation link option pops-up
    Then user clicks into Close button
    Then user can see newly created conversation on the list


  Scenario: User can delete a conversation
    Given user navigates to newly created conversation and clicks meatball button
    Then list of options drops down
    Then the Delete conversation option is visible
    Then user clicks to delete and verification of deletion is pops-up
    Then user clicks Yes button
    Then verify if conversation had been deleted