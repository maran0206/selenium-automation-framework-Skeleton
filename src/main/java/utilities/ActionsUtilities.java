package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtilities {

	static Actions action = new Actions(Browser.Driver());

	public static void mouseHover(WebDriver driver, WebElement ele) {
		action.moveToElement(ele).perform();
	}

	public static void doubleClick(WebDriver driver, WebElement ele) {
		action.doubleClick(ele).perform();
	}

	public static void rightClick(WebDriver driver, WebElement ele) {
		action.contextClick(ele).perform();
	}

	public static void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		action.dragAndDrop(src, dest).perform();
	}

}
