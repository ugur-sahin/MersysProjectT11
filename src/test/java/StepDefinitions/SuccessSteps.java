package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class SuccessSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayedRy() {
        dc.findAndContainsText("successMessage", "success");
    }
}
