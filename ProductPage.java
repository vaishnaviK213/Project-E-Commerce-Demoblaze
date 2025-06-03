package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {
 WebDriver driver;
 By firstProduct = By.xpath("//*[@id='tbodyid']/div[1]/div/a/img");
 By addToCart = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
 public ProductPage(WebDriver driver) {
 this.driver = driver;
 }
 public void clickFirstProduct() {
 driver.findElement(firstProduct).click();
 }
 public void clickAddToCart() {
 driver.findElement(addToCart).click();
 }
}