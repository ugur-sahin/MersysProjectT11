package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


import java.util.List;

public class TEST11_01_PositionCategoriesSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("User editing on the Dialog content ry {string} edit {string}")
    public void userEditingOnTheDialogContentRyEdit(String oldName, String newName) {
        dc.SearchAndEditry(oldName, newName);
    }
    @And("User deleting on the dialog content ry {string}")
    public void userDeletingOnTheDialogContentRy(String searchText) {
        dc.SearchAndDeletery(searchText);
    }
}
