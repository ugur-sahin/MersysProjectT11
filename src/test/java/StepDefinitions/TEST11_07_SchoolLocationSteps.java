package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEST11_07_SchoolLocationSteps {
    DialogContent dc = new DialogContent();
    @And("User Edit Location in the Dialog Content US")
    public void userEditLocationInTheDialogContentUS(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
}
