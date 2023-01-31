Feature: US-321 Searching the employee

  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on EmployeeList option


  @batch14 @sprint4
  Scenario: Search employee by id
    When user enter valid employee id
    And user clicks on search button
    Then user see employee information is displayed
    Then user clicks on the emp name
    When users click on employee details
    Then user click on Edit option
    And users is able to check Address Street


  @sprint4 @test
  Scenario: Search employee by name
   # Given user is navigated to HRMS application
   # When user enters valid username and valid password
   # And user clicks on login button
   # Then user is successfully logged in
   # When user clicks on PIM option
   # And user clicks on EmployeeList option
    #When user enters valid employee name
    And user clicks on search button
    Then user see employee information is displayed
