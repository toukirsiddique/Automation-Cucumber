Feature: Signin Feature
  Background:
    Given User is on Signin page

  @login

  Scenario: Signin with Valid Credentials
    When User enters username "toukir.madrid@gmail.com" and password "dummy"
    And User clicks on login button
    Then user see the login page title "https://www.rokomari.com/book"

  Scenario: Try to Login with invalid password
    When User enters username "toukir.madrid@gmail.com" and password "1234"
    And User clicks on login button
    Then user see the login page title "https://www.rokomari.com/loginerror/"
    But user shouldn't see the account page title "https://www.rokomari.com/book"

  Scenario: Try to Login with invalid username
    When User enters username "toukir.madrid@gmail.coom" and password "dummy1234"
    And User clicks on login button
    Then user see the login page title "https://www.rokomari.com/loginerror/"
    But user shouldn't see the account page title "https://www.rokomari.com/book"

#  Scenario Outline: Try to login with invalid credentials
#    When user enter <username> and <password>
#    And User clicks on login button
#    Then user see the <error_message>
#    But user shouldn't see the <accountpage_title>
#
#    Examples:
#    |username                  |password|error_message                  |accountpage_title
#    |"toukir.madrid@gmail.com"|"1234"  |"Wrong email/phone or password"|"Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com"
#    |"toukir.madrid@gmail.coom"|"dummy"  |"Wrong email/phone or password"|"Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com"

