package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTextName {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> tagName = driver.findElements(By.tagName("a"));

       // System.out.println(tagName) --> gives ref address[dynamic]

        int length= tagName.size();       // 0 1 2 3......
        //System.out.println(count); --> no of a tag texts

         for(int i =0; i<=length-1;i++){
          System.out.println(tagName.get(i).getText());
        }

        // to get a text name of an element
          WebElement element = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));
          String ele = element.getText();
          System.out.println(ele);

         

         
       
    }

}
