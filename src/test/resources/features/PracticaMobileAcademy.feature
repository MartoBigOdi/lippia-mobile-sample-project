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
