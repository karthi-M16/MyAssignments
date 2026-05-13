package week3.day2;

public class InheritanceEdge extends InheritanceBrowser{

public void takeSnaps(){
    System.out.println("take high quality snaps ");
}

public void clearCookies(){
    System.out.println("clear cookies");

}
 public static void main(String[] args) {
    InheritanceEdge obj3 =new InheritanceEdge();
    obj3.clearCookies();


}
}
