Feature: Automation Testing of Elearning Website

  Background: Automated login
    Given User is on Elearning platform
    When user enters username and password
    And User clicks on the login button
    Then User gets redirected to the dashboard
    And User clicks on the My Courses on the menu bar
    Then User gets redirected to the My Courses page
    And User clicks on 123testing
    Then User can see various icons

	@i1
  Scenario Outline: Automate the Groups icon
    Given User can see various icons on my courses option
    When User clicks on Groups icon
    Then User is able to navigate to Groups page
    When User clicks on register button
    Then accept the pop up
    Then User can see group added message
    When user clicks on unregister button
    Then accepts the pop up
    Then User can see ungroup message
    When User clicks on One of the groups
    Then User is able to see information of that group

    Examples: 
      | text6   |
      | rockers |
	
	@i2
  Scenario Outline: Automate the Chat icon
    Given User can see various icons1
    When User clicks on chat icon
    Then User can able to goto message screen
    When User enter "<text>", "<special_symbols>" in textarea
    Then User is able to enter text and special symbols in the write field
    When User clicks send message on entering text and special symbols
    Then User is able to send message

    Examples: 
      | text     | special_symbols |
      | Hi There | @#$%^&*!?<>!+=  |

	@i3
  Scenario: Automate the Assignment icon
    Given User can see various icons2
    When User clicks on assignments icon
    Then user is able to see assignment given on selected course
    When user clicks on ani assignment
    Then User is able to see detailed description of assignments
    When user clicks on upload my assignment
    Then User is able to open the page from where User can upload assingment
    When User click on Drag and drop file
    Then User can be able to upload the file
    When user clicks on upload simple button
    Then User can see page from where user should upload assignment solution file
    When User clicks on choose file
    Then User can be able to select file on clicking choose file button
    Then the title and file extension should be visible
    When User clicks on button upload
    Then User can be able to upload file
    Then User clicks on Ani link to go back
    When User clicks on save button to save uploaded solution
    Then User is able to save and download the file

	@i4
  Scenario: Automate the survey icon
    Given User can see various icons5
    When User clicks on the survey icon
    Then User is on the survey page
    Then User is able to see survey name on survey page
    Then User is able to see anonymous in survey page

	@i5
  Scenario Outline: Automate the Wiki icon
    Given User can see various icons3
    When User cicks on Wiki icon
    Then User is able to go on home page of wiki
    When User clicks on Search button
    Then User is able click on search button
    Then User is able to go on search page where User can enter fields
    When user enter "<text1>" in the search term field
    Then User is able to enter text in search term field
    Then User can see result of entered text
    When user check the search also in content button
    Then User is able to check the search also in content
    When user check the Also search in older versions of each page button
    Then User is able to check Also search in older versions of each page button
    When User clicks on search button after checks button
    Then User is able to search the text on clicking search button
    When User clicks on statistics button
    Then user checks all links are working or not
    Then User is able to click on all the links
    When User clicks on all pages button
    Then User is able to click on the all pages button
    Then User is able to see all pages
    When user clicks on latest changes button
    Then User is able to click on latest changes button
    Then user is able to see changes made last time
    When User clicks on notify me of changes button
    Then User is able to click on notify me of changes button

    Examples: 
      | text1    |
      | Selenium |

	@i6
  Scenario: Automate the Assessments icon
    Given User can see various icons4
    When User clicks on assessments icon
    Then User is able to go on assessments page
    When User clicks on list view button
    Then User is able to see report in graph
    When User clicks on close button
    Then list view report will close
    When user clicks on show button
    Then user is able to see available tests
    When user clicks on mtest link
    Then User is on the start test page
    When User clicks on start test
    Then User is on the assessment page
    When User clicks on tests button again to go back
    Then User clicks on assessments button again to go back
    When User clicks on download report in pdf button
    Then User is able to download pdf

	@i7
  Scenario: Automate the Glossary icon
    Given User can see various icon6
    When User clicks on the glossary icon
    Then User is able to see glossary list page
    When User clicks on the export button
    Then User is able to see different format of radio buttons
    Then User selects Export to pdf button
    When User clicks on download button
    Then User is on some page
    When User clicks on glossary link to go back
    Then User is on the home page of glossary
    When User clicks on the list view button
    Then User is able to goto list page

	@i8
  Scenario Outline: Automate the Notebook icon
    Given User can see various icon7
    When User clicks on the Notebook icon
    Then User is able to go to notebook home page
    When User clicks on add new note in my personel notebook
    Then User is able to create new note
    When User enters "<text3>" in note title
    Then User is able to enter text in note title
    When User enters "<text4>" in the note details
    Then User is able to enter details of notes
    When User clicks on create note button
    Then User is able to create note
    When User clicks on sort by date created
    Then User is able to see that notes are sorted according its date
    When User clicks on sort by date last modified
    Then User is able to see that notes are sorted according its date last modified
    When User clicks on sort by title
    Then User is able to see that notes are sorted according its title
    When User clicks on edit button to edit note
    Then User is able to edit the note
    Then User enters "<text5>" in note detail
    When User clicks on edit my personel note button
    Then User is able to edit the note on clicking button
    When User clicks on delete button
    Then User have to accept the pop up
    Then User is able to see previous notes

    Examples: 
      | text3 | text4                 | text5     |
      | admin | fdjgbrfhghojojyiojt59 | Hey there |

	@i9
  Scenario: Automate Selinium Project
    Given User can see various icons8
    When User clicks on selinium project
    Then User is able to goto selinium project home page
    When User clicks on Selenium task
    Then User is able to see information of that project
    Then User is able to see calender and the date of present day
    When User clicks on exp csv file
    Then User is able to download exp file in csv format
