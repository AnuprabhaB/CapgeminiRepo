Feature: Store login
This feature deals with the login

Background:

	Given I navigate to login page


@TC1

Scenario: Login with correct username and correct password


	#Given I navigate to login page	
	And I entered username and password
	And I clicked signin button
	Then Itas navigated to the HomePage


@TC2

Scenario: Login with correct username and invlid password


	#Given I navigate to login page	
	And I entered correct username
	But Invalid pwd
	And I clicked signin button
	Then Itas navigated to the error msg