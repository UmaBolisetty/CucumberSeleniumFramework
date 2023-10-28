@Regression @FailedApplicationCustomerSearch
Feature: As a banker, I want the ability to search for existing customers by customer/party
  group - Failed Application Customer

  Background: On banking customer screen
    Given I am on failed customer application search page

  @FailedApplicationCustomerSearch_lastName  @Smoke
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The lastname in my search result should have <lastName>

    Examples: 
      | lastName |
      | Petit |

  @FailedApplicationCustomerSearch_firstName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <firstName>
    When I enter valid existing customer firstName <firstName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The firstName in my search result should have <firstName>

    Examples: 
      | firstName |
      | Emmanuel    |

  @FailedApplicationCustomerSearch_taxID
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <TaxID>
    When I enter valid Tax ID existing customer <TaxID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Tax ID in my search result should have <TaxID>

    Examples: 
      | TaxID     |
      | 733953357 |

  @FailedApplicationCustomerSearch_phoneNumber
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <PhoneNumber>
    When I enter valid PhoneNumber of existing customer <PhoneNumber>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The PhoneNumber in my search result should have <PhoneNumber>

    Examples: 
      | PhoneNumber |
      |  2550286771 |

  @FailedApplicationCustomerSearch_email
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <Email>
    When I enter valid Email of existing customer <Email>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Email in my search result should match <Email>

    Examples: 
      | Email                            |
      | Emmanuel.Petit@futureusers.biz |

  @FailedApplicationCustomerSearch_DOB
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <DOB>
    When I enter valid DOB of existing customer <DOB>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The DOB in my search result should match <DOB>

    Examples: 
      | DOB        |
      | 1949-03-13 |

  @FailedApplicationCustomerSearch_CustomerID
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <CustomerID>
    When I enter valid CustomerID of existing customer <CustomerID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The CustomerID in my search result should match <CustomerID>

    Examples: 
      | CustomerID                           |
      | 391a1b03-aa52-496b-b01c-f57e4bfcef95 |

  @FailedApplicationCustomerSearch_InvalidLastName_BankingCustomer
  Scenario Outline: Search for existing customers by customer/party group Failed Application Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Messi    |
