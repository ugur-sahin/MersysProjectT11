package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class TEST11_02_AttestationsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in the left Navigation Bar")
    public void clickOnTheElementInTheLeftNavigationBar(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            ln.findAndClick(listElement.get(i));
    }

    @And("Click on add attestations in the Dialog")
    public void clickOnAddAttestationsInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));

    }

    @And("Fill the input in Dialog content")
    public void fillTheInputInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
    @And("Click on save button in the Dialog")
    public void clickOnSaveButtonInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));
        }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @And("Edit attestation content {string} edit {string}")
    public void editAttestationContentEdit(String oldName, String newName) {
        dc.SearchAndEditry(oldName, newName);
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++)
            dc.SearchAndDeletery(listElement.get(i));
    }
}


