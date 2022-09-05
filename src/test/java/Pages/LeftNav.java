package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Education']")
    private WebElement Education;
    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement EducationSetup;
    @FindBy(xpath = "(//span[text()='Subject Categories'])")
    private WebElement SubjectCategories;

    @FindBy(linkText = "Document Types")
    private WebElement DocumentTypes;

    @FindBy(id = "mat-select-value-15")
    private WebElement Stage;

    WebElement myElement;

    public void findAndClick(String strElement) // 2. aşama
    {
        switch (strElement) {
            case "setupOne": myElement = setupOne;break;
            case "parameters": myElement = parameters;break;
            case "DocumentTypes": myElement = DocumentTypes;break;
            case "Stage": myElement = Stage;break;
            case "Education" : myElement=Education; break;
            case "EducationSetup" : myElement=EducationSetup; break;
            case "SubjectCategories" : myElement=SubjectCategories; break;

        }
        // burda string isimden webelemente ulaşıcam
        clickFunction(myElement);
    }


}
