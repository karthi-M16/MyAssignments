package home.assignment;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
  
  int num;
  int a=0,b=1;
  Scanner x =new Scanner(System.in);
  System.out.println("Enter the range");

 num =x.nextInt();
  System.out.print(a+" "+b+" ");
  int nextterm;

  for(int i=2;i<num;i++){
    nextterm=a+b;
    a=b;
    b=nextterm;
    System.out.print(nextterm+" ");
  }

}
  }

