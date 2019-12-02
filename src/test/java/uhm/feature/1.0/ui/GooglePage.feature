@UI
Feature: GoogleFeature

  Scenario: Seach and verify
    Given I navigate to the home page
    And I enter the following for Search
      | SearchInput |
      | Selenium  |
    And I click Search button
    Then I should see the Search Result