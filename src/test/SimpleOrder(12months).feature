@regressionPack
Feature: Place an order with CFL address

  Scenario Outline: Place an order journey(without clicking on place order button)
    Given open application
    When accept cookies
    When enter "<address>"
    And click on address
    And select twelve months
    And select one "<BBcard_12months>"
    And click on Continue
    And click on Go to checkout
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
      | address                                     | BBcard_12months            |
      | 1 Vancouver Road, London, SE23 2AG          | RES_BB12_STD_150MB_27_SU0  |
      | 8 Watermill Close, Bexhill-On-Sea, TN39 5EJ | RES_BB12_AFF_1000MB_32_SU0 |


