package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week1.day1.chrome;

public class irctc {
public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.irctc.co.in/ ");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();

    Set <String> allAddress = driver.getWindowHandles();
    System.out.println("the Addresses are :"+allAddress);

    List <String> tabs = new ArrayList<String>(allAddress);


    String tab2 = tabs.get(1);
    driver.switchTo().window(tab2);

    String title =driver.getTitle();
    System.out.println("tab2 title is"+" "+title);

    
    String tab1 = tabs.get(0);
    driver.switchTo().window(tab1);

    driver.close();

    

   
}
}
