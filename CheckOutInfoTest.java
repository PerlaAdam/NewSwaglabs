package RunCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FinishPage;
import pages.LoginPage;

public class CheckOutInfoTest extends BaseTest {

    @Test
    public void testCheckoutInfo(){
        new LoginPage(driver).navigateToHomePage("standard_user", "secret_sauce")
                .navigateToProductPage()
                .addToCard()
                .moveToCartPage();

        boolean AssertMainFunctionality = driver.findElement(FinishPage.getAssertFinisButton()).isDisplayed();
        Assert.assertTrue(AssertMainFunctionality);

        //    LoginPage loginPage = new LoginPage(driver);
        //  HomePage homePage = new HomePage(driver);
        //  ProductPage productPage = new ProductPage(driver);
        // CheckoutPage checkoutPage = new CheckoutPage(driver);
        // CheckoutInfo checkoutInfo = new CheckoutInfo(driver);
        //  OverViewPage overViewPage = new OverViewPage(driver);
        // FinishPage finishPage = new FinishPage();loginPage.navigateToHomePage("standard_user", "secret_sauce");
        // homePage.navigateToProductPage();
        //productPage.addToCard();
        // productPage.moveToCartPage();
        //  checkoutPage.navigateToCheckoutInfo();
        // checkoutInfo.navigateToCheckoutReview();
        //  overViewPage.clickOnFinisButton();
        // boolean AssertMainFunctionality = driver.findElement(finishPage.getAssertFinisButton()).isDisplayed();
        //Assert.assertTrue(AssertMainFunctionality);
    }
}

