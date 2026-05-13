package week3.day2;

public class InheritanceChrome extends InheritanceBrowser {

public void openIncognito(){
System.out.println("open incognito");
}

public void clearCache(){
System.out.println("clear cache");
}


    public static void main(String[] args) {
    InheritanceChrome obj1 = new InheritanceChrome();
    obj1.openUrl();
    obj1.closeBrowser();
    obj1.navigateBack();
}
}
