Feature: kalkulator functionality

Scenario: add two numbers
	Given enter number "2"
	And press add button
	And enter number "3"
	When pressing equals button
	Then result should be "5"
	
	
Scenario: subtract two numbers
	Given enter number "5"
	And press subtract button
	And enter number "3"
	When pressing equals button
	Then result should be "2"
	
Scenario: add three numbers
	Given enter number "5"
	And press add button
	And enter number "3"
	And press add button
	And enter number "30"	
	When pressing equals button
	Then result should be "38"
	
Scenario: multiply two numbers
	Given enter number "5"
	And press multiply button	
	And enter number "4"
	When pressing equals button
	Then result should be "15"
			