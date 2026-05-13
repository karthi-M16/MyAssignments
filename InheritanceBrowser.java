package week3.day2;

public class InheritanceBrowser {

public void openUrl(){
System.out.println("open the url");
}

public void closeBrowser(){
System.out.println("close the browser");
}

public void navigateBack(){
System.out.println("navigate to the previous page");
}


    public static void main(String[] args) {
    InheritanceBrowser obj = new InheritanceBrowser();
    obj.openUrl();
    obj.closeBrowser();
    obj.navigateBack();
}
}
