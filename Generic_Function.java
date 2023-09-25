package GenericFunction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_Function {
	
	
       WebDriver driver;

	public  Generic_Function(WebDriver driver) {
		this.driver=driver;
	}
	
public WebElement findElement(By username) {
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		return element;
		
	}

public List<WebElement> findElements(By byElement) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byElement));

    return elements;
	
	

}}
