@Quicksearch
Feature:Check Quicksearch Form

Background: user is logged in.
Given user is on quicksearch form.

@Quicksearch @Text
Scenario:Check searching with Title and Abstract Field
When user selects title and abstract field from dropdown and enters "Motor" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Text
Scenario:Check searching with Title  Abstract and claims Field
When user selects title  abstract claims field from dropdown and enters "Jet Engine" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Text
Scenario:Check searching with claims Field
When user selects claims field from dropdown and enters "proportional " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Text
Scenario:Check searching with Fulltext Field
When user selects fulltext field from dropdown and enters "Shaft" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Text
Scenario:Check searching with Independent claims Field
When user selects independent claims field from dropdown and enters "Hydraulic" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Publication number Field
When user selects publication number field from dropdown and enters "GB1081933A" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Publication date Field
When user selects publication date field from dropdown and enters "1997-10-10" to "2020-10-10" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Publication Year Field
When user selects publication Year field from dropdown and enters "2010" to "2020" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Application number Field
When user selects Application number field from dropdown and enters "GB19640034780" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Application date Field
When user selects Application date field from dropdown and enters "2010-01-01" to "2020-01-01" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Application year Field
When user selects Application year field from dropdown and enters "2010" to "2020" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Priority number Field
When user selects Priority number field from dropdown and enters "US20030463995" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Priority country Field
When user selects Priority country field from dropdown and enters "US" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Biblio
Scenario:Check searching with Priority dates Field
When user selects Priority dates field from dropdown and enters "2000-10-10" to "2020-10-10" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with Inventor Field
When user selects Inventor field from dropdown and enters "THOMAS MATHEW or GANDHI ASIF D " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with Examiner Field
When user selects Examiner field from dropdown and enters "Smith Creighton " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with Current & Orig & Norm Assignees (CAAN)
When user selects Current & Orig & Norm Assignees CAAN field from dropdown and enters "Google " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.


@Quicksearch @Parties
Scenario:Check searching with Attorny Field
When user selects Attorny field from dropdown and enters "GUREY STEPHEN M " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with current owner Field
When user selects current owner field from dropdown and enters " NOKIA CORP" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with All Assignee Field
When user selects All Assignee field from dropdown and enters "LUCENT TECHNOLOGY INC" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with Assigne normalized Field
When user selects Assigne normalized field from dropdown and enters "SONY CORP " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Parties
Scenario:Check searching with Current assignee Field
When user selects Current assignee field from dropdown and enters "LUCENT TECHNOLOGIES INC " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with US classification class
When user selects US classification  field from dropdown and enters "15/100" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with All classification class
When user selects All classification field from dropdown and enters "F16D*" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with IPC classification class
When user selects IPC field from dropdown and enters " H04B7/00 or  H04L12/28" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with Locarno classification class
When user selects Locarno field from dropdown and enters "1214" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with CPC classification class
When user selects CPC field from dropdown and enters " G06Q20/327 " in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with IPC classification class
When user selects IPC field from dropdown and enters "F02*" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with FI classification class
When user selects FI classification field from dropdown and enters "A01*" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Clases
Scenario:Check searching with FTERM classification class
When user selects FTERM classification field from dropdown and enters "4J0*" in the textbox.
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.


@Quicksearch @Operators
Scenario:Check searching with OR and AND operators and with all three search fields
When user selects title and abstract field from dropdown and enters "Magnetic" in the textbox.
Then user selects OR operator from the first operators dropdown.
Then user selects claims field from the second dropdown and enters claims as "Orientation".
Then user selects AND from the second operators dropdown.
Then user selects PBD in the third dropdown and enters dates in the PBD fields from "1998" to "2020".
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Operators
Scenario:Check searching with NOT operators and with all three search fields
When user selects title and abstract field from dropdown and enters "Clutch" in the textbox.
Then user selects NOT operator from the second operators dropdown.
Then user selects PBD in the third dropdown and enters dates in the PBD fields from "1996-10-10" to "2011-10-10".
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.

@Quicksearch @Operators
Scenario:Check searching with TAC in third field and claims in second field.
When user selects TAC field in third dropdown and enters "Plasma".
Then user selects AND from the second operators dropdown.
Then user selects claims field from the second dropdown and enters claims as "METHOD".
Then user clicks on search button.
Then user navigates to the results page having results based on the given input.














