Feature: Search for Jobs on NHS Jobs Website
  
  @Regression
  Scenario Outline: Search for Jobs with Preferences and Sort by Newest
    Given I am on the NHS Jobs website 'https://www.jobs.nhs.uk/candidate/search'
    When I enter "<SearchTerm>" in the search field
    And I select "<Location>" from the location dropdown
    And I click on the search button
    Then I should see a list of jobs matching my search criteria "<SearchTerm>"
    And the search results should be sorted with the newest job posted at the top
    Examples:
      | SearchTerm | Location | 
      | Nurse       | London    |
      | Doctor      | Kent | 
      | Therapist   |           |
      |             | Wales |
      |             |           | 
      | Unknown Job | London    |
   @Regression
   Scenario: Search for Jobs with Preferences,Sort by Newest and distance
    Given I am on the NHS Jobs website 'https://www.jobs.nhs.uk/candidate/search'
    When I enter "Clinician" in the search field
    And I select "Nottingham" from the location dropdown
    And I select "+10 Miles" distance
    And I click on the search button
    Then I should see a list of jobs matching my search criteria "<SearchTerm>"
    And the search results should be sorted with the newest job posted at the top
    @Sanity
   Scenario: Search for Jobs with Preferences,Sort by Newest and distance
    Given I am on the NHS Jobs website 'https://www.jobs.nhs.uk/candidate/search'
    When I enter "Clinician" in the search field
    And I select "Nottingham" from the location dropdown
    And I select "+10 Miles" distance
    And I click on the more search options button
    And I select Payrange £30,000 to £40,000
    And I click on the search button
    Then I should see a list of jobs matching my search criteria "<SearchTerm>"
    And the search results should be sorted with the newest job posted at the top
      
  @Negative
  Scenario: Search for Jobs with invalid input
    Given I am on the NHS Jobs website 'https://www.jobs.nhs.uk/candidate/search'
    When I enter "*" in the search field
    And I click on the search button
    Then I should see a No results found for "*"
  @Negative
  Scenario: Search for Jobs with invalid location
    Given I am on the NHS Jobs website 'https://www.jobs.nhs.uk/candidate/search'
    When I select "Landmere" from the location dropdown
    And I click on the search button
    Then I should see "Location not found" message
#
