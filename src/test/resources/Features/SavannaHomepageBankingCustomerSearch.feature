@Regression @BankingCustomerSearch
Feature: As a banker, I want the ability to search for existing customers by customer/party
  group - Banking Customer

  Background: On banking customer screen
    Given I am on Banking Customer page

  @BankingCustomerSearch_lastName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The lastname in my search result should have <lastName>

    Examples: 
      | lastName |
      | Ronaldo  |

  @BankingCustomerSearch_firstName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <firstName>
    When I enter valid existing customer firstName <firstName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The firstName in my search result should have <firstName>

    Examples: 
      | firstName |
      | Cristiano |

  @BankingCustomerSearch_taxID
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <TaxID>
    When I enter valid Tax ID existing customer <TaxID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Tax ID in my search result should have <TaxID>

    Examples: 
      | TaxID     |
      | 845619371 |

  @BankingCustomerSearch_phoneNumber
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <PhoneNumber>
    When I enter valid PhoneNumber of existing customer <PhoneNumber>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The PhoneNumber in my search result should have <PhoneNumber>

    Examples: 
      | PhoneNumber |
      |  1269098656 |

  @BankingCustomerSearch_email
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <Email>
    When I enter valid Email of existing customer <Email>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Email in my search result should match <Email>

    Examples: 
      | Email                                  |
      | Cristiano.Ronaldo@seniortransform.info |

  @BankingCustomerSearch_DOB
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <DOB>
    When I enter valid DOB of existing customer <DOB>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The DOB in my search result should match <DOB>

    Examples: 
      | DOB        |
      | 1975-10-22 |

  @BankingCustomerSearch_CustomerID
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <CustomerID>
    When I enter valid CustomerID of existing customer <CustomerID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The CustomerID in my search result should match <CustomerID>

    Examples: 
      | CustomerID                           |
      | bbfc4e9b-da27-4b53-9fd0-b7e4648bc1cc |

  @BankingCustomerSearch_InvalidLastName_Deceased
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Maradona |
