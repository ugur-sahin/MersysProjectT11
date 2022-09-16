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
