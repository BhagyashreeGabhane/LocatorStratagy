import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class LocatorStrategy {
    public static void main(String []args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://foodstore-1.web.app/");
        //click on the card button
        WebElement we= driver.findElement(By.cssSelector(".headerBtns .cart"));
        we.click();
        //close the cart button
        driver.findElement(By.className("closeCartBtn")).click();
        //click on sign in button
        driver.findElement(By.linkText("signin")). click();
        Thread.sleep(2500);
        driver.navigate().back();
        //send city as amravati

        Thread.sleep(2500);
        driver.findElement(By.className("cityInput")).sendKeys("Aamravati");
         //click on search button
        driver.findElement(By.id("citySearchbtn")).click();

    }
}
