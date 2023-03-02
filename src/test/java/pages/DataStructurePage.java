package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DataStructurePage {
	@FindBy(partialLinkText = "data-structure-introduction") WebElement getStartedDSLink;
	@FindBy(xpath ="//a[@href='time-complexity']") WebElement timeComplexityLink;
	@FindBy(xpath ="//a[@href='/tryEditor']") WebElement tryhereBtn;
	//@FindBy(xpath ="//a[text() ='Practice Questions']") WebElement practiceQnLink;
	
	@FindBy(xpath ="//button[@type='button']") WebElement runBtn;
	
	@FindBy(xpath ="//div[@class='input']") WebElement textEditor;
	
	
	public void clickGetStartedDS() throws InterruptedException {
	
	getStartedDSLink.click();
	}
	
	public void clicktimeComplexityLink() throws InterruptedException {
		
		timeComplexityLink.click();
		}
public void clicktryhereBtn() throws InterruptedException {
		
	tryhereBtn.click();
	
		}public void runBtn() throws InterruptedException {
			
			runBtn.click();
			}
	
}
