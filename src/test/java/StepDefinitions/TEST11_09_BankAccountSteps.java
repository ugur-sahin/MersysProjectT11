package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Utilities.GWD.driver;

public class TEST11_09_BankAccountSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on save button in the Dialog sg")
    public void clickOnSaveButtonInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
           dc.findAndClick(listElement.get(i));
    }
    @And("Edit bank account in the Dialog sg")
    public void editBankAccountInTheDialog(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }
    @And("Delete account from the list in the Dialog sg")
    public void deleteAccountFromTheListInTheDialog(String searchText) {
        dc.SearchAndDelete(searchText);
    }
    @And("User click on the currency sg")
    public void userClickOnTheCurrencySg() {
      //  WebElement menu = driver.findElement(By.cssSelector("[class='mat-select-arrow ng-tns-c93-84']"));
      //  Select ddmenu = new Select(menu);
      //  GWD.Bekle(1);
      //  ddmenu.selectByIndex(1);
      //  GWD.Bekle(1);
        GWD.Bekle(2);
        Actions actions = new Actions(GWD.getDriver());
        actions.click().keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
    }
}




