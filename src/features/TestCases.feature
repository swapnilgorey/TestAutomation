Feature: Youtube Search Validation
  Scenario: Search a video on Youtube with given text
    Given User launches Browser
    And Launches youtube website
    When Enters text in Search Field "Swapnil Gorey"
    Then Related Videos should be displayed
    Then Quit browser Session