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
    @FindBy(xpath = "//span[text()='Human Resources']")             //ry
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")             //ry
    private WebElement setupThree;
    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")             //ry
    private WebElement positionCategories;
    @FindBy(linkText = "School Setup")             //ry
    private WebElement schoolSetup;
    @FindBy(linkText = "Locations")             //ry
    private WebElement locations;
    @FindBy(linkText = "Grade Levels")             //ry
    private WebElement gradeLevels;
    @FindBy(linkText = "Discounts")
    private WebElement Discounts;


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
            case "humanResources" :     myElement = humanResources; break;
            case "setupThree" :     myElement = setupThree; break;
            case "positionCategories" :     myElement = positionCategories; break;
            case "schoolSetup" :     myElement = schoolSetup; break;
            case "locations" :     myElement = locations; break;
            case "gradeLevels" :     myElement = gradeLevels; break;
            case "Discounts" :     myElement = Discounts; break;

        }
        // burda string isimden webelemente ulaşıcam
        clickFunction(myElement);
    }


}
