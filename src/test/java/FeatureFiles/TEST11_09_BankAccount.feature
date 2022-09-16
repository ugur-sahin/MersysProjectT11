Feature: Bank Account Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | setupOne     |
      | parameters   |
      | bankAccounts |

  Scenario:
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput        | RichieRich       |
      | ibanInput        | TR0056 8965 1456 |
      | integrationInput | fitifiti         |
    And Click on the element in the Dialog
      | currencyInput |
      | currencyTRY   |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario:
    And Click on the element in the Dialog
      | rEdit |
    And Edit bank account in the Dialog sg
      | nameInput        | RichieRichist       |
      | ibanInput        | TR0056 8965 1456 22 |
      | integrationInput | 1199                |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario:
    And Click on the element in the Dialog
      | deleteButton    |
      | deleteDialogBtn |
    And Success message should be displayed