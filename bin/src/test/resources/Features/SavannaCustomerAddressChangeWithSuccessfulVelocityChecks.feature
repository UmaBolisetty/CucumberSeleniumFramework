@Regression @UpdateCustomersAddressWithSuccessfullVelocityCheck
Feature: Bankers can update a customers address without needing approval from back office
  if velocity checks are successful

  Background: On customers task list page
    Given I am on banking customer task list page

  @CustomerAddressChangeWithLast4DigitsOfSSNCheck @Smoke
  Scenario Outline: Update customers address with a successful knowledge based verification with last 4 digits of ssn
    When I successfully login to customer <lastName> page by selecting knowledge based verification with last 4 digits of ssn <VerificationCheck>
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | AddressLine1    | City | State      | Zipcode | Country                  |
      | Okocha   | Last_4_digits_of_SSN | 1234 yola Drive | Ben  | California |   48542 | United States of America |

  @CustomerAddressChangeWithMothersMaidenNameCheck 
  Scenario Outline: Update customers address with a successful knowledge based verification with Mother Maiden Name
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Mother Maiden Name <VerificationCheck>
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck  | AddressLine1    | City        | State      | Zipcode | Country                  |
      | Okocha   | Mother_Maiden_Name | 334 London Lane | San Leandro | California |   94548 | United States of America |

  @CustomerAddressChangeWithDateOfBirthCheck
  Scenario Outline: Update customers address with a successful knowledge based verification with Date of Birth
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Date of Birth <VerificationCheck>
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck | AddressLine1    | City | State   | Zipcode | Country                  |
      | Okocha   | Date_of_Birth     | 987 Bobby Drive | Bjay | Alabama |   94545 | United States of America |

  @CustomerAddressChangeWithTelephoneNumberCheck
  Scenario Outline: Update customers address with a successful knowledge based verification with Telephone Number
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Telephone Number <VerificationCheck>
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck | AddressLine1   | City    | State    | Zipcode | Country                  |
      | Okocha   | Telephone_Number  | 453 Ohio Drive | Hayward | Michigan |   94542 | United States of America |

  @CustomerAddressChangeWithEmailAddressCheck
  Scenario Outline: Update customers address with a successful knowledge based verification with Email Address
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Email Address <VerificationCheck>
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck | AddressLine1     | City       | State    | Zipcode | Country                  |
      | Okocha   | Email_Address     | 23 Detroit Drive | Washington | Michigan |   48065 | United States of America |

  @CustomerAddressChangeWithOtherCheck
  Scenario Outline: Update customers address with a successful knowledge based verification with Other
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Other <VerificationCheck>
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck | AddressLine1         | City   | State   | Zipcode | Country                  |
      | Okocha   | Other             | 1234 Birmingham Lane | Crooks | Chicago |   94654 | United States of America |

  @CustomerAddressChangeWithMultifactorAuthenticationTextOptionCheck
  Scenario Outline: Update customers address with a successful multi-factor authentication with send code via text option
    When I successfully login to customer <lastName> page by selecting multi-factor authentication with send code via text option
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | AddressLine1    | City       | State   | Zipcode | Country                  |
      | Okocha   | 472 Rattoo Lane | Crookberry | NewYork |   94654 | United States of America |

  @CustomerAddressChangeWithMultifactorAuthenticationEmailOptionCheck
  Scenario Outline: Update customers address with a successful multi-factor authentication with send code via email option
    When I successfully login to customer <lastName> page by selecting multi-factor authentication with send code via email option
    And I update customers address with AddressLine1 <AddressLine1>
    And I update customers address with City <City>
    And I update customers address with State <State>
    And I update customers address with Zipcode <Zipcode>
    And I update customers address with Country <Country>
    And I click on submit button
    Then Customers address update should be successful without approval from back office

    Examples: 
      | lastName | AddressLine1   | City   | State   | Zipcode | Country                  |
      | Okocha   | 3456 Bham Lane | Brooks | Chicago |   65654 | United States of America |
