package week3.day5;

public class Replace {
public static void main(String[] args) {
String str = "jhon ordered strawberry milkshake";  
System.out.println(str.replaceAll("strawberry milkshake","black cofee"));

String value ="india91";                                   //to remove non-numeric values
System.out.println(value.replaceAll("[^0-9]",""));

String value1 ="india91";
System.out.println(value1.replaceAll("[0-9]",""));         //to remove numbers


String str1 ="fat";
System.out.println(str1.replace('a','i'));

    }
}

