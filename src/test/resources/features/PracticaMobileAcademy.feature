Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: Login user
    Given The app is loaded correctly
    When The user goes to the Log in page
    Then Home page is displayed
    When The user logs in the application with: <email>, <password>
    Then Login Ok

    @Demo
    Examples:
      | email                | password |
      | martin.vasconcelo@gmail.com | marto1234 |



  Scenario Outline: Click checkbox
    Given The app is loaded correctly
    When The user goes to the Log in page
    When The user logs in the application with: <email>, <password>
    Then Login Ok
    When The user clicks menu
    And The user clicks settings
    And the user clicks darkmode
    Then verify checkbox status <checkboxStatus>

    @Demo
    Examples:
      | email                       | password | checkboxStatus |
      | martin.vasconcelo@gmail.com | marto1234 | false |


  Scenario Outline: Add task
    Given The app is loaded correctly
    When The user goes to the Log in page
    When The user logs in the application with: <email>, <password>
    Then Login Ok
    When The user clicks the project
    And The user clicks Tasks
    And The user clicks add task
    When The user enters the name of the "Fluber: test automation 6"
    And The user clicks add
    And The user clicks save
    Then verify the name <task>

    @Demo
    Examples:
      | email                       | password | task |
      | martin.vasconcelo@gmail.com |marto1234|  Fluber: "Fluber: test automation 6" |