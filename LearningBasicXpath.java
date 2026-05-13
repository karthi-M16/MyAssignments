package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningBasicXpath {
public static void main(String[] args) {
     ChromeDriver driver = new ChromeDriver();
   driver.get("https://leaftaps.com/opentaps/control/main");
   driver.manage().window().maximize();
   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
   driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
   driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
   driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
   driver.findElement(By.xpath("(//input[contains(@id,'firstName')])[1]")).sendKeys("Ragnar");
   driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("lothbrok");
   driver.findElement(By.xpath("(//input[contains(@id,'createContactForm')])[10]")).sendKeys("8798778643");
   driver.findElement(By.xpath("//input[@name='submitButton']")).click();


}
}
