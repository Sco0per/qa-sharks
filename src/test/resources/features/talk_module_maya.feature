Feature: Talk Module Functionality (Automation)

  Agile story:
  As a user, I should be able to create a new conversation, add participant under the Talk module

  Scenario: User already logged in
    Given user logged in
    Then user is on the Dashboard page

  Scenario: User can create a new conversation by adding any selected participant
    Given user navigates and clicks on Talk Module icon
    Then talk module page opens
    When user inters a conversationer and clicks the add button
    Then conversetion content pops-up with searched conversationer's name on it
    Then user checks a checkbox to allow guests to join
    Then user clickes to the Add participants button
    Then all participants list pups-up
    Then user selects a participant from the list and clicks into Create conversation button
    Then copy the conversation link option pops-up
    Then user clicks into Close button
    Then user can see newly created conversation on the list






  Scenario: User can delete a conversation
    Given user navigates to newly created conversation and clicks meetball button
    Then list of options drops down
    Then the Delite conversation option is visible
    Then user clicks to delete and verification of deletion is pops-up
    Then user clicks Yes button
    Then verify if conversation had been delited