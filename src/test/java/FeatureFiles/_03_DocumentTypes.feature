Feature: Document Types Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Add a Document Types
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | DocumentTypes |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput   | selimDocument |
      | Description | myDocument    |
    And Click on the element in the left Nav
      | Stage   |
#    And Click on the element in the Dialog
#      | saveButton |
#    And  Success message should be displayed