package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Factory to instantiate a WebDriver object. It returns an instance of the driver (local invocation).
 */
public class WebDriverFactory {

	/* Browsers constants */
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String INTERNET_EXPLORER = "ie";
	public static final String SAFARI = "safari";

	private WebDriverFactory() {
	}

	/*
	 * Returns the WebDriver instance of the given browser name
	 *
	 * @param browser : Browser representing the local browser to open
	 *
	 * @return WebDriver instance
	 */
	public static WebDriver getInstance(String browserName) {

		WebDriver webDriver = null;

		if (CHROME.equals(browserName)) {
			WebDriverManager.chromedriver().setup();
			webDriver = new ChromeDriver();
		} else if (FIREFOX.equals(browserName)) {
			WebDriverManager.firefoxdriver().setup();
			webDriver = new FirefoxDriver();
		} else if (INTERNET_EXPLORER.equals(browserName)) {
			WebDriverManager.iedriver().setup();
			webDriver = new InternetExplorerDriver();
		} else if (SAFARI.equals(browserName)) {
			WebDriverManager.iedriver().setup();
			WebDriverManager.safaridriver().setup();
			webDriver = new SafariDriver();
		} else {
			throw new IllegalArgumentException("Unsupported browser!");
		}

		return webDriver;
	}
}
