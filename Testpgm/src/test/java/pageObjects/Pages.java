package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Hooks;

public class Pages {
    private WebDriver driver;

    // Locators
    private By searchFieldLocator = By.id("keyword");
    private By locationDropdownLocator = By.id("location");
    private By searchButtonLocator = By.id("search");
    private By searchResultLocator = By.xpath("//*[@data-test='search-result-query']");
    private By sortButtonLocator = By.id("sort");
    private By distanceLocator = By.id("distance");
    private By moresearchLocator = By.id("searchOptionsBtn");
    private By payRangeLocator = By.id("payRange");
    
    
    public Pages() {
    	this.driver=Hooks.getDriver();

    }

    public void searchTerm(String searchTerm) {
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchTerm);
    }

    public void selectLocation(String location) {
        if (!location.isEmpty()) {
            WebElement locationDropdown = driver.findElement(locationDropdownLocator);
            locationDropdown.sendKeys(location);
        }
    }

    public void clickSearchButton() throws InterruptedException {
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
        Thread.sleep(2000); 
    }

    public void checkSearchResult(String searchTerm ) {
        String actualResult = driver.findElement(searchResultLocator).getText().replaceAll("\\d", "");
        String expectedResult= "jobs found ";
        		assert actualResult.contains(expectedResult);
    }

    public void sortByDate() {
        WebElement sortButton = driver.findElement(sortButtonLocator);
        sortButton.click();
        Select dropdown = new Select(sortButton);
        dropdown.selectByVisibleText("Date Posted (newest)");
    }
    public void selectDistance() {
        WebElement distanceButton = driver.findElement(distanceLocator);
        distanceButton.click();
        Select dropdown = new Select(distanceButton);
        dropdown.selectByVisibleText("+10 Miles");
    }
    public void selectmoreSearch() {
        WebElement moresaerchButton = driver.findElement(moresearchLocator);
        moresaerchButton.click();
       
    }
    public void payRange() {
        WebElement payrangeSearch = driver.findElement(payRangeLocator);
        payrangeSearch.click();
        Select dropdown = new Select(payrangeSearch);
        dropdown.selectByVisibleText("£30,000 to £40,000");
       
    }
    public void negativeSearchResult1(String string ) {
        String actualResult = driver.findElement(searchResultLocator).getText();
        String expectedResult= "No result found for "+string+"";
        assertEquals(actualResult,expectedResult);
    }
    public void negativeSearchResult2(String string ) {
        String actualResult = driver.findElement(searchResultLocator).getText();
        String expectedResult= ""+string+"";
        assertEquals(actualResult,expectedResult);
    }
}
