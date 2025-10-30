Feature: Store login

This feature deals with the login functionality.

Background: 
   Given I navigate to login page

@TC1
Scenario: Login with correct username and correct password

	#Given I navigate to login page
	#And I entered username and password
	When I entered "mercury" and "123456"
	And I clicked signin button
	Then Its navigated to the home page

@TC2	
Scenario: Login with correct username and incorrect password

	#Given I navigate to login page
	#And I entered username and password
	When I entered "mercury" and "23#######"
	And I clicked signin button
	Then Itas navigated to the error msg
	

@TC3	
Scenario: using DataTable

	#Given I navigate to login page
	#And I entered username and password
	#When I entered "mercury" and "23#######"
	
	When I entered following details
	| userName | password |
	| mercury | 123456 |
	
	And I clicked signin button
	Then Its navigated to the home page
	

@TC4
Scenario Outline: Login with correct username and correct password
		
		#And I entered username and password
		When I insert "<userName>" and "<passWord>"
		And I clicked signin button
		Then Its navigated to the home page "<expected Result>"
		
		Examples:
		
		| userName | passWord |	expected Result |
		| mercury | 123456 | Login Successfully |
		| mercury | mercury | Login Successfully |
		| admin2 | admin22 | Enter your userName and password correct |
		
		