@B32G22-255
Feature:  Contacts Module Functionality

	#Agile Story :As a user, I should be able to create a new contact ,
	#and edit/delete any contact under Contacts module
	@B32G22-251
	Scenario:  User create a new contact
		Given User is on the contact module page
		    When user clicks on New contact
		    Then user types the name
		    Then user should see the new contact name in the All contacts list



	@B32G22-252
	Scenario: User sees All contacts list and the total number
		Given a set of contacts in the All contacts list
		    When user clicks on the All contacts button
		    Then user sees the whole list and the total number of contacts	



	@B32G22-253
	Scenario: User change contact profile picture
		Given a previously uploaded picture in the files option
		    When user clicks on the contact whose picture they want to change
		    And user clicks on the Choose from file option
		    And user chooses the picture by clicking on it
		    And user clicks on the choose button	



	@B32G22-254
	Scenario: User delete contact
		Given user clicks on the desired contact to delete
		    When user clicks on the three dots option
		    And user clicks on the Delete option
		    Then user should not see the contact in the list