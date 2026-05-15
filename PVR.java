package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PVR {
public static void main(String[] args) throws InterruptedException {
    EdgeDriver driver = new EdgeDriver();
    driver.get("https://www.pvrcinemas.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")).click();
    driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
    driver.findElement(By.xpath("//span[text()='Cinema']")).click();
    driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[1]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li")).click();
    driver.findElement(By.xpath("(//button[contains(@class,'p-button p-component sc')])[4]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='sc-kCuUfV iBvycX reject-terms']")).click();
    driver.findElement(By.xpath("//span[@class='seat-current-pvr' and contains(@id,'SL.SILVER')]")).click();
    driver.findElement(By.xpath("//button[@class='sc-bbbBoY kbsOBB btn-proceeded']")).click();
    Thread.sleep(2000);
    WebElement ms = driver.findElement(By.xpath("//div[@class='movies-summary']"));
    String movieSummary = ms.getText();
    System.out.println(movieSummary);
    WebElement si =driver.findElement(By.xpath("//div[@class='seat-info']"));
    String seatInfo =si.getText();
    System.out.println(seatInfo);
    WebElement tp =driver.findElement(By.xpath("//div[@class='ticket-prices']"));
    String ticketInfo = tp.getText();
    System.out.println(ticketInfo);
    driver.findElement(By.xpath("//button[text()='Continue']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
    Thread.sleep(2000);
    String title =driver.getTitle();
    System.out.println(title);
    driver.close();




}
}
