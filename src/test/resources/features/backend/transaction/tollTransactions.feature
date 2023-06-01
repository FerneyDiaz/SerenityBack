Feature: Send toll transaction

  Background: Get ministry's token
    Given eks is able to eks service
    When He fetch ministry's access token
    Then He should see access token

    ##Mejorar con la consulta de saldo y su reduccion al realizar el paso

  Scenario Outline: Go through toll
    Given bsl is able to bsl service
    When He requests go through toll with <tollOperator> <account> <plate> <tid> <epc> <station> <lane>
    Then He should see successful response


    Examples:
    |tollOperator|account|plate|tid|epc|station|lane|
    |10172       |59633  |ROBOT100|E2003413013AFA20AAA61148|1922113147492887796420048|74|67000001001|