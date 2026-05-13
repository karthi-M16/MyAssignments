package week3.day4;

public class UpperCaseOdd {
public static void main(String[] args) {
    String name = "karthi is back";
    
    char[] obj1 =name.toCharArray();
     for(int i =0;i<=obj1.length-1;i++){
        if(i%2==0){
    System.out.print(Character.toUpperCase(obj1[i]));}
    
    else{
        System.out.print(obj1[i]);
    }
}


}

}