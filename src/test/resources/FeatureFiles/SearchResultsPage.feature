@Searchresultspage
Feature:Search results page.
Background:user is logged in.
Given user is on quicksearch form.
When user selects title and abstract field from dropdown and enters "Motor" in the textbox.
Then user clicks on search button.
Then user is on theresults page

@Searchresultspage @filters
Scenario:Check Record type filter.
When user expands the Record type filter.
And user selects value from Record Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Attorny type filter.
When user expands the Attorny type filter.
And user selects value from Attorny Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Assigne type filter.
When user expands the Assigne type filter.
And user selects value from Assigne Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Inventor type filter.
When user expands the Inventor type filter.
And user selects value from Inventor Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check IPC type filter.
When user expands the IPC type filter.
And user selects value from IPC Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Publication_Country type filter.
When user expands the Publication_Country type filter.
And user selects value from Publication_Country Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Industry type filter.
When user expands the Industry type filter.
And user selects value from Industry Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Legal_Status_Current type filter.
When user expands the Legal_Status_Current type filter.
And user selects value from Legal_Status_Current Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Current_Owner type filter.
When user expands the Current_Owner type filter.
And user selects value from Current_Owner Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check CPC type filter.
When user expands the CPC type filter.
And user selects value from CPC Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Priority_Country type filter.
When user expands the Priority_Country type filter.
And user selects value from Priority_Country Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filters
Scenario:Check Tech_Domain type filter.
When user expands the techdomain type filter.
And user selects value from techdomain Type filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @filterss
Scenario:Check ISnot for Current_Owner Filter.
When user expands the Current_Owner type filter.
And user selects value from Current_Owner Type filter.
And user selects ISNOT in filter.
And user clicks on apply filter button.
Then user verifies the appeared results.

@Searchresultspage @views 
Scenario:Check user is able to change view to compact.
When user changes the view to compact view
Then user verifies that the compact view is loaded properly.

@Searchresultspage @views
Scenario:Check user is able to change view to tabular.
When user changes the view to tabular view
Then user verifies that the tabular view is loaded properly.

@Searchresultspage @recordcount
Scenario:Check user is able to change recourd count on page.
When user changes the record count on search results page
Then user verifies the number of records displayed on page.
