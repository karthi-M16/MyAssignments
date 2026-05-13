package week3.day1;

import java.util.Arrays;

public class ArrayLiteralNumbers {
public static void main(String[] args) {
    int[] num = {1,23,3,4,4,67,8,87,86,56,5};
    int length = num.length;
    System.out.println( "there ara "+length+" "+"numbers");
    Arrays.sort(num);
    System.out.println("lowest number is"+ " "+num[0] );
    System.out.println("Highest number is"+" "+num[length-1]);

}
}
