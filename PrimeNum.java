package week1.day7;

public class PrimeNum {
    public static void main(String[] args) { //prime --> factors, 1 and itself.
int num=71;
boolean prime=true;
for(int i=2;i<num;i++) {
    if(num%i==0){                            //29/2,29/3,29/4......29/28 
                                             //num%i==0 [is i a factor of num]
        prime=false;}                         //if the remainder is 0, prime=false
    
}
        if(prime) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("not a prime number");
        }
    
}

}
