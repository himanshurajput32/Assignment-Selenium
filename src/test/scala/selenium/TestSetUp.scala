package selenium

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

/**
  * Created by knoldus on 3/2/17.
  */
trait TestSetUp {

  val BASE_URL = "http://www.flipkart.com/"
  val EMAIl = "himanshu.rajput32@gmail.com"
  val password = "ajay9536"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 10)



}
