Feature: Validate Page Color Change 

Background: 

	Given User is on the Techfios test page 
	

Scenario: 1 Sky Blue Background 
	Given user Set SkyBlue Background button exists 
	When user click on button
	Then background color is changed to sky blue
	
Scenario: 2 Sky White Background 
	Given user Set SkyWhite Background button exists 
	When user click on button
	Then background color is changed to White


