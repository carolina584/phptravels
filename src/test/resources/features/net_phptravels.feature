
Feature: Funtionalities the page phptravels
  
Background:
Given I want to open phptravel page

  @tag1
  Scenario: I want to validate the register the page
    When I want to register me and I enter the username and password.
    Then I validate the entry was successful.

 @tag2
 Scenario: I want to validate the page entry
    When I enter the username and password.
    Then I validate that the entry has not been entering correctly.
    
 @tag3 
 Scenario: I want to validate the hotel reservation
    When I search and to reserve hotel
    Then I validate the hotel reservation
 