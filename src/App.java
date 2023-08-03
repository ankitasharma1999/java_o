import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Set the driver path
System.setProperty("webdriver.edge.driver", "C:\\Users\\SHIVAMBEMBEY\\Desktop\\selenium\\selanium-s9\\src\\drivers\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");

Thread.sleep(1000);

WebElement firstName = driver.findElement(By.name("firstName"));
firstName.sendKeys("Ankita");

Thread.sleep(1000);

WebElement lastName = driver.findElement(By.name("lastName"));
lastName.sendKeys("Sharma");

Thread.sleep(1000);

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("1234567890");

Thread.sleep(1000);

WebElement username = driver.findElement(By.name("userName"));
username.sendKeys("ankitasharma@gmail.com");

Thread.sleep(1000);

WebElement address = driver.findElement(By.name("address1"));
address.sendKeys("Sector-10");

Thread.sleep(1000);

WebElement city = driver.findElement(By.name("city"));
city.sendKeys("Panchkula");

Thread.sleep(1000);

WebElement state = driver.findElement(By.name("state"));
state.sendKeys("Haryana");

Thread.sleep(1000);

WebElement pinCode = driver.findElement(By.name("postalCode"));
pinCode.sendKeys("134109");

Thread.sleep(1000);

Select countryList = new Select(driver.findElement(By.name("country")));
countryList.selectByValue("INDIA");

Thread.sleep(1000);

WebElement loginUserName = driver.findElement(By.id("email"));
loginUserName.sendKeys("ankitasharma@gmail.com");

Thread.sleep(1000);

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("ankita@1122");

Thread.sleep(1000);

WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
confirmPassword.sendKeys("ankita@1122");

Thread.sleep(1000);

WebElement submit = driver.findElement(By.name("submit"));
submit.click();

Thread.sleep(5000);
driver.quit();
}
}