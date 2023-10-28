@Regression @DeceasedCustomerSearch
Feature: As a banker, I want the ability to search for existing customers by customer/party
  group - Deceased Customer

  Background: On banking customer screen
    Given I am on Deceased Customer page

  @DeceasedCustomerSearch_lastName  @Smoke
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The lastname in my search result should have <lastName>

    Examples: 
      | lastName |
      | Maradona |

  @DeceasedCustomerSearch_firstName @Smoke
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <firstName>
    When I enter valid existing customer firstName <firstName>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The firstName in my search result should have <firstName>

    Examples: 
      | firstName |
      | Diego     |

  @DeceasedCustomerSearch_taxID
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <TaxID>
    When I enter valid Tax ID existing customer <TaxID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Tax ID in my search result should have <TaxID>

    Examples: 
      | TaxID     |
      | 147099497 |

  @DeceasedCustomerSearch_phoneNumber
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <PhoneNumber>
    When I enter valid PhoneNumber of existing customer <PhoneNumber>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The PhoneNumber in my search result should have <PhoneNumber>

    Examples: 
      | PhoneNumber |
      |  4088404756 |

  @DeceasedCustomerSearch_email
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <Email>
    When I enter valid Email of existing customer <Email>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The Email in my search result should match <Email>

    Examples: 
      | Email                            |
      | Diego.Maradona@legacyutilize.net |

  @DeceasedCustomerSearch_DOB
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <DOB>
    When I enter valid DOB of existing customer <DOB>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The DOB in my search result should match <DOB>

    Examples: 
      | DOB        |
      | 1936-04-24 |

  @DeceasedCustomerSearch_CustomerID
  Scenario Outline: Search for existing customers by customer/party group Deceased Customer <CustomerID>
    When I enter valid CustomerID of existing customer <CustomerID>
    And I click on Search button
    Then I should be navigated to Search Result page
    And The CustomerID in my search result should match <CustomerID>

    Examples: 
      | CustomerID                           |
      | 3ae7869e-846b-44a7-9a31-30a61429953b |

  @DeceasedCustomerSearch_InvalidLastName_BankingCustomer
  Scenario Outline: Search for existing customers by customer/party group Banking Customer <lastName>
    When I input valid existing customer lastName <lastName>
    And I click on Search button
    Then I should see the no-result-found Search Result page

    Examples: 
      | lastName |
      | Messi    |
