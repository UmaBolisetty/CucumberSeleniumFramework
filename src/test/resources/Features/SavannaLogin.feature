@Smoke @Regression @Sanity
Feature: As a banker, i want to successfully login to Savanna home page

  @Login @Smoke
  Scenario Outline: Login to Savanna with valid credentials
    Given I am on savanna website
    When I enter <username> and <password>
    And I click on SLP login button
    Then I should be on savanna home page

    Examples: 
      | username | password         |
      | onikoyi  | PASSWORDlolade2* |
