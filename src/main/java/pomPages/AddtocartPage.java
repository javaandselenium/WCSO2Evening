package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	
	@FindBy(id="add")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartBtn;
	
	public WebElement getAddBtn() {
		return addBtn;
	}

	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartButton() {
		addtocartBtn.click();
	}

}
