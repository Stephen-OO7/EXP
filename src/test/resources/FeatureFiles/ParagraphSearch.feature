@Paragraphsearch
Feature:Check Paragraph Search Form

Background: user is logged in.
Given user is on Paragraph search form.

Scenario:Check searching with paragraph search form.
When user enters a paragraph "Low cost multi-pole motor constructions and methods of manufacture and Electric sander and motor control therefo and Low cost multi-pole motor constructions and methods of manufacture" in paragraph search.
And user clicks on search button on paragraph search form
And user cicks on submit button.
Then user should navigate to the results page from paragraph search.

Scenario:Check if user is able to remove highlighted keywords from the identified key technologies window.
When user enters a paragraph "Low cost multi-pole motor constructions and methods of manufacture and Electric sander and motor control therefo and Low cost multi-pole motor constructions and methods of manufacture" in paragraph search.
And user clicks on search button on paragraph search form
And user deletes some highlighted keywords form the identified key technologies window.
And user cicks on submit button.
Then user should navigate to the results page from paragraph search.

Scenario:Check if user is able to add new  keywords in the identified key technologies window.
When user enters a paragraph "Low cost multi-pole motor constructions and methods of manufacture and Electric sander and motor control therefo and Low cost multi-pole motor constructions and methods of manufacture" in paragraph search.
And user clicks on search button on paragraph search form
And user enters some highlighted keywords form the identified key technologies window.
And user cicks on submit button.
Then user should navigate to the results page from paragraph search.
