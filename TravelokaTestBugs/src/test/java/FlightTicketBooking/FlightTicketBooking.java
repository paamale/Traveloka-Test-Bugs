package FlightTicketBooking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightTicketBooking {
    WebDriver driver;
    @Given("^User Open the chrome launch the application login page dan Dashboard page$")
    public void User_Open_the_chrome_launch_the_application_login_page_dan_Dashboard_page() throws Throwable {
        //    System.out.println("User Open the chrome launch the application login page dan Dashboard page");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.traveloka.com/id-id/tiket-pesawat");
    }
    @When("^the user clicks the transport button then the user selects Airfare$")
    public void the_user_clicks_the_transport_button_then_the_user_selects_Airfare() throws Throwable {
        //    System.out.println("This User the user clicks the Transport button then the user selects Airfare");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/div/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div[3]/div[16]/div/div/div[2]/div[2]/div"));
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[4]/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[4]/div/div[1]/div/div[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"4-PREMIUM_ECONOMY\"]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[3]/div[2]/div[2]")).click();
    }
}
