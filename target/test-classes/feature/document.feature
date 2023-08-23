Feature: Project Document

@amazon  @uid
Scenario: Amazon Userid Test
    Given Browser "chrome" is open with url "https://www.amazon.in/"
    And i click signin 
    When I enter userid "paragguide@yahoo.co.in"
    And click continue
    Then password txtbox must come
 
 @amazon @pwd
 Scenario: Amazon password Test  
     Given userid is valid
     When I enter invalid password
     Then error must come 
     
@google    
Scenario Outline: Google Test
    Given I went to <url>
    When I search for the <product> for location <location>
    Then search result must come

    Examples: 
      |url| product | location |
      |https://www.google.com      | pizza |  Delhi |   
      |https://www.google.com      | burger |  Lucknow |   
  