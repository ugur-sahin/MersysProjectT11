package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEST11_04_FieldsSteps {
    DialogContent dc = new DialogContent();

    @And("Click on the element in the Dialog stall")
    public void clickOnTheElementInTheDialogStall(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndClick(listElement.get(i));
        }
    }
}