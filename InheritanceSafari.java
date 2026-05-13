package week3.day2;

public class InheritanceSafari extends InheritanceBrowser {

public void readerMode(){
    System.out.println("reader mode");
}

public void fullScreenMode(){
    System.out.println("full screen mode");
}

    public static void main(String[] args) {
    InheritanceSafari obj3 = new InheritanceSafari();
    obj3.closeBrowser();
}
}
