package home.assignment;

import java.util.Scanner;

public class IsPrime {
public static void main(String[] args) {
 int num;
 Scanner x=new Scanner(System.in);
 System.out.println("enter the number");
 num=x.nextInt();
 boolean prime=true;
 for(int i=2;i<num;i++){
    if(num%i==0){
        prime=false;
    }

 }
 if (prime) {
    System.out.println("it is a prime number");
 } else {
    System.out.println("it is not a prime number");
 }
    }

                                       }
                    
