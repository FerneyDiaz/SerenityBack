Feature: Fetch total,black and partial list created every day

  Background: Get ministry's token
    Given eks is able to eks service
    When He fetch ministry's access token
    Then He should see access token
  @test
  Scenario: Fetch total day list
    Given bsl is able to bsl service
    When He request total day list to toll operator 10172
    Then He should see total today list

