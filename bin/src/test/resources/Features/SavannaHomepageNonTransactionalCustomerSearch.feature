@Regression @NonTransactionalCustomerSearch
Feature: As a banker, I want the ability to search for existing customers by customer/party
  group - NonTransactional Customer

  Background: On banking customer screen
    Given I am on NonTransactional Customer page

  @NonTransactionalCustomerSearch_lastName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The lastname in my search result should have <lastName>

    Examples: 
      | lastName |
      | Adeleke  |

  @NonTransactionalCustomerSearch_firstName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <firstName>
    When I enter valid existing customer firstName <firstName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The firstName in my search result should have <firstName>

    Examples: 
      | firstName |
      | David     |

  @NonTransactionalCustomerSearch_taxID
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <TaxID>
    When I enter valid Tax ID existing customer <TaxID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Tax ID in my search result should have <TaxID>

    Examples: 
      | TaxID     |
      | 123456789 |

  @NonTransactionalCustomerSearch_DOB
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <DOB>
    When I enter valid DOB of existing customer <DOB>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The DOB in my search result should match <DOB>

    Examples: 
      | DOB        |
      | 1950-11-23 |

  @NonTransactionalCustomerSearch_InvalidLastName_BankingCustomer
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Messi    |

  @NonTransactionalCustomerSearch_InvalidLastName_DeceasedCustomer
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Maradona |

  @NonTransactionalCustomerSearch_InvalidLastName_PendingApplicationCustomer
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Nwankwo  |
