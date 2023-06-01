Feature: test
  Scenario: test get request
    When prepare get endpoint

    Scenario: Get token ministry
      When He fetch token ministry
      Then He should see token ministry

      Scenario: Post request sample
        When He requests go through toll
        Then He should see success response

