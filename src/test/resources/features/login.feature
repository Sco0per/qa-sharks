@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verify user can login
    Then the user logged in with username as "User22" and password as "Userpass123"




