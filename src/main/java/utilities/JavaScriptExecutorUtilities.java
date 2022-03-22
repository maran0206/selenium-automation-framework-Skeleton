package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtilities {

	public static JavascriptExecutor js = (JavascriptExecutor) Browser.Driver();

	/**
	 * To scroll to a particular webelement
	 * 
	 * @param driver
	 * @param ele
	 */
	public static void scrollToElement(WebDriver driver, WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	/**
	 * The scrollBy() method scrolls the document by the specified number of pixels
	 * 
	 * @param driver
	 * @param start  - starting pixel
	 * @param end    - Ending pixel to stop scrolling
	 */
	public static void scrollBy(WebDriver driver, int start, int end) {
		js.executeScript("scrollBy(" + start + "," + end + ")");
	}

	/**
	 * The scrollTo() method scrolls the document to the specified coordinates
	 * 
	 * @param driver
	 * @param start
	 * @param end
	 */
	public static void scrollTo(WebDriver driver, int start, int end) {
		js.executeScript("scrollTo(" + start + "," + end + ")");
	}

	/**
	 * To click an element
	 * 
	 * @param driver
	 * @param ele
	 */

	public static void clickElement(WebDriver driver, WebElement ele) {
		js.executeScript("arguments[0].click();", ele);
	}

}
