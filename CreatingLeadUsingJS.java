package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatingLeadUsingJS {
public static void main(String[] args) {
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();

driver.findElement(By.id("username")).sendKeys("DemoCSR");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JP.Morgan");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
WebElement dropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select IndustryDD = new Select(dropDown);
IndustryDD.selectByVisibleText("Finance");
driver.findElement(By.name("submitButton")).click();
}
}
