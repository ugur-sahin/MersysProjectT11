package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


import java.util.List;

public class TEST11_01_PositionCategoriesSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Click on the element in the left Nav ry")
    public void clickOnTheElementInTheLeftNavRy(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }
    @And("Click on the element in the Dialog ry")
    public void clickOnTheElementInTheDialogRy(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
    @And("User sending the keys in Dialog content ry")
    public void userSendingTheKeysInDialogContentRy(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
    @And("Success message should be displayed ry")
    public void successMessageShouldBeDisplayedRy() {
        dc.findAndContainsText("successMessage", "success");
    }
    @And("User editing on the Dialog content ry {string} edit {string}")
    public void userEditingOnTheDialogContentRyEdit(String oldName, String newName) {
        dc.SearchAndEditry(oldName, newName);
    }
    @And("User deleting on the dialog content ry {string}")
    public void userDeletingOnTheDialogContentRy(String searchText) {
        dc.SearchAndDeletery(searchText);
    }
}
