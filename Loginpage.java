package Demo;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import GenericFunction.Generic_Function;

public class Loginpage extends Generic_Function{
	
	
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		super(driver);
	}
	

	By heading=By.xpath("//div[@class='login_logo']");
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.id("login-button");
	
    By HomeHeading=By.xpath("//div[@class='product_label']");
    By menubtn=By.xpath("//div[@class='bm-burger-button']");

    By all_item=By.id("inventory_sidebar_link");
    By about=By.id("about_sidebar_link");
    By Logout=By.id("logout_sidebar_link");
    By restapp=By.id("reset_sidebar_link");
    By crossBtn=By.xpath("//div[@class='bm-cross-button']");
    
    By cartbtn=By.xpath(" //div[@class='shopping_cart_container']/a");
    By cartvalue=By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");
    
    By backbag=By.xpath("//a[@id='item_4_title_link']");
    By bagname=By.xpath("//div[@class='inventory_details_name']");
    By Bag_desc=By.xpath("//div[@class='inventory_details_desc']");
    By price=By.xpath("//div[@class='inventory_details_price']");
    By addTocart=By.xpath("//button[@class='btn_primary btn_inventory']");
    By backbtn=By.xpath("//button[@class='inventory_details_back_button']");
    
    
    By bikelight=By.xpath("//a[@id='item_0_title_link']");
    By bikename=By.xpath("//div[@class='inventory_details_name']");
    By Bike_desc=By.xpath("//*[@id='inventory_item_container']/div/div/div/div[2]");
    By bike_price=By.xpath("//*[@id='inventory_item_container']/div/div/div/div[3]");
        
    By addtocart_btn=By.xpath("//div[@id='inventory_container']/div/div[2]/div[3]/button");
    
    By cartitem1_name=By.xpath("//*[@class='cart_item']//div[2]/a[@id='item_4_title_link']/div");
    By cartitem2_name=By.xpath("//*[@class='cart_item']//div[2]/a[@id='item_0_title_link']/div");
     
    By product1name=By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By product2name=By.xpath("//*[@id=\"item_0_title_link\"]/div");

    
    By cartprice=By.cssSelector(".inventory_item_price");
    By removebtn=By.xpath("//button[@class='btn_secondary cart_button']");  
    By checkoutbtn=By.xpath("//*[@class='btn_action checkout_button']");
    
    
    By info_heading=By.xpath("//*[@class='subheader']");
    By first_name=By.xpath("//input[@id='first-name']");
    By last_name=By.xpath("//input[@id='last-name']");
    By postal_code=By.xpath("//input[@id='postal-code']");
    By cont_btn=By.xpath("//*[@class='btn_primary cart_button']");
    
    By checkoutItem=By.xpath("//*[@class='inventory_item_name']");
    
    By paymsg=By.xpath("//*[@class='summary_info_label']");
    By payment1= By.xpath("//*[@class='summary_value_label']");
    By shipmsg = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[3]");
    By delv=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]");
    By item_total=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]");
    By tax=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]");
    By total=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]");
    
    By finish=By.xpath("//a[@class='btn_action cart_button']");

    By msg=By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    By crossbtn=By.xpath("//*[@id='menu_button_container']/div/div[3]/div/button");
    By Menu=By.xpath("//div[@class='bm-burger-button']");
    By logout=By.xpath("//*[@id='logout_sidebar_link']");
    
   public void verify() {
	   
	    boolean HeadingDisplayed= findElement(heading).isDisplayed();
        Assert.assertTrue(HeadingDisplayed,"Heading is not displayed");
        System.out.println("heading is dispalyed");

       
        boolean useridisplayed= findElement(username).isDisplayed();
        Assert.assertTrue(useridisplayed,"the userid field is not dispalyed");
        System.out.println("username is dispalyed");

        boolean PasswordIsDisplayed= findElement(password).isDisplayed();
        Assert.assertTrue(PasswordIsDisplayed,"the password field is not dispalyed");
        System.out.println("password is dispalyed");

        
        boolean LoginIsDisplayed= findElement(loginbtn).isDisplayed();
        Assert.assertTrue(LoginIsDisplayed,"the Login button is not dispalyed");
        System.out.println("login is dispalyed");


  }
    
	public void enterUsername(String user) {
		
		findElement(username).sendKeys(user);
	}


	public void enterPassword(String pass) {
		findElement(password).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		
		findElement(loginbtn).click();
		
		boolean MsgDisplayed= findElement(HomeHeading).isDisplayed();
        Assert.assertTrue(MsgDisplayed,"Logo is not dispalyed");
        System.out.println(" Sucessfully login and Product is Displyed");

		
	}
	
	
	
	public void ClickMenubtn() {
		findElement(menubtn).click();
	}
     
	public void verifyMenuItems() {
		
		boolean allItemisDisplayed= findElement(all_item).isDisplayed();
        Assert.assertTrue(allItemisDisplayed,"all item is not displayed");
        System.out.println("All Item is dispalyed");

       
        boolean Aboutisplayed= findElement(about).isDisplayed();
        Assert.assertTrue(Aboutisplayed,"about is not dispalyed");
        System.out.println("About is dispalyed");

        boolean LogoutIsDisplayed= findElement(Logout).isDisplayed();
        Assert.assertTrue(LogoutIsDisplayed,"Logout is not dispalyed");
        System.out.println("Logout is dispalyed");

        
        boolean restappIsDisplayed= findElement(restapp).isDisplayed();
        Assert.assertTrue(restappIsDisplayed,"rest app is not dispalyed");
        System.out.println("Rest app dispalyed");	
		
	}
		
	
	public void crossbtn() 
	{
		findElement(crossBtn).click();
	}
	
	public void verifyCartbutton() {
		
		boolean cartIsDisplayed= findElement(cartbtn).isDisplayed();
        Assert.assertTrue(cartIsDisplayed,"cart is not dispalyed");
        System.out.println("cart icon is displyed");	
		
	}
	
	
	public void Click_SauceLabsBackpack() 
	{
			findElement(backbag).click();
	
	}
	
	public void bagname() 
	{
		String text=findElement(bagname).getText();
		System.out.println(text);
		
	}
	public void GetDesc_Backpack() 
    {
	String desc= findElement(Bag_desc).getText();
	System.out.println(desc);
	}
		
	public void GetPrice_backbag() 
	
	{
	String price2= findElement(price).getText();
	System.out.println(price2);
	findElement(backbtn).click();
	}
	
	public void Click_addCart()
	
	{

	findElement(addTocart).click();
	
	}
	
	
	
    public void Click_SauceLab_bikeLight() {
		findElement(bikelight).click();
	
	}
	
  public void bikelightname() 
	{
	String lightname= findElement(bikename).getText();
	System.out.println(lightname);
		
	}
	public void GetDesc_Bikelight() throws InterruptedException 
  {
		Thread.sleep(2000);
	String desc_light= findElement(Bike_desc).getText();
	System.out.println(desc_light);
	}
		
	public void GetPrice_bikelight() 
       {
	String price1= findElement(bike_price).getText();
	System.out.println(price1);
	findElement(backbtn).click();

	}
	
	public void Click_addCart1()
	{
	findElement(addtocart_btn).click();
    }
	
	    public void VerifyCartItem() {
		 String itemCountText = findElement(cartvalue).getText();
		 int actualItemCount = Integer.parseInt(itemCountText.replaceAll("[^\\d]", ""));
         Assert.assertEquals(actualItemCount,2, "Cart item count is not as expected.");
         System.out.println("Product is added to the cart"); 
		
	}
	
	public void verifyItemsIncart() throws InterruptedException {
		
		findElement(cartbtn).click();
		
		String productCart=findElement(cartitem1_name).getText();
        String productCart1=findElement(cartitem2_name).getText();
        Thread.sleep(2000);
        
	    String product=findElement(product1name).getText();
        String product1=findElement(product2name).getText();

	    if (productCart.equals(product) && productCart1.equals(product1)) {
          System.out.println("Cart items and added items match!");
           } else {
	        System.out.println("Cart items and added items are not match!");
	    }
	}
		
	public void checkPriceAndRemove() {
	   
	    
		List<WebElement> priceElements = findElements(By.xpath("//*[@class=\"inventory_item_price\"]"));

	    for (WebElement priceElement : priceElements) {

	        String priceText = priceElement.getText().replaceAll("[^0-9.]", "");

	        double priceValue = Double.parseDouble(priceText);

	        if (priceValue > 20.0) {

	            WebElement removeButton = priceElement.findElement(By.xpath("//*[@class=\"btn_secondary cart_button\"]"));

	            removeButton.click();

	            System.out.println("Removed item with price > 20: " + priceValue);
	            
	        }

	    }
}
	
	public void checkout() {
        findElement(checkoutbtn).click();

	}
	
	public void InfoVerification() {
		
		
		boolean Infomsgheading= findElement(info_heading).isDisplayed();
        Assert.assertTrue(Infomsgheading,"Heading is not displayed");
		String infomsg=findElement(info_heading).getText();
        System.out.println(infomsg);
        
        boolean FirstnameIsdisplayed= findElement(first_name).isDisplayed();
        Assert.assertTrue(FirstnameIsdisplayed,"firstname field is not dispalyed");
        System.out.println("First name field is dispalyed");

        boolean LastnameIsDisplayed= findElement(last_name).isDisplayed();
        Assert.assertTrue(LastnameIsDisplayed,"lastname field is not dispalyed");
        System.out.println("last name is dispalyed");

        
        boolean ContIsDisplayed= findElement(cont_btn).isDisplayed();
        Assert.assertTrue(ContIsDisplayed,"Login button is not dispalyed");
        System.out.println("Continue is dispalyed");


	}
	
       public void FirstName(String firstname) 
       {
		
		findElement(first_name).sendKeys(firstname);
	   }

	   public void Last_name(String lastname) {
		findElement(last_name).sendKeys(lastname);
	   }
	
	   public void Postal_code(String postal) {
			findElement(postal_code).sendKeys(postal);
		   }
	
	   public void Clickcontinue() {
		   findElement(cont_btn).click();
	   }
	
	   public void VerifyCheckoutDetails() {
		   
		   boolean IsItemIsDisplayed= findElement(payment1).isDisplayed();
	        Assert.assertTrue(IsItemIsDisplayed,"item is not displayed");
	        String msg1=findElement(paymsg).getText();
	        System.out.println(msg1);
			String infomsg=findElement(payment1).getText();
	        System.out.println(infomsg);
	        
	        String payinfo=findElement(shipmsg).getText();
	        System.out.println(payinfo);
	        boolean shippingIsDisplayed= findElement(delv).isDisplayed();
	        Assert.assertTrue(shippingIsDisplayed,"shipping address is not displayed");
	        String card=findElement(paymsg).getText();
	        System.out.println(card);
	        
	        String totalitem=findElement(item_total).getText();
	        System.out.println(totalitem);
	        String taxinfo=findElement(tax).getText();
	        System.out.println(taxinfo);
	        String total1=findElement(total).getText();
	        System.out.println(total1);
	          
		   
	   }
	public void clickFinish() {
		findElement(finish).click();
	}
	
	public void MsgVerification() {
		 boolean MsgIsDisplayed= findElement(msg).isDisplayed();
	        Assert.assertTrue(MsgIsDisplayed,"Message is not displayed");
	        String msgsucess=findElement(msg).getText();
	        System.out.println(msgsucess);
	}
	
	public void ClickCross() {
		findElement(Menu).click();
	}
	
     public void logout() {
 		findElement(logout).click();

     }
	
}