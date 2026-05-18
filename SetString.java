package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetString {
public static void main(String[] args) {
   // Set <String> teamA = new HashSet<String>();
  //  Set <String> teamA = new TreeSet<String>();
    Set <String> teamA = new LinkedHashSet<String>();

    teamA.add("rajini");                                      //doesn't allow duplicates
    teamA.add("kamal");                                       //hahSet--> random
    teamA.add("vikram");                                      //TreeSet--> alphabets
    teamA.add("kamal");                                       //linkedHashSet-->given insertion order
    System.out.println(teamA);

   int count = teamA.size();
   System.out.println(count);

// converting SetString to ListString

List <String> team = new ArrayList<String>(teamA);

team.add("surya");
team.add("dhanush");
System.out.println(team);

String name =team.get(2);
System.out.println(name);
   
   


    
    
}
}
