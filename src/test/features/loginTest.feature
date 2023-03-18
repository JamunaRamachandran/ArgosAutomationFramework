Feature: Login Test

  @LoginTest
  Scenario: Verify login with valid emailId and password combination

    Given I am on HomePage "https://www.argos.co.uk/" with title "Argos"
    When I click account button and get redirect to login page
    And I do login with my EmailId "chandranjamuna@gmail.com" and password "argoslotus123?"
    Then I click signIn Button successfully login with username "Jamuna"
