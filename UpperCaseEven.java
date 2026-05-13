package week3.day4;

public class UpperCaseEven {
public static void main(String[] args) {
    String name ="changeme";
    char[] array= name.toCharArray();
   for(int i =0;i<array.length-1;i++){
    if (i%2==0) {
        System.out.print(array[i]);
    } else {
       System.out.print(Character.toUpperCase(array[i])); 
    }
   }
}
}
