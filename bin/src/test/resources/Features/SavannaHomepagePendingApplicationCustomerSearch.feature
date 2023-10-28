@Regression @PendingApplicationCustomerSearch
Feature: As a banker, I want the ability to search for existing customers by customer/party
  group - Pending Application Customer

  Background: On banking customer screen
    Given I am on pending customer application search page

  @PendingApplicationCustomerSearch_lastName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The lastname in my search result should have <lastName>

    Examples: 
      | lastName |
      | Nwankwo  |

  @PendingApplicationCustomerSearch_firstName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <firstName>
    When I enter valid existing customer firstName <firstName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The firstName in my search result should have <firstName>

    Examples: 
      | firstName |
      | Kanu      |

  @PendingApplicationCustomerSearch_taxID
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <TaxID>
    When I enter valid Tax ID existing customer <TaxID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Tax ID in my search result should have <TaxID>

    Examples: 
      | TaxID     |
      | 758899313 |

  @PendingApplicationCustomerSearch_phoneNumber
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <PhoneNumber>
    When I enter valid PhoneNumber of existing customer <PhoneNumber>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The PhoneNumber in my search result should have <PhoneNumber>

    Examples: 
      | PhoneNumber |
      |  5256334390 |

  @PendingApplicationCustomerSearch_email
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <Email>
    When I enter valid Email of existing customer <Email>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Email in my search result should match <Email>

    Examples: 
      | Email                               |
      | Kanu.Nwankwo@corporateparadigms.com |

  @PendingApplicationCustomerSearch_DOB
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <DOB>
    When I enter valid DOB of existing customer <DOB>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The DOB in my search result should match <DOB>

    Examples: 
      | DOB        |
      | 1965-02-01 |

  @PendingApplicationCustomerSearch_CustomerID
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <CustomerID>
    When I enter valid CustomerID of existing customer <CustomerID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The CustomerID in my search result should match <CustomerID>

    Examples: 
      | CustomerID                           |
      | 535e746b-622d-46a0-9a2d-a2e0c8ccbbf9 |

  @PendingApplicationCustomerSearch_InvalidLastName_BankingCustomer
  Scenario Outline: Search for existing customers by customer/party group Pending Application Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Messi    |
