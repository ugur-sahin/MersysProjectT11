package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    WebElement myElement;
    public void findAndClick(String strElement ) // 2. aşama
    {
        switch (strElement){
            case "setupOne" : myElement=setupOne; break;
            case "parameters" : myElement=parameters; break;

        }
        // burda string isimden webelemente ulaşıcam
        clickFunction(myElement);
    }


}
