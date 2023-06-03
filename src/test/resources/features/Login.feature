@sanity
Feature: Login Feature
  	In order to perform successful login
  	As a User
  	I have to enter username and password

  Scenario Outline: Login to the BLUE Website with valid/invalid crendetials
    Given user navigate to BLUE Website
    When user Validates the title on Login page
    Then user enters "<Username>" Username
    And user enters "<password>" password
    And user clicks on Login button


	Examples: 
	| Username | password |
	| valid    | valid    |
	| Invalid  | Invalid  |
	| valid  	 | Invalid  |
	| Invalid  | valid    |