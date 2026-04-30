package week1.day6;



public class FibonacciSimple {
public static void main(String[] args) {
 int n=1771;
 int org=n;
 int rev=0;
 for(int temp=n; temp >0;temp=temp/10){
   
    rev=rev*10+n%10;
     n=n/10;
   
 }
{
    System.out.println(org==rev ? "palindrome"+" "+rev : "not a palindrome"+" "+rev);
}
}
}

 
 
 
 




