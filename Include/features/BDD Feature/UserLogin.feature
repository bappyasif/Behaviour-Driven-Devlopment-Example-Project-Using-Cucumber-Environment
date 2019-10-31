#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: User Login Validation Fearture

  
  Scenario Outline: Test User Login With Valid Credentials
    Given I am Navigated To User Login Page
    When User Enters Their Crerdentials, <User_Name> And <Password>
    And Click On Login Button
    Then User Lands On Dashboard
  
  Examples: 
 	|User_Name|Password|
 	|Admin|admin123|
 	|Admin|admin123|
 