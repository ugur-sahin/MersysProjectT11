package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TEST11_11_DiscountsCategoriesSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Click on the element in the left Nav SK")
    public void clickOnTheElementInTheLeftNavSK(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog SK")
    public void clickOnTheElementInTheDialogSK(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content SK")
    public void userSendingTheKeysInDialogContentSK(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(2);
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            //listin ilk elemanına(weblement adı), ikinci elemanını yanş değeri döner
        }
    }

    @And("Success massage should be displayed SK")
    public void successMassageShouldBeDisplayedSK() {dc.findAndContainsText("successMessage", "success");
    }

    @And("User edit item from Dialog SK")
    public void userEditItemFromDialogSK(DataTable elements) {
        GWD.Bekle(3);
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(2);
            dc.SearchAndEdit(listElement.get(i));
        }
    }

    @And("User delete item from Dialog SK")
    public void userDeleteItemFromDialogSK(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(2);
            dc.SearchAndDeletery(listElement.get(i));
        }

    }
}
