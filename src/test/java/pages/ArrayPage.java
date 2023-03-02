package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.DriverManager;

public class ArrayPage {

	public ArrayPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	WebDriver driver = DriverManager.getDriver();
	
@FindBy(xpath="//a[@href='array']")				WebElement getStartedArrayBtn;
@FindBy(xpath="//a[text()='Arrays in Python']")	WebElement arraysinPythonLink;
@FindBy(xpath="//a[text()='Arrays Using List']")	WebElement arraysUsingListLink;
@FindBy(xpath="//a[text()='Basic Operations in Lists']")	WebElement basicOper_inListLink;
@FindBy(xpath="//a[text()='Applications of Array'] ") WebElement applicationOfArraylink;
@FindBy(partialLinkText = "Try here")					WebElement tryHereBtn;
@FindBy(xpath="//*[@class='input']") WebElement textEditor;
@FindBy(xpath="//*[@type='button']") WebElement runBtn;
@FindBy(xpath="//*[@type='submit']") WebElement submitBtn;

@FindBy(partialLinkText = "Practice Questions")   WebElement practiceQnLink;
@FindBy(xpath ="//a[text()='Search the array']" )WebElement searchtheArrayLink;

@FindBy(xpath ="//a[text()='Max Consecutive Ones']") WebElement maxConsecutiveLink;

@FindBy(xpath ="//a[text()='Find Numbers with Even Number of Digits']") WebElement findEvenLink;

@FindBy(xpath ="//a[text()='Squares of  a Sorted Array']") WebElement sortedArrayLink;

public void clickGetStartedBtn() {
	getStartedArrayBtn.click();
}

public void clickarraysinPythonLink(){
	arraysinPythonLink.click();	
}

public void clickarraysUsingListLink(){
	arraysUsingListLink.click();	
}

public void clickbasicOper_inListLink() {
	basicOper_inListLink.click();
}

public void clickapplicationOfArraylink() {
	applicationOfArraylink.click();
}

public void clicktryHereBtn() {
	tryHereBtn.click();
}

public void clickrunBtn() {
	
	runBtn.click();
}

public void clicksubmitBtn() {
	submitBtn.click();
}

public void clickpracticeQnLink() {
	practiceQnLink.click();
}

public void clicksearchtheArrayLink() {
	searchtheArrayLink.click();
}
public void clickmaxConsecutiveLink() {
	maxConsecutiveLink.click();
}
public void clickfindEvenLink() {
	findEvenLink.click();
}
public void clicksortedArrayLink() {
	 sortedArrayLink.click();
}





}