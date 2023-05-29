package TestRunner;
import Pages.Apparel;
import Setup.Setup;
import org.testng.annotations.Test;


public class ApparelTestRunner extends Setup {
    @Test (groups = "Purchase")
    public void noSizeSelection() {
        driver.get("https://demo.nopcommerce.com/");
        Apparel apparel = new Apparel(driver);
        try {
            apparel.noSizeSelection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (groups = "Purchase")
    public void addChoiseSize() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        Apparel apparel = new Apparel(driver);
        apparel.addChoiseSize();
    }
    @Test (groups = "Purchase")
    public void addMultipleProduct() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        Apparel apparel = new Apparel(driver);
        apparel.addMultipleProduct();
    }
    @Test (groups = "Purchase")
    public void productQuantity() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        Apparel apparel = new Apparel(driver);
        apparel.lessThanOneProduct();
        }

    }

