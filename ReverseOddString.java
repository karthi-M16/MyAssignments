package week3.day3;

public class ReverseOddString {
public static void main(String[] args) {
    String goal = "karthi is learning selenium with the help of vineeth";
    String[] split = goal.split(" ");
    for(int i=0;i<split.length;i++){
        if (i%2==0) {
            char[] array = split[i].toCharArray();
            for(int j = array.length-1;j>=0;j--){
            System.out.print(array[j]);}}
            else{
                System.out.print(split[i]);
            }
            System.out.print(" ");}
        }
    
   }

