package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Apparel {

    @FindBy(xpath = "//img[@title='Show products in category Apparel']")
    WebElement tabApparel;

    @FindBy(xpath = "//img[@title='Show products in category Clothing']")
    WebElement tabClothes;

    @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Nike Tailwind Loose Short-Sleeve Running Shirt']")
    WebElement tabShowDetails;

    @FindBy(xpath = "//button[@id='add-to-cart-button-27']")
    WebElement btnAddToCart;

    @FindBy(xpath = "//p[@class='content']")
    WebElement alertMessage;

    @FindBy(xpath = "//select[@id='product_attribute_11']")
    WebElement chooseSize;

    @FindBy(xpath = "//input[@id='product_enteredQuantity_27']")
    WebElement addMultiple;

    public Apparel(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void noSizeSelection() throws InterruptedException {
        tabApparel.click();
        tabClothes.click();
        tabShowDetails.click();
        Thread.sleep(2000);
        btnAddToCart.click();
        Thread.sleep(2000);
        String text = alertMessage.getText();
        Assert.assertEquals(text, "Please select Size");
    }
    public void addChoiseSize() throws InterruptedException {
        tabApparel.click();
        tabClothes.click();
        tabShowDetails.click();
        Thread.sleep(2000);
        chooseSize.sendKeys("Small");
        btnAddToCart.click();
    }
    public void addMultipleProduct() throws InterruptedException {
        tabApparel.click();
        tabClothes.click();
        tabShowDetails.click();
        Thread.sleep(2000);
        chooseSize.sendKeys("Small");
        addMultiple.sendKeys("5");
        btnAddToCart.click();
    }

    public void lessThanOneProduct() throws InterruptedException {
        tabApparel.click();
        tabClothes.click();
        tabShowDetails.click();
        Thread.sleep(2000);
        addMultiple.clear();
        addMultiple.sendKeys("0");
        btnAddToCart.click();
        String text = alertMessage.getText();
        Assert.assertEquals(text, "Quantity should be positive");

    }
}
