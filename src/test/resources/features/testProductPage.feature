Feature: H&M basic functionality
  H&M Product verification

  Scenario Outline: Positive Test a Product
    Given I know the product details
    When I am on a product page "<product>"
    Then I see the matching price "<price>", rating "<rating>", name "<name>", cateogories "<cate>"

    Examples: 
      | product | price       | rating | name | cate |
      | a       | kfVsfOSbJY0 | a      | a    | a    |
      | a       | 4JkIs37a2JE | a      | a    | a    |
      | a       | fTH71AAxXmM | a      | a    | a    |

  Scenario Outline: Negative Test of a Product
    Given I know a product doesn't exist
    When I enter the product page "<product>"
    Then I should see broken link page

    Examples: 
      | product |
      | a       |
