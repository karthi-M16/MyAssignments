package week1.day5;

import java.util.Scanner;

public class PalindromeDigits3 {
public static void main(String[] args) {
    int num;
    Scanner x=new Scanner(System.in);
   System.out.println("enter the number");
   num=x.nextInt();
   {
   int r,sum=0,temp;
   int n;
   int reverse=0;
   temp=num;
    while (num>0) {
        r=num%10;
        sum=(sum*10)+r;
        n=num/10;
         reverse=reverse*10+num%10;
        num=num/10;
    }
   if (sum==temp) {
    System.out.println("palindrome"+" "+reverse);
   } else {
    System.out.println("not a palindrome"+" "+reverse);
   }
   }
}
}
