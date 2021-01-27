@KeywordSearch
Feature: Check Keyword Search In Patseer Explorer.
Scenario: Check If after entering keyword in search area auto suggestions are displayed and user is able to select from the displayed list.
Given user is logged in.
Given user is on homepage.
When user enter "jet " and auto suggestions are dispayed based on the input keyword.
When user clicks on the appeared auto suggestion
Then the selected auto suggestion should appear in the search textbox

Scenario: check searching of keywords from keyword search 
Given user is on homepage.
When user enters keywords and user clicks on search button
      |Keyword|
      |Jet|
      |Google INC|
      |A61P43*|
      |T:jet w3 engine|
      |jet,Engine|
      |KR20060060521A|
Then results should be displayed on the results page for the entered keyword.

Scenario Outline: check searching of keywords from keyword search 
Given user is on homepage.
When user enters keywords and user clicks on search button
Then results should be displayed on the results page for the entered keyword.

Examples:
			|Keyword|
      |Jet|
      |Google INC|
      |A61P43*|
      |T:jet w3 engine|
      |jet,Engine|
      |KR20060060521A|
      
 
      



