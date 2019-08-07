Feature: Morgtage calculator
  As a user I am able to use mortgage calculator to calculate my home mortgage

  Background: Cal
    Given my anm
    When  thsi job



  Scenario Outline: User can calculate their mortgage using calculator
  Given User is on morgtagecalculator home page
  Then User verify home page
  Then User enter "<HomePrice>"
  Then User enter down "<DownPayment>"
  Then User select down payment method
  Then User provide loan "<LoanTerm>"
  Then User enters interest "<Irate>"
  Then user select start month
  Then User enter starting "<StartYear>"
  Then User enter property "<ProTax>"
  Then User select property tax method
  Then User enters home "<HomeInsurace>"
  Then User select home insurance mehtod
  Then User enter PMI "<Pminsurance>"
  Then user select PMI method
  Then user provides HOA "<Hoafees>"
  Then User select HOA fee method
  Then User entered other "<OthersCosts>"
  Then Users selected other cost method
  Then User click on calculate button
  Examples:
           |HomePrice| DownPayment|LoanTerm|Irate|StartYear|ProTax|HomeInsurace|Pminsurance|Hoafees|OthersCosts|
           |230000   | 20         | 30     | 4.6 | 2010    | 1.3  |1240        |   1.23    |  1520 | 2.4       |

//
  Scenario: Annual tax and cost other insurance
  Given Property Taxes Increase
  When Home Insurance Increase
  Then HOA Fee Increase
  Then Other Costs Increase
