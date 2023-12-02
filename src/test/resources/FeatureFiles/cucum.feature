Feature: Verifying Omrbranch Login Details

  Scenario: Verify Login with Valid Credentials
    Given User is on Login Page
    When User Enter Username and Password
    And User Click Login button
    Then User Should Verify Login Success Message

  ##  Single User
  Scenario Outline: Verify Login with Valid Credentials
    Given User is on Login Page
    When User Enter "Mohamed" and "kalifa@123"
    And User Click Login button
    Then User Should Verify Login Success Message

  ## Multiple User
  Scenario Outline: Verify Login with Valid Credentials
    Given User is on Login Page
    When User Enter "<username>" and "<password>"
    And User Click Login button
    Then User Should Verify Login Success Message

    Examples: 
      | username | password  |
      | Mohamed  | Kal@123   |
      | Yuvraj   | Yuv@123   |
      | MAx      | Max@123   |
      | Srini    | Srini@123 |
      | Ajay     | Ajay@123  |
