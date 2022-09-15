Feature: Attestations Features Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Navigation Bar
      | humanResources     |
      | setupThree         |
      | attestations       |
  Scenario: Add Attestations
    And Click on add attestations in the Dialog
      | addButton |
    And Fill the input in Dialog content
      | nameInput | grup11-8 |
    And Click on save button in the Dialog
      | saveButton |
    Then Success message should be displayed
    And Edit attestation content "grup11-8" edit "grup11-8edit"
    Then Success message should be displayed
    And User delete item from Dialog
      | grup11-8edit |
    Then Success message should be displayed