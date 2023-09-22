Feature: Login
<<<<<<< HEAD
Background:
  Given he user entre the website
=======
 Background:
   Given he user entre the website
>>>>>>> 908976e339c28b5f548375363d0d783b31bbce5e
  @loginsuccesfylly
  Scenario: Login succesfully
    When he user enter with credentials
      | user          | password     |
      | standard_user | secret_sauce |
    Then he could succesfully

    @loginincorrectly
    Scenario: Login Incorrectly
      When he user enter with incorrect credentials
        | user          | password     |
        | standard_user | rosa |
      Then he login wrong