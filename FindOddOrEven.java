package week1.day6;

import java.util.Scanner;

public class FindOddOrEven {
public static void main(String[] args) {
    int n;
    Scanner x = new Scanner(System.in);
    System.out.println("Enter the number ");
    n=x.nextInt();{
            if (n%2!=0) {
                System.out.println(n +" "+ "is ODD");
            } else {
                System.out.println(n +" "+ "is EVEN");
            }
        }
    }
}

