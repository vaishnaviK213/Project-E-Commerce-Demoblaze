package tests;

import pages.HomePage;
import pages.RegistrationPage;
import utils.BaseTest;
public class RegistrationTest extends BaseTest {
 public static void main(String[] args) throws InterruptedException {
 RegistrationTest test = new RegistrationTest();
 test.setup();
 HomePage home = new HomePage(test.driver);
 RegistrationPage register = new RegistrationPage(test.driver);
 Thread.sleep(3000);
 home.clickSignUp();
 Thread.sleep(3000);
 register.register("Shreyash", "Shreyash@213");
 Thread.sleep(3000);
 test.tearDown();
 }
}