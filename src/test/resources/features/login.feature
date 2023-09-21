Feature: Login

  @loginsuccesfylly
  Scenario: Login succesfully
    Given he user entre the website
    When he user enter with credentials
      | user          | password     |
      | standard_user | secret_sauce |
    Then he could succesfully

    @loginincorrectly
    Scenario: Login Incorrectly
      Given he user entre the website
      When he user enter with incorrect credentials
        | user          | password     |
        | standard_user | rosa |
      Then he login wrong