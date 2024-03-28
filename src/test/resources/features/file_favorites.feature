
Feature: File Module Functionality/Favorites (Automation)

  Agile story: As a user, I should be able to add a file to favorites, rename any file and give some comments on
  any file.

  Background:
    Given as a user i should be able to login with valid credentials
    Given user is already on Files page
    Given user is on the action menu from three dots


  Scenario: User can add any file to favorites from its own three dots menu.

    Then user chooses a file to make it favorite
    And user verifies that selected file is as favorite

  @wip-maya2
  Scenario: User can rename any file from its own three dots menu.

    Then user clicks on the Rename option
    And user types "Maya" to rename the file
    Then user verifies that file has been renamed


  Scenario: User can put some comments on any file from the file details menu opened right side.

    Then user click to Details option
    And user clicks to the Comments button
    Then user adds comments as "Let's chat"
    And user verifies if comments have been displayed