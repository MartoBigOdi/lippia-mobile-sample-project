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
    And the user click darkmode
    Then verify checkbox status <checkboxStatus>

    @Demo
    Examples:
      | email                | password | checkboxStatus
      | martin.vasconcelo@gmail.com | marto1234 | false