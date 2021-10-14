$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Testing of Elearning Website",
  "description": "",
  "id": "automation-testing-of-elearning-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 137,
  "name": "Automate the Notebook icon",
  "description": "",
  "id": "automation-testing-of-elearning-website;automate-the-notebook-icon",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 136,
      "name": "@adm"
    }
  ]
});
formatter.step({
  "line": 138,
  "name": "User can see various icon7",
  "keyword": "Given "
});
formatter.step({
  "line": 139,
  "name": "User clicks on the Notebook icon",
  "keyword": "When "
});
formatter.step({
  "line": 140,
  "name": "User is able to go to notebook home page",
  "keyword": "Then "
});
formatter.step({
  "line": 141,
  "name": "User clicks on add new note in my personel notebook",
  "keyword": "When "
});
formatter.step({
  "line": 142,
  "name": "User is able to create new note",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "User enters \"\u003ctext3\u003e\" in note title",
  "keyword": "When "
});
formatter.step({
  "line": 144,
  "name": "User is able to enter text in note title",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "User enters \"\u003ctext4\u003e\" in the note details",
  "keyword": "When "
});
formatter.step({
  "line": 146,
  "name": "User is able to enter details of notes",
  "keyword": "Then "
});
formatter.step({
  "line": 147,
  "name": "User clicks on create note button",
  "keyword": "When "
});
formatter.step({
  "line": 148,
  "name": "User is able to create note",
  "keyword": "Then "
});
formatter.step({
  "line": 149,
  "name": "User clicks on sort by date created",
  "keyword": "When "
});
formatter.step({
  "line": 150,
  "name": "User is able to see that notes are sorted according its date",
  "keyword": "Then "
});
formatter.step({
  "line": 151,
  "name": "User clicks on sort by date last modified",
  "keyword": "When "
});
formatter.step({
  "line": 152,
  "name": "User is able to see that notes are sorted according its date last modified",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "User clicks on sort by title",
  "keyword": "When "
});
formatter.step({
  "line": 154,
  "name": "User is able to see that notes are sorted according its title",
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "User clicks on edit button to edit note",
  "keyword": "When "
});
formatter.step({
  "line": 156,
  "name": "User is able to edit the note",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "User clicks in note details",
  "keyword": "When "
});
formatter.step({
  "line": 158,
  "name": "User enters \"\u003ctext5\u003e\" in note detail",
  "keyword": "Then "
});
formatter.step({
  "line": 159,
  "name": "User clicks on edit my personel note button",
  "keyword": "When "
});
formatter.step({
  "line": 160,
  "name": "User is able to edit the note on clicking button",
  "keyword": "Then "
});
formatter.step({
  "line": 161,
  "name": "User clicks on delete button",
  "keyword": "When "
});
formatter.step({
  "line": 162,
  "name": "User have to accept the pop up",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "User is able to see previous notes",
  "keyword": "Then "
});
formatter.examples({
  "line": 165,
  "name": "",
  "description": "",
  "id": "automation-testing-of-elearning-website;automate-the-notebook-icon;",
  "rows": [
    {
      "cells": [
        "text3",
        "text4",
        "text5"
      ],
      "line": 166,
      "id": "automation-testing-of-elearning-website;automate-the-notebook-icon;;1"
    },
    {
      "cells": [
        "admin",
        "fdjgbrfhghojojyiojt59",
        "Hey there"
      ],
      "line": 167,
      "id": "automation-testing-of-elearning-website;automate-the-notebook-icon;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6012199400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Automated login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Elearning platform",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User gets redirected to the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the My Courses on the menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User gets redirected to the My Courses page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on 123testing",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User can see various icons",
  "keyword": "Then "
});
formatter.match({
  "location": "signupdefination.user_is_on_Elearning_platform()"
});
formatter.result({
  "duration": 8944131400,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1400856100,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 7981031300,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_gets_redirected_to_the_dashboard()"
});
formatter.result({
  "duration": 76600,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_the_My_Courses_on_the_menu_bar()"
});
formatter.result({
  "duration": 2030605200,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_gets_redirected_to_the_My_Courses_page()"
});
formatter.result({
  "duration": 78700,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_123testing()"
});
formatter.result({
  "duration": 5757752700,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_can_see_various_icons()"
});
formatter.result({
  "duration": 174800,
  "status": "passed"
});
formatter.scenario({
  "line": 167,
  "name": "Automate the Notebook icon",
  "description": "",
  "id": "automation-testing-of-elearning-website;automate-the-notebook-icon;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 136,
      "name": "@adm"
    }
  ]
});
formatter.step({
  "line": 138,
  "name": "User can see various icon7",
  "keyword": "Given "
});
formatter.step({
  "line": 139,
  "name": "User clicks on the Notebook icon",
  "keyword": "When "
});
formatter.step({
  "line": 140,
  "name": "User is able to go to notebook home page",
  "keyword": "Then "
});
formatter.step({
  "line": 141,
  "name": "User clicks on add new note in my personel notebook",
  "keyword": "When "
});
formatter.step({
  "line": 142,
  "name": "User is able to create new note",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "User enters \"admin\" in note title",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 144,
  "name": "User is able to enter text in note title",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "User enters \"fdjgbrfhghojojyiojt59\" in the note details",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 146,
  "name": "User is able to enter details of notes",
  "keyword": "Then "
});
formatter.step({
  "line": 147,
  "name": "User clicks on create note button",
  "keyword": "When "
});
formatter.step({
  "line": 148,
  "name": "User is able to create note",
  "keyword": "Then "
});
formatter.step({
  "line": 149,
  "name": "User clicks on sort by date created",
  "keyword": "When "
});
formatter.step({
  "line": 150,
  "name": "User is able to see that notes are sorted according its date",
  "keyword": "Then "
});
formatter.step({
  "line": 151,
  "name": "User clicks on sort by date last modified",
  "keyword": "When "
});
formatter.step({
  "line": 152,
  "name": "User is able to see that notes are sorted according its date last modified",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "User clicks on sort by title",
  "keyword": "When "
});
formatter.step({
  "line": 154,
  "name": "User is able to see that notes are sorted according its title",
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "User clicks on edit button to edit note",
  "keyword": "When "
});
formatter.step({
  "line": 156,
  "name": "User is able to edit the note",
  "keyword": "Then "
});
formatter.step({
  "line": 157,
  "name": "User clicks in note details",
  "keyword": "When "
});
formatter.step({
  "line": 158,
  "name": "User enters \"Hey there\" in note detail",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 159,
  "name": "User clicks on edit my personel note button",
  "keyword": "When "
});
formatter.step({
  "line": 160,
  "name": "User is able to edit the note on clicking button",
  "keyword": "Then "
});
formatter.step({
  "line": 161,
  "name": "User clicks on delete button",
  "keyword": "When "
});
formatter.step({
  "line": 162,
  "name": "User have to accept the pop up",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "User is able to see previous notes",
  "keyword": "Then "
});
formatter.match({
  "location": "signupdefination.user_can_see_various_icon7()"
});
formatter.result({
  "duration": 92100,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_the_Notebook_icon()"
});
formatter.result({
  "duration": 6566647300,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_go_to_notebook_home_page()"
});
formatter.result({
  "duration": 1830100,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_add_new_note_in_my_personel_notebook()"
});
formatter.result({
  "duration": 7020567100,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_create_new_note()"
});
formatter.result({
  "duration": 111800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 13
    }
  ],
  "location": "signupdefination.user_enters_in_note_title(String)"
});
formatter.result({
  "duration": 3167570800,
  "status": "passed"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_enter_text_in_note_title()"
});
formatter.result({
  "duration": 94700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fdjgbrfhghojojyiojt59",
      "offset": 13
    }
  ],
  "location": "signupdefination.user_enters_in_the_note_details(String)"
});
formatter.result({
  "duration": 5237883900,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat StepDefination.signupdefination.user_enters_in_the_note_details(signupdefination.java:1155)\r\n\tat ✽.When User enters \"fdjgbrfhghojojyiojt59\" in the note details(signup.feature:145)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_enter_details_of_notes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_create_note_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_create_note()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_sort_by_date_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_see_that_notes_are_sorted_according_its_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_sort_by_date_last_modified()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_see_that_notes_are_sorted_according_its_date_last_modified()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_sort_by_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_see_that_notes_are_sorted_according_its_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_edit_button_to_edit_note()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_edit_the_note()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_in_note_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hey there",
      "offset": 13
    }
  ],
  "location": "signupdefination.user_enters_in_note_detail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_edit_my_personel_note_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_edit_the_note_on_clicking_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_clicks_on_delete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_have_to_accept_the_pop_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "signupdefination.user_is_able_to_see_previous_notes()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 227900,
  "status": "passed"
});
});