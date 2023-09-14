Feature: Application Login
  Scenario Outline: Login with Different username and password
    Given User is on landing page
    When User logs in with his "<username>" and "<password>"
    Then Home page is displayed
    And User information is displayed
    Examples:
      | username | password |
      | Sanjay | pass1 |
      | Darsh | pass2 |