package week3.day6;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
    int[] array = {1,4,3,2,8,6,7};
    Arrays.sort(array);
for(int i=0;i<array.length-1;i++){

    if (array[i+1]!=array[i]+1) {
        
    
  System.out.println(array[i]+1);}
}
  
}

}
