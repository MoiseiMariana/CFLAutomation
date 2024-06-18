@regressionPack
Feature: Place an order with CFL address

  Scenario Outline: Place an order journey(without clicking on place order button)
    Given open application
    When accept cookies
    And hover to Broadband
    And click on three giga fast
    And select Three GB Premium WiFi
    When enter "<address>"
    And click on address
    And enter "Mariana" First Name
    And enter "Test" Last Name
    And enter "mariana.moisei@communityfibre.co.uk" Email
    And enter "07777777777" Mobile Number
    And click on Next
    And click on right row of calendar to switch the week
    And click on right row of calendar to switch the week again
    And select a day
    And click on Confirm and Proceed to Payment
    When enter "Mariana Test" Account Holder Name
    And enter "70872490" Account Number
    And enter "20-00-00" Sort Code
    And click on Proceed to Order Summary
    Then is displayed place order button

    Examples:
      | address                            |
      | 1 Vancouver Road, London, SE23 2AG |



