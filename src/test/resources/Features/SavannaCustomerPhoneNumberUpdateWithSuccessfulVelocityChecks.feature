@Regression @UpdateCustomersPhoneNumberUpdateWithSuccessfullVelocityCheck
Feature: Bankers can update a customers phone number without needing approval from back office
  if velocity checks are successful

  Background: On customers task list page
    Given I am on banking customer task list page

  @CustomerPhoneNumberUpdateWithLast4DigitsOfSSNCheck @Smoke
  Scenario Outline: Update customers phone number with a successful knowledge based verification with last 4 digits of ssn
    When I successfully login to customer <lastName> page by selecting knowledge based verification with last 4 digits of ssn <VerificationCheck>
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | VerificationCheck    | PhoneNumber |
      | Hernandez | Last_4_digits_of_SSN |  1234567890 |

  @CustomerPhoneNumberUpdateWithMothersMaidenNameCheck
  Scenario Outline: Update customers phone number with a successful knowledge based verification with Mother Maiden Name
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Mother Maiden Name <VerificationCheck>
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | VerificationCheck  | PhoneNumber |
      | Hernandez | Mother_Maiden_Name |  1234567890 |

  @CustomerPhoneNumberUpdateWithDateOfBirthCheck
  Scenario Outline: Update customers phone number with a successful knowledge based verification with Date of Birth
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Date of Birth <VerificationCheck>
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | VerificationCheck | PhoneNumber |
      | Hernandez | Date_of_Birth     |  1234567890 |

  @CustomerPhoneNumberUpdateWithTelephoneNumberCheck @bobobo
  Scenario Outline: Update customers phone number with a successful knowledge based verification with Telephone Number
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Telephone Number <VerificationCheck>
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | VerificationCheck | PhoneNumber |
      | Hernandez | Telephone_Number  |  1234567890 |

  @CustomerPhoneNumberUpdateWithEmailAddressCheck @bobobo
  Scenario Outline: Update customers phone number with a successful knowledge based verification with Email Address
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Email Address <VerificationCheck>
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | VerificationCheck | PhoneNumber |
      | Hernandez | Email_Address     |  1234567890 |

  @CustomerPhoneNumberUpdateWithOtherCheck
  Scenario Outline: Update customers phone number with a successful knowledge based verification with Other
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Other <VerificationCheck>
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | VerificationCheck | PhoneNumber |
      | Hernandez | Other             |  1234567890 |

  @Smoke @CustomerPhoneNumberUpdateWithMultifactorAuthenticationTextOptionCheck @Smoke
  Scenario Outline: Update customers phone number with a successful multi-factor authentication with send code via text option
    When I successfully login to customer <lastName> page by selecting multi-factor authentication with send code via text option
    And I update customers PhoneNumber with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName  | PhoneNumber |
      | Hernandez |  1234567890 |

  @CustomerPhoneNumberUpdateWithMultifactorAuthenticationEmailOptionCheck @Smoke
  Scenario Outline: Update customers email with a successful multi-factor authentication with send code via email option
    When I successfully login to customer <lastName> page by selecting multi-factor authentication with send code via email option
    And I update customers email with <PhoneNumber>
    And I click on PhoneNumber field submit button
    Then Customers PhoneNumber update should be successful without approval from back office

    Examples: 
      | lastName | Email             |
      | Jimenez  | 123gb@gmamail.com |
