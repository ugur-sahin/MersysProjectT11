Feature: Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add ,Edit and Delete Document Types
    And Click on the element in the left Nav
      | setupOne |
      | parameters    |
      | DocumentTypes |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | selimDocuments |
      | Description | myDocuments |
    And Click on the element in the Dialog
      | Stage |
      | studentRegistration |
    And Click to TAB Key IC
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User edit item from Dialog IC
      | selimDocuments |
    And User sending the keys in Dialog content
      | nameInput | selimDocumentsss |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User delete item from Dialog IC
      | selimDocumentsss |
    And Success message should be displayed

