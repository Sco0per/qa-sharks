@B32G22-262
Feature: Default

	Background:
		#@B32G22-259
		Given the user is on the login page
		Then the user logged in with username as "User15" and password as "Userpass123"
		#@B32G22-260
		Given user is already on Files page
		#@B32G22-261
		Given user clicks to Deleted files button
		

	@B32G22-256
	Scenario: US-007 AC01-TC01 Verify all deleted files can be ordered
		And user clicks to Deleted button 
		Then user sees all the deleted files ordered by newest to oldest or vice versa

	@B32G22-257
	Scenario: US-007 AC02-TC01 Verify user can delete any deleted file permanently
		When user clicks three dots icon in the file's line
		And user clicks Delete permanently sign
		Then user sees the deleted file permanently deleted


	@B32G22-258
	Scenario: US-007 AC03-TC01 Verify user can restore any deleted file 
		When user clicks Restore icon in the file's line 
		   Then user sees the file is under the All Files tab