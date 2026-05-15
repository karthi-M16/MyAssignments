package week3.day6;

public class Occurence {
public static void main(String[] args) {
  String str = "hello";
  for(int i = 0; i<str.length();i++){
char ch=str.charAt(i);
int count = str.length()-str.replace(String.valueOf(ch),"").length();
System.out.println(ch+ ":" +count);
  }
 
 
  }
}
