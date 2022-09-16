Feature: Bank Account Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |
  Scenario:
    And Click on the element in the Dialog sg
      | addButton |
    And User sending the keys in Dialog content sg
      | nameInput | RichieRich       |
      | ibanInput | TR0056 8965 1456 |
      | integrationInput | fitifiti |
    And Click on the element in the Dialog sg
      | currencyInput |
      | currencyTRY |
    And Click on save button in the Dialog sg
      | saveButton |
    And success message should be displayed
  Scenario:
    And Click on the element in the Dialog ry
      | rEdit |
    And Edit bank account in the Dialog sg
      | nameInput | RichieRichist       |
      | ibanInput | TR0056 8965 1456 22 |
      | integrationInput | 1199 |
    And Click on save button in the Dialog sg
      | saveButton |
    And success message should be displayed
  Scenario:
    And Click on the element in the Dialog ry
      | deleteButton |
      | deleteDialogBtn |
    And Success message should be displayed ry