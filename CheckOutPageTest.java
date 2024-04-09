package RunCases;

import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckOutPageTest extends BaseTest{
    @Test
    public void testCheckoutPage() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckOutPage checkoutPage = new CheckOutPage(driver);
        loginPage.navigateToHomePage("standard_user", "secret_sauce");
        homePage.navigateToProductPage();
        productPage.addToCard();
        productPage.moveToCartPage();
        checkoutPage.navigateToCheckoutInfo();
    }
}

