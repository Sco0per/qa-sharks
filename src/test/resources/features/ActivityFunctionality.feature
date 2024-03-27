@B32G22-284
Feature: Activity Functionality
    #As a user, I should be able to see listed
    # items under the Activity module.

@B32G22-279
  Scenario: User can display all listed items under the Activity module
    Given user is on Activity module page
    Then user clicks on All activities
    And user can see all listed items displayed

 @B32G22-280
  Scenario: User can see all items list ordered by newest to oldest
      Given user stays on Activity page
      Then can see all listed activity items displayed on the page
      And user can see extract timestamps associated with each activity item

@B32G22-281
  Scenario: User can see "No more events to load" message at the end of the "All Activities" tab
        Given user is located on Activity page
        Then user scrolls to the end of all activities
        And user sees no more events load message

