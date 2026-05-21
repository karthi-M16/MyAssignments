package week4.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {
public static void main(String[] args) {
    
 // "HCL, Wipro, Aspire Systems, CTS"

Set<String> company = new TreeSet<String>();

company.add("HCL");
company.add("Wipro");
company.add("Aspire systems");
company.add("CTS");

List<String> comp = new ArrayList<String>(company);

System.out.println(comp);
System.out.println(comp.size());

for(int i= comp.size()-1; i>=0; i--){
   
    System.out.print(comp.get(i)+" ");
}



}
}
