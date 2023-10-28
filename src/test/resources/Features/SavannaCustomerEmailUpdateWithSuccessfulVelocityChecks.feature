@Smoke @Regression @UpdateCustomersEmailUpdateWithSuccessfullVelocityCheck
Feature: Bankers can update a customers email without needing approval from back office
  if velocity checks are successful

  Background: On customers task list page
    Given I am on banking customer task list page

  @CustomerEmailUpdateWithLast4DigitsOfSSNCheck
  Scenario Outline: Update customers email with a successful knowledge based verification with last 4 digits of ssn
    When I successfully login to customer <lastName> page by selecting knowledge based verification with last 4 digits of ssn <VerificationCheck>
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | Email             |
      | Jimenez  | Last_4_digits_of_SSN | 123gb@gmamail.com |

  @CustomerEmailUpdateWithMothersMaidenNameCheck
  Scenario Outline: Update customers email with a successful knowledge based verification with Mother Maiden Name
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Mother Maiden Name <VerificationCheck>
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | Email             |
      | Jimenez  | Mother_Maiden_Name | 123gb@gmamail.com |

  @CustomerEmailUpdateWithDateOfBirthCheck
  Scenario Outline: Update customers email with a successful knowledge based verification with Date of Birth
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Date of Birth <VerificationCheck>
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | Email             |
      | Jimenez  | Date_of_Birth | 123gb@gmamail.com |

  @CustomerEmailUpdateWithTelephoneNumberCheck @Smoke
  Scenario Outline: Update customers email with a successful knowledge based verification with Telephone Number
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Telephone Number <VerificationCheck>
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | Email             |
      | Jimenez  | Telephone_Number | 123gb@gmamail.com |

  @CustomerEmailUpdateWithEmailAddressCheck
  Scenario Outline: Update customers email with a successful knowledge based verification with Email Address
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Email Address <VerificationCheck>
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | Email             |
      | Jimenez  | Email_Address | 123gb@gmamail.com |

  @CustomerEmailUpdateWithOtherCheck
  Scenario Outline: Update customers email with a successful knowledge based verification with Other
    When I successfully login to customer <lastName> page by selecting knowledge based verification with Other <VerificationCheck>
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | VerificationCheck    | Email             |
      | Jimenez  | Other | 123gb@gmamail.com |

  @CustomerEmailUpdateWithMultifactorAuthenticationTextOptionCheck
  Scenario Outline: Update customers email with a successful multi-factor authentication with send code via text option
    When I successfully login to customer <lastName> page by selecting multi-factor authentication with send code via text option
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | Email             |
      | Jimenez  | 123gb@gmamail.com |

  @Smoke @CustomerEmailUpdateWithMultifactorAuthenticationEmailOptionCheck @Smoke
  Scenario Outline: Update customers email with a successful multi-factor authentication with send code via email option
    When I successfully login to customer <lastName> page by selecting multi-factor authentication with send code via email option
    And I update customers email with <Email>
    And I click on email field submit button
    Then Customers email update should be successful without approval from back office

    Examples: 
      | lastName | Email             |
      | Jimenez  | 123gb@gmamail.com |
