Feature: SearchProduct

  Scenario: Search product on Home page with success
    Then Input product name "Faded Short Sleeve T-shirts"
    Then Click button search
    Then Content with "Faded Short Sleeve T-shirts" visible

  Scenario: Search product on Home page if product doesn't exist
    Then Input product name "I'm not here"
    Then Click button search
    Then Content with "No results were found for your search" visible