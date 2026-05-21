package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling_HA {
public static void main(String[] args) throws InterruptedException {
  
   
   ChromeDriver driver = new ChromeDriver();
   // EdgeDriver driver = new EdgeDriver();
    driver.get(" http://leaftaps.com/opentaps/control/login ");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

    //Alert popUp = driver.switchTo().alert();
   // popUp.accept();


    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    driver.findElement(By.linkText("Merge Contacts")).click();

    driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
   
    Set <String> allContact =driver.getWindowHandles();
    System.out.println(allContact);

    List<String> allTab = new ArrayList<String>(allContact);
    int count= allTab.size();
    System.out.println(count);

    String fromTab =allTab.get(1);
    driver.switchTo().window(fromTab);

    driver.findElement(By.xpath("//a[@class='linktext']")).click();

    Thread.sleep(3000);

    int size = allTab.size();
    System.out.println(size);
    System.out.println(allContact);

    String mainTab = allTab.get(0);
    driver.switchTo().window(mainTab);

    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

    Thread.sleep(5000);

   Set<String> newAllTAbsAddrs = driver.getWindowHandles();

   List<String> newAllTabs = new ArrayList<String>(newAllTAbsAddrs);
    int newCount = newAllTabs.size();
    System.out.println(newCount);
    System.out.println(newAllTAbsAddrs);

    Thread.sleep(3000);

    String toTab =newAllTabs.get(1);
    driver.switchTo().window(toTab);

    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

    Thread.sleep(3000);

    String mainTab1 =newAllTabs.get(0);
    driver.switchTo().window(mainTab1);

    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

     Alert alertPopUp = driver.switchTo().alert();
     alertPopUp.accept();

     String actualTitle = driver.getTitle();
     System.out.println("Actual Title"+" : "+actualTitle);


     String expectedTitle ="View Contact | opentaps CRM";

     if (actualTitle.equals(expectedTitle)) {
        System.out.println("The title is VERIFIED");
     }

     driver.quit();

    
}
}
