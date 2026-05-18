package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class ListString {
  public static void main(String[] args) {

    List <String> cricketer = new ArrayList<String>();         // output--> []
    System.out.println(cricketer);
        
    cricketer.add("sachin");                                   //output follws 0 1 2 ...        
    cricketer.add("dhoni");                                    // allows duplicates
    cricketer.add("rohit");
    cricketer.add("sachin");
    cricketer.add("kholi"); 
    System.out.println(cricketer);


    //size metod ==> to count the element                   
    int sizeOfTheList =cricketer.size();                       //return --> integer
    System.out.println(sizeOfTheList);

    //get method ==> to retrieve a value  
    String value =cricketer.get(3);                            // return --> String
    System.out.println(value);

    //remove method
    cricketer.remove(3);
    System.out.println(cricketer);                        
    int soc =cricketer.size();                             //checking size after the removal
    System.out.println(soc);


    List <String> footballer = new ArrayList<String>();
    footballer.addAll(cricketer);                          //changing from one to another list
    System.out.println(footballer);


    footballer.remove(0);
    System.out.println(footballer);

    
    // it just copied from cricketer to footballer
    // NOT CONVERTS

    int size = cricketer.size();                        
    System.out.println(size);


     int size1 = footballer.size();                        
    System.out.println(size1);

    cricketer.clear();
    System.out.println(cricketer);                       //elements in cricketer removed
                                                         // if we try to get  from crick list
    String player1 = footballer.get(0);                  //'IndexOutOfBoundException'
    System.out.println(player1);


    footballer.add("Ashwin");
    System.out.println(footballer);


   


}
}