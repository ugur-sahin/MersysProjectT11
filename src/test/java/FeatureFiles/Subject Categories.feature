#Feature: Subject Categories
#
#  Background:
#    Given Navigate to basqar
#    When Enter username and password and click login button
#    Then User should login successfuly
#
#
#  Scenario: Add Subject Categories,Edit Subject Categories and Delete Subject Categories
#    And Click on the element in the left Nav
#      | Education         |
#      | EducationSetup    |
#      | SubjectCategories |
#    And Click on the element in the Dialog
#      | addButton |
#    And User sending the keys in Dialog content
#      | nameInput | group11 |
#      | codeInput | group11 |
#    And Click on the element in the Dialog
#      | saveButton |
#    And Success massage should be displayed
#    And User edit item from Dialog
#      | group11 |
#    And User sending the keys in Dialog content
#      | codeInput | group |
#    And Click on the element in the Dialog
#      | saveButton |
#    And Success massage should be displayed
#    And User delete item from Dialog
#      | group11 |
#    And Success massage should be displayed
#
