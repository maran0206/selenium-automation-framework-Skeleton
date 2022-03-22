package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	private final String H1_TAG = "h1";

	@FindBy(tagName = H1_TAG)
	private WebElement h1Element;

	public String getH1() {
		return h1Element.getText();
	}
}
