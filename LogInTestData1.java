package week3.day4;

public class LogInTestData1 extends TestData{


public void enterUsername(){
    System.out.println("karthi9876");
}


public void enterPassword(){
    System.out.println("Password@7654");
}


    public static void main(String[] args) {
    LogInTestData1 obj1 = new LogInTestData1();
    obj1.enterCredentials();
    obj1.enterUsername();
    obj1.enterPassword();
}
}
