import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class HYDMetro {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\5EIN\\OneDrive\\Desktop\\selenium jar files\\chromedriver_win32\\Chromedriver.exe");
      WebDriver w= new ChromeDriver();
      w.get("https://www.ltmetro.com/");
      w.manage().window().maximize();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
   Thread.sleep(3000);
      w.findElement(By.id("from-st-name")).click();
      Select From = new Select(w.findElement(By.id("from-st-name")));
      From.selectByVisibleText("Kukatpally");
      w.findElement(By.id("to-st-name")).click();
      Select To= new Select(w.findElement(By.id("to-st-name")));
      To.selectByVisibleText("Dilshuknagar");
      w.findElement(By.name("submit-find-trip")).click();
      Thread.sleep(2000);
      TakesScreenshot Fare= (TakesScreenshot) w;
      File scr= Fare.getScreenshotAs(OutputType.FILE);
      Files.copy(scr, new File("C:\\Users\\5EIN\\OneDrive\\Desktop\\Fare1"));
      w.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[1]")).click();
      
      // About Us Mouse Hover
      Actions AboutUs= new Actions(w);
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();// Who WE ARE
      Thread.sleep(2000);
      JavascriptExecutor js= (JavascriptExecutor) w;
      js.executeScript("window.scrollTo(0,1000)");
      Thread.sleep(2000);
      w.findElement(By.xpath("//a[contains(text(),'Know More About L&T Metro')]")).click();
      Set <String> Windows= w.getWindowHandles();
      Iterator <String> it=Windows.iterator();
      String parent_window= it.next();    
      String child_window= it.next(); 
      w.switchTo().window(child_window);                        // Know More About L&T Metro Window
      Thread.sleep(2000);
      w.close();
      w.switchTo().window(parent_window);
      Thread.sleep(1000);
      w.findElement(By.linkText("Know More About Keolis")).click();
      Set <String> Window1= w.getWindowHandles();
      Iterator <String> it1=Window1.iterator();
      String parent_window1= it1.next();    
      String child_window1= it1.next(); 
      w.switchTo().window(child_window1);                           // Know More About Keolis Window 
      Thread.sleep(2000);
      w.close();
      w.switchTo().window(parent_window1);
      js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(2000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();    // ABOUT HMR
      Thread.sleep(2000); 
      JavascriptExecutor js1= (JavascriptExecutor) w;
      js1.executeScript("window.scrollTo(0,300)");
      Thread.sleep(2000);
      js1.executeScript("window.scrollTo(300,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(2000);
      w.findElement(By.linkText("MD’s Desk")).click();                                                         // MD’s Desk
      Thread.sleep(2000); 
      JavascriptExecutor js2= (JavascriptExecutor) w;
      js2.executeScript("window.scrollTo(0,300)");
      Thread.sleep(2000);
      js2.executeScript("window.scrollTo(300,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(2000);
      w.findElement(By.linkText("Green Metro")).click();                                                         // Green Metro
      Thread.sleep(2000); 
      JavascriptExecutor js3= (JavascriptExecutor) w;
      js3.executeScript("window.scrollTo(0,500)");
      Thread.sleep(2000);
      js3.executeScript("window.scrollTo(500,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(2000);
      w.findElement(By.linkText("Gallery")).click();                                                         // Gallery
      Thread.sleep(2000); 
      JavascriptExecutor js4= (JavascriptExecutor) w;
      js4.executeScript("window.scrollTo(0,500)");
      Thread.sleep(2000);
      js4.executeScript("window.scrollTo(500,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(1000);
      w.findElement(By.linkText("CSR")).click();                                                         // CSR
      Thread.sleep(2000); 
      JavascriptExecutor js5= (JavascriptExecutor) w;
      js5.executeScript("window.scrollTo(0,500)");
      Thread.sleep(2000);
      js5.executeScript("window.scrollTo(500,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
      AboutUs.moveToElement(w.findElement(By.linkText("About Us"))).perform();
      Thread.sleep(1000);
      w.findElement(By.linkText("Careers")).click();                                                         // Careers
      Thread.sleep(2000); 
      JavascriptExecutor js6= (JavascriptExecutor) w;
      js6.executeScript("window.scrollTo(0,300)");
      Thread.sleep(2000);
      w.findElement(By.linkText("Current Opportunities")).click();
      Set <String> Window6= w.getWindowHandles();
      Iterator <String> it6=Window6.iterator();
      String parent_window6= it6.next();    
      String child_window6= it6.next(); 
      w.switchTo().window(child_window6);                                                   //How to Use Metro Guide Pdf page   
      Thread.sleep(2000); 	
      w.close();
      w.switchTo().window(parent_window6);
      Thread.sleep(1000);
      js6.executeScript("window.scrollTo(300,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();  
      
     // Travel Mousehover
      Actions Travel=new Actions(w);
     Travel.moveToElement(w.findElement(By.linkText("Travel"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//a[contains(text(),'Plan Your Trip')]")).click();    // Plan Your Trip
      Thread.sleep(1000);
      JavascriptExecutor js7=(JavascriptExecutor) w;
      js7.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      Thread.sleep(2000);
      js7.executeScript("window.scrollTo(document.body.scrollHeight,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();  
      Travel.moveToElement(w.findElement(By.linkText("Travel"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click(); // Train Timings
      Thread.sleep(1000);
      JavascriptExecutor js8=(JavascriptExecutor) w;
      js8.executeScript("window.scrollTo(0,300)");
      Thread.sleep(2000);
      js8.executeScript("window.scrollTo(300,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();  
      Travel.moveToElement(w.findElement(By.linkText("Travel"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[3]/a[1]")).click();             // Metro Network Map
      Thread.sleep(1000);
      JavascriptExecutor js9=(JavascriptExecutor) w;
      js9.executeScript("window.scrollTo(0,600)");
      Thread.sleep(2000);
      js9.executeScript("window.scrollTo(600,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
      Travel.moveToElement(w.findElement(By.linkText("Travel"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[4]/a[1]")).click();     // Metro Stations
      Thread.sleep(1000);
      JavascriptExecutor js10=(JavascriptExecutor) w;
      js10.executeScript("window.scrollTo(0,500)");
      Thread.sleep(2000);
      w.findElement(By.xpath("//select[@id='station-list']")).click();
      Select Stationlist = new Select(w.findElement(By.xpath("//select[@id='station-list']")));
      Stationlist.selectByVisibleText("Begumpet");                              //Selecting Station as Begumpet
      w.findElement(By.id("station-sub")).click();
      Thread.sleep(1000);
      js10.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
      Thread.sleep(1000);
      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();
      Thread.sleep(1000);
      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]/a[1]")).click();
      w.findElement(By.linkText("Home")).click();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     Travel.moveToElement(w.findElement(By.linkText("Travel"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[5]/a[1]")).click();           // Metro Trains
      Thread.sleep(1000);
      JavascriptExecutor js11=(JavascriptExecutor) w;
      js11.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      Thread.sleep(2000);
      w.findElement(By.xpath("//a[contains(text(),'Rolling Stock')]")).click();                                       //Rolling Stock button
      Thread.sleep(1000);
     Set <String> Window2= w.getWindowHandles();
     Iterator <String> It2= Window2.iterator();
     String Parent_window2= It2.next();
     String Child_window2= It2.next();
     w.switchTo().window(Child_window2);
      Thread.sleep(2000);
       w.close();
     w.switchTo().window(Parent_window2);
      js11.executeScript("window.scrollTo(document.body.scrollHeight,0)");
      w.navigate().back(); 
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
      Travel.moveToElement(w.findElement(By.linkText("Travel"))).perform();
      Thread.sleep(1000);
      w.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[6]/a[1]")).click();      // Last Mile Connectivity
      Thread.sleep(1000);
      JavascriptExecutor js12=(JavascriptExecutor) w;
      js12.executeScript("window.scrollTo(0,700)");
      Thread.sleep(2000);
      js12.executeScript("window.scrollTo(700,0)");
      w.navigate().back(); 
      Thread.sleep(1000);
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
      
     //Fare&Ticketing Mousehover
    Actions FareTicketing= new Actions(w);
      FareTicketing.moveToElement(w.findElement(By.linkText("Fare & Ticketing"))).perform();
      Thread.sleep(1000);
      w.findElement(By.linkText("Ticketing")).click();                                                     // Ticketing
      Thread.sleep(2000);
      w.findElement(By.linkText("Fare Chart")).click();                                               //Fare Chart Buttton
      Thread.sleep(1000);
      Set <String> Window5= w.getWindowHandles();
      Iterator <String> it5= Window5.iterator();
      String Parent_window5= it5.next();
      String Child_window5= it5.next();
      w.switchTo().window(Child_window5);
      Thread.sleep(2000);
      w.close();
      w.switchTo().window(Parent_window5);
      Thread.sleep(1000);
      JavascriptExecutor js13=(JavascriptExecutor) w;
      js13.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      Thread.sleep(2000);
      js13.executeScript("window.scrollTo(document.body.scrollHeight,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
      FareTicketing.moveToElement(w.findElement(By.linkText("Fare & Ticketing"))).perform();
      Thread.sleep(1000);
      w.findElement(By.linkText("Penalty Charter")).click();                                                 //Penalty Charter
      Thread.sleep(2000);
      JavascriptExecutor js14=(JavascriptExecutor) w;
      js14.executeScript("window.scrollTo(0,800)");
      Thread.sleep(2000);
      js14.executeScript("window.scrollTo(800,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
      FareTicketing.moveToElement(w.findElement(By.linkText("Fare & Ticketing"))).perform();
      Thread.sleep(1000);
      w.findElement(By.linkText("Offences & Penalties")).click();                                           //Offences & Penalties
      Thread.sleep(2000);
      JavascriptExecutor js15=(JavascriptExecutor) w;
      js15.executeScript("window.scrollTo(0,800)");
      Thread.sleep(2000);
      js15.executeScript("window.scrollTo(document.body.scrollHeight,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
      FareTicketing.moveToElement(w.findElement(By.linkText("Fare & Ticketing"))).perform();
      Thread.sleep(1000);
      w.findElement(By.linkText("Find Trip Details")).click();                                             //Find Trip Details
      Thread.sleep(2000);
      JavascriptExecutor js16=(JavascriptExecutor) w;
      js16.executeScript("window.scrollTo(0,500)");
      Thread.sleep(2000);
      w.findElement(By.id("from-st-name")).click();
      Select From1= new Select(w.findElement(By.id("from-st-name")));
      From1.selectByVisibleText("Malakpet");
      w.findElement(By.id("to-st-name")).click();
      Select To1 = new Select(w.findElement(By.id("to-st-name")));
      To1.selectByVisibleText("Chikkadapally");
      w.findElement(By.name("submit-find-trip")).click();
      Thread.sleep(2000);
      w.findElement(By.xpath("//body/div[@id='fareTimeModalbox']/div[1]/div[1]/div[3]/button[1]")).click();
      w.findElement(By.xpath("//a[contains(text(),'View fare chart')]")).click();
      Set <String> Window7= w.getWindowHandles();
      Iterator <String> it7=Window7.iterator();
      String parent_window7= it7.next();    
      String child_window7= it7.next(); 
      w.switchTo().window(child_window7);                                                   //view fare chart window   
      Thread.sleep(2000); 	
      w.close();
      w.switchTo().window(parent_window7);
      Thread.sleep(1000);
     js16.executeScript("window.scrollTo(document.body.scrollHeight,0)");
      w.navigate().back();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 

     //Customerservice Mouse Hover
     Actions Customerservice = new Actions(w);
      Customerservice.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Customer Service')]"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("Feedback")).click();                                                                     //Feedback
     Thread.sleep(2000);
     JavascriptExecutor js17= (JavascriptExecutor) w;
     js17.executeScript("window.scrollTo(0,300)");
     Select TypeofFeedback= new Select(w.findElement(By.id("feedback_type")));
     TypeofFeedback.selectByVisibleText("Appreciation");
     w.findElement(By.name("fb-name")).sendKeys("Charan");
     w.findElement(By.name("fb-email")).sendKeys("charanandchitti@gmail.com");
     w.findElement(By.name("fb-mobile")).sendKeys("7997418568");
     w.findElement(By.name("fb-comments")).sendKeys("Good");
   w.findElement(By.name("fb-submit")).click();
     Thread.sleep(1000);
     js17.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.findElement(By.linkText("Home")).click();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();  
     Customerservice.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Customer Service')]"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("Lost & Found")).click();                                                             //Lost & Found
     Thread.sleep(2000);
     JavascriptExecutor js18= (JavascriptExecutor) w;
     js18.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     Thread.sleep(1000);
     js18.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.navigate().back(); 
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     Customerservice.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Customer Service')]"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("Passenger Charter")).click();                                                           //Passenger Charter
     Thread.sleep(2000);
     JavascriptExecutor js19= (JavascriptExecutor) w;
     js19.executeScript("window.scrollTo(0,200)");
     Thread.sleep(2000);
     w.findElement(By.xpath("//a[contains(text(),'View pdf')]")).click();
     Thread.sleep(2000);
     Set <String> Window4= w.getWindowHandles();
     Iterator <String> it4=Window4.iterator();
     String parent_window4= it4.next();     
     String child_window4= it4.next(); 
     w.switchTo().window(child_window4);                                                   //How to Use Metro Guide Pdf page   
     Thread.sleep(2000); 	
     w.close();
     w.switchTo().window(parent_window4);
     Thread.sleep(1000);
     js19.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     Customerservice.moveToElement(w.findElement(By.xpath("//a[contains(text(),'Customer Service')]"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("Our Commitment")).click();                                                              //Our Commitment
     Thread.sleep(2000);
     JavascriptExecutor js20= (JavascriptExecutor) w;
     js20.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     Thread.sleep(1000);
     js20.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
     
     //How to Use
     Actions Howtouse = new Actions(w);
   Howtouse.moveToElement(w.findElement(By.linkText("How To Use"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("User Guide")).click();                                                             //User Guide
     Thread.sleep(2000);
     JavascriptExecutor js21= (JavascriptExecutor) w;
     js21.executeScript("window.scrollTo(0,500)");
     Thread.sleep(2000);
     w.findElement(By.xpath("//div[contains(text(),'(PDF)')]")).click();
     Thread.sleep(2000);
     Set <String> Window18= w.getWindowHandles();
     Iterator <String> it18=Window18.iterator();
     String parent_window18= it18.next();     
     String child_window18= it18.next(); 
     w.switchTo().window(child_window18);                                                  
     Thread.sleep(5000); 	
     w.close();
     w.switchTo().window(parent_window18);
     Thread.sleep(1000);

     
     js21.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
    Howtouse.moveToElement(w.findElement(By.linkText("How To Use"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("Safety and Security")).click();                                                    //Safety and Security
     Thread.sleep(2000);
     JavascriptExecutor js22= (JavascriptExecutor) w;
     js22.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     Thread.sleep(1000); 
     js22.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click();
     Howtouse.moveToElement(w.findElement(By.linkText("How To Use"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("Do’s and Don’ts")).click();                                                     //Do’s and Don’ts
     Thread.sleep(2000);
     JavascriptExecutor js23= (JavascriptExecutor) w;
     js23.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     w.findElement(By.id("next")).click();                                                         //next button
     Thread.sleep(2000);
     w.findElement(By.id("next")).click();
     Thread.sleep(2000);
     w.findElement(By.id("next")).click();
     Thread.sleep(2000);
     w.findElement(By.id("next")).click();
     Thread.sleep(2000);
     w.findElement(By.id("next")).click(); 
     Thread.sleep(2000);
     w.findElement(By.linkText("Home")).click();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     Howtouse.moveToElement(w.findElement(By.linkText("How To Use"))).perform();
     Thread.sleep(1000);
     w.findElement(By.linkText("FAQs")).click();                                                                 //FAQs
     Thread.sleep(2000);
     JavascriptExecutor js24= (JavascriptExecutor) w;
     js24.executeScript("window.scrollTo(0,700)");
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();
     Thread.sleep(2000);
     w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/h4[1]/a[1]")).click();
     Thread.sleep(2000);
     w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/h4[1]/a[1]")).click();
     Thread.sleep(2000);
     js24.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.findElement(By.linkText("Home")).click();
      w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
    w.findElement(By.linkText("Contact Us")).click();
      JavascriptExecutor js25= (JavascriptExecutor) w;
      js25.executeScript("window.scrollTo(0,300)");
      Thread.sleep(1000);
      js25.executeScript("window.scrollTo(300,0)");
      w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     w.findElement(By.linkText("Media")).click();
     JavascriptExecutor js26= (JavascriptExecutor) w;
     js26.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     w.findElement(By.linkText("View All")).click();
     w.findElement(By.linkText("2020")).click();
     Thread.sleep(2000);
     JavascriptExecutor js31= (JavascriptExecutor) w;
     js31.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     js31.executeScript("window.scrollTo(300,0)");
     w.findElement(By.linkText("2019")).click();
     Thread.sleep(2000);
     JavascriptExecutor js32= (JavascriptExecutor) w;
     js32.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js32.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2018")).click();
     Thread.sleep(2000);
     JavascriptExecutor js33= (JavascriptExecutor) w;
     js33.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js33.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2017")).click();
     Thread.sleep(2000);
     JavascriptExecutor js34= (JavascriptExecutor) w;
     js34.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js34.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2016")).click();
     Thread.sleep(2000);
     JavascriptExecutor js35= (JavascriptExecutor) w;
     js35.executeScript("window.scrollTo(0,500)");
     Thread.sleep(1000);
     js35.executeScript("window.scrollTo(500,0)");
     w.findElement(By.linkText("2015")).click();
     Thread.sleep(2000);
     JavascriptExecutor js36= (JavascriptExecutor) w;
     js36.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js36.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2014")).click();
     Thread.sleep(2000);
     JavascriptExecutor js37= (JavascriptExecutor) w;
     js37.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js37.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2013")).click();
     Thread.sleep(2000);
     JavascriptExecutor js38= (JavascriptExecutor) w;
     js38.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js38.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2012")).click();
     Thread.sleep(2000);
     JavascriptExecutor js39= (JavascriptExecutor) w;
     js39.executeScript("window.scrollTo(0,1000)");
     Thread.sleep(1000);
     js39.executeScript("window.scrollTo(1000,0)");
     w.findElement(By.linkText("2011")).click();
     Thread.sleep(2000);
     JavascriptExecutor js40= (JavascriptExecutor) w;
     js40.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     js40.executeScript("window.scrollTo(300,0)");
     w.findElement(By.linkText("Home")).click();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     w.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/a[3]")).click();
     Set <String> Window17= w.getWindowHandles();
     Iterator <String> it17=Window17.iterator();
     String parent_window17= it17.next();     
     String child_window17= it17.next(); 
     w.switchTo().window(child_window17);                                                   // Andriod play store installation page 	   
     Thread.sleep(5000); 	
     w.close();
     w.switchTo().window(parent_window17);
     Thread.sleep(1000);
     w.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/a[2]")).click();	
     Set <String> Window8= w.getWindowHandles();
     Iterator <String> it8=Window8.iterator();
     String parent_window8= it8.next();     
     String child_window8= it8.next(); 
     w.switchTo().window(child_window8);                                                   // Andriod play store installation page 	   
     Thread.sleep(5000); 	
     w.close();
     w.switchTo().window(parent_window8);
     Thread.sleep(1000);
     JavascriptExecutor js27= (JavascriptExecutor) w;
     js27.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/a[1]/figure[1]")).click();
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     w.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/a[1]/figure[1]")).click();
     JavascriptExecutor js28= (JavascriptExecutor) w;
     js28.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     w.findElement(By.linkText("View pdf")).click();
     Set <String> Window9= w.getWindowHandles();
     Iterator <String> it9=Window9.iterator();
     String parent_window9= it9.next();     
     String child_window9= it9.next(); 
     w.switchTo().window(child_window9);                                                  //Commerical shot pdf  
     Thread.sleep(2000); 	
     w.close();
     w.switchTo().window(parent_window9);
     Thread.sleep(1000);
     js28.executeScript("window.scrollTo(300,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     w.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/a[1]/figure[1]")).click();
     JavascriptExecutor js29= (JavascriptExecutor) w;
     js29.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     w.findElement(By.linkText("View PDF")).click();                                    // Covid 19 pdf
     Set <String> Window10= w.getWindowHandles();
     Iterator <String> it10=Window10.iterator();
     String parent_window10= it10.next();     
     String child_window10= it10.next(); 
     w.switchTo().window(child_window10);                                                  
     Thread.sleep(2000); 	
     w.close();
     w.switchTo().window(parent_window10);
     Thread.sleep(1000);
     js29.executeScript("window.scrollTo(document.body.scrollHeight,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     w.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[5]/div[4]/div[1]/div[1]/div[1]/a[1]/figure[1]")).click();
     JavascriptExecutor js30= (JavascriptExecutor) w;
     js30.executeScript("window.scrollTo(0,300)");
     Thread.sleep(1000);
     js30.executeScript("window.scrollTo(300,0)");
     w.navigate().back();
     w.findElement(By.xpath("//body/div[@id='public_notification']/div[1]/div[1]/div[3]/button[1]")).click(); 
     w.findElement(By.xpath("//body/footer[1]/div[4]/ul[1]/li[1]/a[1]/span[1]")).click();
     Set <String> Window11= w.getWindowHandles();
     Iterator <String> it11=Window11.iterator();
     String parent_window11= it11.next();     
     String child_window11= it11.next(); 
     w.switchTo().window(child_window11);                                                  
     Thread.sleep(7000); 	
     w.close();
     w.switchTo().window(parent_window11);
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/footer[1]/div[4]/ul[1]/li[2]/a[1]/span[1]")).click();
     Set <String> Window12= w.getWindowHandles();
     Iterator <String> it12=Window12.iterator();
     String parent_window12= it12.next();     
     String child_window12= it12.next(); 
     w.switchTo().window(child_window12);                                                  
     Thread.sleep(7000); 	
     w.close();
     w.switchTo().window(parent_window12);
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/footer[1]/div[4]/ul[1]/li[3]/a[1]/span[1]")).click();
     Set <String> Window13= w.getWindowHandles();
     Iterator <String> it13=Window13.iterator();
     String parent_window13= it13.next();     
     String child_window13= it13.next(); 
     w.switchTo().window(child_window13);                                                  
     Thread.sleep(7000); 	
     w.close();
     w.switchTo().window(parent_window13);
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/footer[1]/div[4]/ul[1]/li[4]/a[1]/span[1]")).click();
     Set <String> Window14= w.getWindowHandles();
     Iterator <String> it14=Window14.iterator();
     String parent_window14= it14.next();     
     String child_window14= it14.next(); 
     w.switchTo().window(child_window14);                                                  
     Thread.sleep(5000); 	
     w.close();
     w.switchTo().window(parent_window14);
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/footer[1]/div[4]/ul[1]/li[5]/a[1]/span[1]")).click();
     Set <String> Window15= w.getWindowHandles();
     Iterator <String> it15=Window15.iterator();
     String parent_window15= it15.next();     
     String child_window15= it15.next(); 
     w.switchTo().window(child_window15);                                                  
     Thread.sleep(7000); 	
     w.close();
     w.switchTo().window(parent_window15);
     Thread.sleep(1000);
     w.findElement(By.xpath("//body/footer[1]/div[4]/ul[1]/li[6]/a[1]/span[1]")).click();
     Set <String> Window16= w.getWindowHandles();
     Iterator <String> it16=Window16.iterator();
     String parent_window16= it16.next();     
     String child_window16= it16.next(); 
     w.switchTo().window(child_window16);                                                  
     Thread.sleep(7000); 	
     w.close();
     w.switchTo().window(parent_window16);
     Thread.sleep(1000);
     w.findElement(By.linkText("My Account")).click();
     w.findElement(By.id("RegisterModel_FirstName")).sendKeys("Charan");
     w.findElement(By.id("RegisterModel_LastName")).sendKeys("bandari");
     w.findElement(By.id("RegisterModel_MobileNo")).sendKeys("7997418568");
     w.findElement(By.id("RegisterModel_Email")).sendKeys("chanranandchitti@gmail.com");
     w.findElement(By.id("RegisterModel_Password")).sendKeys("AKKi@123");
     w.findElement(By.id("RegisterModel_ConfirmPassword")).sendKeys("AKKi@123");
     w.findElement(By.name("register")).click();
     Thread.sleep(1000);
    w.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
      w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
     w.findElement(By.id("LoginModel_Email")).sendKeys("chanranandchitti@gmail.com");
     w.findElement(By.id("LoginModel_Password")).sendKeys("AKKi@123");
     w.findElement(By.name("login")).click();
     Thread.sleep(2000);
     w.findElement(By.linkText("Log out")).click();
     w.close();
    
      
      
      
      
      
      
      
      
      
      
	}

}
