package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TEST11_03_DocumentTypesSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();

    @And("User delete item from Dialog IC")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndDeletery(listElement.get(i));
        }
    }
    @And("User edit item from Dialog IC")
    public void userEditItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(1);
            dc.SearchAndEdit(listElement.get(i));
        }
    }
    @And("Click to TAB Key IC")
    public void clickToTABKeyIC() {
        GWD.Bekle(2);
        Actions actions = new Actions(GWD.getDriver());
        actions.click().keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
    }
}
