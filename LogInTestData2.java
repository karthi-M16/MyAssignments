package week3.day4;

public class LogInTestData2 extends TestData {

public void enterUsername(){
    System.out.println("karthi@123");
}




public void enterPassword(){
    System.out.println("Passcode@9080");
}


    public static void main(String[] args) {
    LogInTestData2 obj =new LogInTestData2();
    obj.enterCredentials();
    obj.enterUsername();
    obj.enterPassword();
    
}
}
