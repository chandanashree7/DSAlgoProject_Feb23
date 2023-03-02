package util;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class DriverManager {
		
		private static WebDriver driver ;
		public final static int TIMEOUT = 2;

		private DriverManager() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
		}


		public static void openPage(String url) {
			driver.get(url);
		}
		public static String getTitle() {
			return driver.getTitle();
		}
		public static void NavBack() {
			driver.navigate().back();
		}
		public static WebDriver getDriver() {
			return driver;
		}

}
