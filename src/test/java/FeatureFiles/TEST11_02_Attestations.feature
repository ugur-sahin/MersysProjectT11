Feature: Attestations Features Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in the left Nav
      | humanResources |
      | setupThree     |
      | attestations   |

  Scenario: Add Attestations
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | grup11-8 |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    And Edit attestation content "grup11-8" edit "grup11-9edit"
    Then Success message should be displayed
    And User delete item from Dialog SG
      | grup11-9edit |
    Then Success message should be displayed