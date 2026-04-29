package week1.day4;
import java.util.Scanner;
public class ScannerString {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("type");
    String a=input.nextLine();
    //next() => single word in a line
    //nextline => whole line
    System.out.println(a);

}
}
