package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _03_DocumentSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List <String> listElement = elements.asList(String.class);

        for (int i=0; i<listElement.size(); i++){
            // System.out.println("listElement = " + listElement.get(i));
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        dc.findAndClick("addButton");
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List <List<String>> listElement = elements.asLists(String.class);
        for (int i=0; i<listElement.size(); i++){
            // System.out.println("listElement = " + listElement.get(i));
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
            // listin ilk elemanına (webelement adı) , ikinci elemanı yani değeri gönder
        }

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }
}
