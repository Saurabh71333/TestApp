@datatable
Feature: Login Feature
  	In order to perform successful login
  	As a User
  	I have to enter username and password

  Background: 
    Given user navigate to BLUE Website
    When user Validates the title on Login page

  Scenario: Login to the BLUE Website with valid crendetials
    Then user enters "valid" Username
    And user enters "valid" password
    And user enters firstname and lastname
		| FN		|  LN		 |
    | Rahul | devraj |
    | Vivek | sharma |
    And user clicks on Login button