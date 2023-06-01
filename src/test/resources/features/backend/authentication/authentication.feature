Feature: Get authentication token to BackOffice, PJ or PN

  Scenario: Get ministry's token
    Given eks is able to eks service
    When He fetch ministry's access token
    Then He should see access token