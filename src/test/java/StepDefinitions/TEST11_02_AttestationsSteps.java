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

    @And("Edit attestation content {string} edit {string}")
    public void editAttestationContentEdit(String oldName, String newName) {
        dc.SearchAndEditry(oldName, newName);
    }
    @And("User delete item from Dialog SG")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++)
            dc.SearchAndDeletery(listElement.get(i));
    }
}


